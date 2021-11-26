package com.sky.studentapi;

public class Subjects 
{
	private int studentId;
	private String subjectName;
	private Integer subjectMarks;
	private String subjectType;
	
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public String getSubjectName() 
	{
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) 
	{
		this.subjectName = subjectName;
	}
	
	public Integer getSubjectMarks() 
	{
		return subjectMarks;
	}
	
	public void setSubjectMarks(Integer subjectMarks) 
	{
		this.subjectMarks = subjectMarks;
	}
	
	public String getSubjectType() 
	{
		return subjectType;
	}
	
	public void setSubjectType(String subjectType) 
	{
		this.subjectType = subjectType;
	}
	
	
}
