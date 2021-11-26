package com.sky.studentapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao 
{
	Connection conn;
	
	public StudentDao()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","sky3102");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public List<Student> getStudents()
	{
		System.out.println("helloo..");
		List<Student> students = new ArrayList<>();
		
		try 
		{
			PreparedStatement pstmt = conn.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Student s = new Student();
				
				s.setStudentId(rs.getInt(1));
				s.setStudentName(rs.getString(2));
				s.setStudentEmailId(rs.getString(3));
				s.setStudentClass(rs.getString(4));
				s.setSubjectNumber(rs.getInt(5));
				s.setAge(rs.getInt(6));
				s.setStudentMobile(rs.getString(8));
				
				if(s.getSubjectNumber() == 6)
				{
					s.setMax(true);
				}
				
				students.add(s);
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return students;
	}
	
	public Student getStudent(int id)
	{
		Student s = new Student();
		System.out.println("hello getbyid");
		PreparedStatement pstmt;
		try 
		{
			pstmt = conn.prepareStatement("select *from student where studentid = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				s.setStudentId(rs.getInt(1));
				s.setStudentName(rs.getString(2));
				s.setStudentEmailId(rs.getString(3));
				s.setStudentClass(rs.getString(4));
				s.setSubjectNumber(rs.getInt(5));
				s.setAge(rs.getInt(6));
				if(s.getSubjectNumber() == 6)
				{
					s.setMax(true);
				}
				s.setStudentMobile(rs.getString(8));
			}
			
			pstmt = conn.prepareStatement("select *from subjects where studentid = ?");
			pstmt.setInt(1,id);
			rs = pstmt.executeQuery();
			List<String> subjectName = new ArrayList<>();
			List<Integer> subjectMarks = new ArrayList<>();
			List<String> subjectType = new ArrayList<>();
			while(rs.next())
			{
				subjectName.add(rs.getString(2));
				subjectMarks.add(rs.getInt(3));
				subjectType.add(rs.getString(4));
			}
			s.setSubjectName(subjectName);
			s.setSubjectMarks(subjectMarks);
			s.setSubjectType(subjectType);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return s;
	}
	
	public void createStudent(Student student)
	{
		PreparedStatement pstmt;
		try
		{
			System.out.println("create student called");
			pstmt = conn.prepareStatement("insert into student(studentId, name, emailId, class, subjectNumber, age, isMax, mobile) values(?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setString(3, student.getStudentEmailId()); 
			pstmt.setString(4, student.getStudentClass());
			pstmt.setInt(5, student.getSubjectNumber());
			pstmt.setInt(6, student.getAge());
			if(student.getSubjectNumber() == 6){
				pstmt.setInt(7, 1);
			}else {
				pstmt.setInt(7, 0);
			}
			pstmt.setString(8, student.getStudentMobile());
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement("insert into subjects(studentId, subjectName, subjectMarks, subjectType) values(?,?,?,?)");
			List<String> subjectName = student.getSubjectName();
			List<Integer> subjectMarks = student.getSubjectMarks();
			List<String> subjectType = student.getSubjectType();
			
			for(int i=0; i<student.getSubjectNumber(); i++)
			{	
				pstmt.setInt(1, student.getStudentId());
				pstmt.setString(2,subjectName.get(i));
				pstmt.setInt(3, subjectMarks.get(i));
				pstmt.setString(4, subjectType.get(i));
				pstmt.executeUpdate();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public String updateStudent(int id, Student student)
	{
		try
		{
			String sql = "update student set name = ? , emailId= ?, class = ?, age = ?, mobile = ? where studentid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStudentName());
			pstmt.setString(2, student.getStudentEmailId());
			pstmt.setString(3, student.getStudentClass());
			pstmt.setInt(4, student.getAge());
			pstmt.setString(5, student.getStudentMobile());
			pstmt.setInt(6, id);
			int cnt = pstmt.executeUpdate();
			if(cnt == 1)
				return "Updated successfully";
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Not Updated";
	}
	
	public String updateStudentSubjectNumber(int id, Student student)
	{
		try 
		{
			PreparedStatement pstmt = conn.prepareStatement("update student set subjectNumber = ? where studentid = ?");
			int newSubjectNumber = student.getSubjectNumber();
			pstmt.setInt(1, newSubjectNumber);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement("delete from subjects where studentid = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();

			List<String> subjects = student.getSubjectName();
			List<String> subjectType = student.getSubjectType();
			List<Integer> subjectMarks = student.getSubjectMarks();
			
			int cnt=0;
			for(int i=0; i<newSubjectNumber ; i++)
			{
				pstmt = conn.prepareStatement("insert into subjects(studentid,subjectname,subjectmarks,subjecttype) values(?,?,?,?)");
				pstmt.setInt(1, id);
				pstmt.setString(2,subjects.get(i));
				pstmt.setInt(3, subjectMarks.get(i));
				pstmt.setString(4, subjectType.get(i));
				cnt = pstmt.executeUpdate();
			}
			if(cnt == 1) {
				return "updated successfully";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Not Successful";
	}
	
	public String deleteStudent(int id)
	{
		PreparedStatement pstmt;
		try
		{
			pstmt = conn.prepareStatement("delete from subjects where studentid = ?");
			pstmt.setInt(1, id);
			int count1 = pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement("delete from student where studentid = ?");
			pstmt.setInt(1, id);
			int count2 = pstmt.executeUpdate();
			if(count1 == 0 && count2 == 0)
			{
				return "UnSuccessful";
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "Successful";
	}
}
