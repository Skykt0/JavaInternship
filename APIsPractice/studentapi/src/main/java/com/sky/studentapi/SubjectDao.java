package com.sky.studentapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SubjectDao 
{
	Connection conn;
	public SubjectDao()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","sky3102");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String addSubject(int id, Subjects subject)
	{
		PreparedStatement pstmt;
		int noOfSubjects;		
		try
		{
			pstmt = conn.prepareStatement("select *from student where studentid = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) 
			{
				noOfSubjects = rs.getInt("subjectNumber");
				System.out.println(noOfSubjects);
				if(noOfSubjects >= 6) {
					return "maximum subjects are 6 can't add more";
				}
			
				pstmt = conn.prepareStatement("insert into subjects(studentid, subjectName, subjectMarks, subjectType) values(?,?,?,?)");
				pstmt.setInt(1, id);
				pstmt.setString(2, subject.getSubjectName());
				pstmt.setInt(3, subject.getSubjectMarks());
				pstmt.setString(4, subject.getSubjectType());
				pstmt.executeUpdate();	
				
				noOfSubjects++;
				pstmt = conn.prepareStatement("update student set subjectNumber = ? where studentid = ?");
				pstmt.setInt(1, noOfSubjects);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Successfully added";
	}
	
	public String deleteSubject(int id, String subName)
	{
		PreparedStatement pstmt;
		try
		{	
			pstmt = conn.prepareStatement("select *from student where studentid = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				int noOfSubjects = rs.getInt("subjectNumber");
				if(noOfSubjects<=0) {
					return "there is nothing to delete";
				}
				
				pstmt = conn.prepareStatement("delete from subjects where studentid = ? and subjectName = ?");
				pstmt.setInt(1, id);
				pstmt.setString(2, subName);
				pstmt.executeUpdate();
				
				noOfSubjects--;
				pstmt = conn.prepareStatement("update student set subjectNumber = ? where studentid = ?");
				pstmt.setInt(1, noOfSubjects);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Successfully deleted";
	}
	
	public String updateSubject(int id, String subjectName, Subjects subject)
	{
		PreparedStatement pstmt;
		try
		{
			pstmt = conn.prepareStatement("update subjects set subjectName = ?, subjectMarks = ?, subjectType = ? where studentid = ? and subjectName = ?");
			pstmt.setString(1, subject.getSubjectName());
			pstmt.setInt(2, subject.getSubjectMarks());
			pstmt.setString(3, subject.getSubjectType());
			pstmt.setInt(4, id);
			pstmt.setString(5, subjectName);
			int cnt = pstmt.executeUpdate();
			if(cnt == 1) {
				return "Successfully updated";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Unsuccessful";
	}
}
