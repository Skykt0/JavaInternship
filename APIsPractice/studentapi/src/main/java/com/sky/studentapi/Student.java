package com.sky.studentapi;

import java.util.List;

public class Student 
{
	private int studentId, age, subjectNumber;
	private String studentName, studentEmailId, studentMobile, studentClass;
	private boolean isMax = false;
	
	private List<String> subjectName;
	private List<Integer> subjectMarks;
	private List<String> subjectType;
	
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
	
	public List<String> getSubjectName() 
	{
		return subjectName;
	}

	public void setSubjectName(List<String>  subjectName) 
	{
		this.subjectName = subjectName;
	}

	public List<String> getSubjectType() 
	{
		return subjectType;
	}

	public void setSubjectType(List<String> subjectType) 
	{
		this.subjectType = subjectType;
	}

	public List<Integer> getSubjectMarks()
	{
		return subjectMarks;
	}

	public void setSubjectMarks(List<Integer> subjectMarks) 
	{
		this.subjectMarks = subjectMarks;
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
