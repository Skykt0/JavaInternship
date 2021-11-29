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
			String sql = "select * from student";
			PreparedStatement pstmt = conn.prepareStatement(sql);
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
		PreparedStatement pstmt;
		try 
		{
			String sql = "select *from student where studentid = ?";
			pstmt = conn.prepareStatement(sql);
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
			
			sql = "select *from subjects where studentid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			rs = pstmt.executeQuery();
			ArrayList<StudentSubjects> subjectList = new ArrayList<>();
			while(rs.next())
			{
				StudentSubjects ss = new StudentSubjects();
				ss.setSubjectName(rs.getString(2));
				ss.setSubjectMarks(rs.getInt(3));
				ss.setSubjectType(rs.getString(4));
				
				subjectList.add(ss);
			}
			s.setSubjects(subjectList);
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
			String sql = "insert into student(studentId, name, emailId, class, subjectNumber, age, isMax, mobile) values(?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
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
			
			sql = "insert into subjects(studentId, subjectName, subjectMarks, subjectType) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			ArrayList<StudentSubjects>subjectList = student.getSubjects();
			
			pstmt.setInt(1, student.getStudentId());
			for(int i=0; i<student.getSubjectNumber(); i++)
			{	
				pstmt.setString(2, subjectList.get(i).getSubjectName());
				pstmt.setInt(3, subjectList.get(i).getSubjectMarks());
				pstmt.setString(4, subjectList.get(i).getSubjectType());
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
	
	public String updateName(int id, Student student)
	{
		try
		{
			String sql = "update student set name = ? where studentid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStudentName());
			pstmt.setInt(2, id);
			int cnt = pstmt.executeUpdate();
			if(cnt == 1)
				return "Student Name updated Successfully";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Update not successful";
	}
	
	public String updateEmail(int id, Student student)
	{
		try
		{
			String sql = "update student set emailid = ? where studentid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStudentEmailId());
			pstmt.setInt(2, id);
			int cnt = pstmt.executeUpdate();
			if(cnt == 1)
				return "Student Email updated Successfully";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Update not successful";
	}
	
	public String updateContact(int id, Student student)
	{
		try
		{
			String sql = "update student set mobile = ? where studentid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStudentMobile());
			pstmt.setInt(2, id);
			int cnt = pstmt.executeUpdate();
			if(cnt == 1)
				return "Student Contact updated Successfully";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Update not successful";
	}
	
	public String updateAge(int id, Student student)
	{
		try
		{
			String sql = "update student set age = ? where studentid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getAge());
			pstmt.setInt(2, id);
			int cnt = pstmt.executeUpdate();
			if(cnt == 1)
				return "Student Age updated Successfully";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Update not successful";
	}
	
	public String updateStudentSubjectNumber(int id, Student student)
	{
		try 
		{
			String sql = "update student set subjectNumber = ? where studentid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int newSubjectNumber = student.getSubjectNumber();
			pstmt.setInt(1, newSubjectNumber);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
			sql = "delete from subjects where studentid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
			ArrayList<StudentSubjects> subjectList = student.getSubjects();
			sql = "insert into subjects(studentid, subjectName, subjectmarks, subjecttype) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			int cnt=0;
			for(int i=0; i<student.getSubjectNumber(); i++)
			{	
				pstmt.setInt(1, id);
				pstmt.setString(2, subjectList.get(i).getSubjectName());
				pstmt.setInt(3, subjectList.get(i).getSubjectMarks());
				pstmt.setString(4, subjectList.get(i).getSubjectType());
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
			String sql = "delete from subjects where studentid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			int count1 = pstmt.executeUpdate();
			
			sql = "delete from student where studentid = ?";
			pstmt = conn.prepareStatement(sql);
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
