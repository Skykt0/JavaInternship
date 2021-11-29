package com.sky.studentapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class InfoCheck
{
	Pattern p;
	Matcher m;
	
	HashMap<String, String> remarks = new HashMap<>();
	
	public HashMap<String, String> checkStudentInfo(Student student)
	{
		String name = student.getStudentName();
		checkName(name);
		
		String email = student.getStudentEmailId();
		checkEmail(email);
		
		String contact = student.getStudentMobile();
		checkContact(contact);
		
		int studentClass = Integer.parseInt(student.getStudentClass());
		checkClass(studentClass,student);
		
		int noOfSubjects = student.getSubjectNumber();
		checkSubjectNumber(noOfSubjects);
		
		ArrayList<StudentSubjects> subjectList = student.getSubjects();
		List<Integer> marks = new ArrayList<>();
		for(int i=0; i<noOfSubjects; i++)
		{
			marks.add(subjectList.get(i).getSubjectMarks());			
		}
		checkMarks(marks);
		return remarks;
	}
	
	public HashMap<String, String> checkName(String name)
	{
		String regexName = "([A-Z][a-z]+){1}([.\\s][A-Z][a-z]+)+";
		Pattern p = Pattern.compile(regexName);
		Matcher m = p.matcher(name);
		if(m.matches() == false)
		{
			 remarks.put(name,"incorrect name");
		}
		return remarks;
	}
	public HashMap<String, String> checkEmail(String email)
	{
		String regexEmail = "([a-z0-9]+([._]?[a-z0-9]+)+)@[a-z]+[.](com)";
		p = Pattern.compile(regexEmail);
		m = p.matcher(email); 
		if(m.matches() == false)
		{
			remarks.put(email, "incorrect email");
		}
		return remarks;
	}
	
	public HashMap<String, String> checkContact(String contact)
	{
		String regexContact = "((91)|(0))(([9876][0-9]{9})|([0-9]{3}[0-9]{7}))";
		p = Pattern.compile(regexContact);
		m = p.matcher(contact);
		if(m.matches() == false) 
		{
			remarks.put(contact, "incorrect contact");
		}
		return remarks;
	}
	
	public HashMap<String, String> checkClass(int studentClass, Student student)
	{
		if(studentClass > 12 || studentClass < 0)
		{
			remarks.put(student.getStudentClass(), "class must be between (1 to 12)");
		}
		return remarks;
	}
	
	public HashMap<String, String> checkSubjectNumber(int noOfSubjects)
	{
		if(noOfSubjects < 0 || noOfSubjects > 6)
		{
			remarks.put(noOfSubjects+"", "no. of subjects must be between 0 to 6");
		}
		return remarks;
	}
	
	public HashMap<String, String> checkMarks(List<Integer> marks)
	{
		int negCnt = 0, posCnt =0;
		for(int i=0; i<marks.size(); i++)
		{
			if(marks.get(i) < 0) {
				negCnt++;
			}else if(marks.get(i)>100) {
				posCnt++;
			}
		}	
		if(negCnt !=0 || posCnt !=0) {
			remarks.put("marks", "marks should be between - 1 to 100");
		}
		return remarks;
	}
	
	public HashMap<String, String> checkAge(int age)
	{
		if(age < 3) {
			remarks.put("age", "age should be above 3");
		}
		return remarks;
	}
}
