package com.sky.studentapi;

import java.util.ArrayList;

public class Student 
{
	private int studentId;
	private int age;
	private int subjectNumber;
	private String studentName;
	private String studentEmailId;
	private String studentMobile;
	private String studentClass;
	private boolean isMax = false;
	private ArrayList<StudentSubjects> subjects;
	
	public ArrayList<StudentSubjects> getSubjects() 
	{
		return subjects;
	}

	public void setSubjects(ArrayList<StudentSubjects> subjects) 
	{
		this.subjects = subjects;
	}

	public int getStudentId() 
	{
		return studentId;
	}
	
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public int getSubjectNumber() 
	{
		return subjectNumber;
	}
	
	public void setSubjectNumber(int subjectNumber) 
	{
		this.subjectNumber = subjectNumber;
	}
	
	public String getStudentName() 
	{
		return studentName;
	}
	
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	
	public String getStudentEmailId() 
	{
		return studentEmailId;
	}
	
	public void setStudentEmailId(String studentEmailId) 
	{
		this.studentEmailId = studentEmailId;
	}
	
	public String getStudentMobile() 
	{
		return studentMobile;
	}
	
	public void setStudentMobile(String studentMobile) 
	{
		this.studentMobile = studentMobile;
	}
	
	public String getStudentClass() 
	{
		return studentClass;
	}
	
	public void setStudentClass(String studentClass) 
	{
		this.studentClass = studentClass;
	}
	
	public boolean isMax() 
	{
		return isMax;
	}
	
	public void setMax(boolean isMax) 
	{
		this.isMax = isMax;
	}	
}
