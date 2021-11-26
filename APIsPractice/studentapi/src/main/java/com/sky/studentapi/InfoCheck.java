package com.sky.studentapi;

import java.util.HashMap;
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
		String regexName = "([A-Z][a-z]+){1}([.\\s][A-Z][a-z]+)+";
		p = Pattern.compile(regexName);
		m = p.matcher(name);
		if(m.matches() == false)
		{
			remarks.put(name,"incorrect name");
		}
		
		String email = student.getStudentEmailId();
		String regexEmail = "([a-z0-9]+([._]?[a-z0-9]+)+)@[a-z]+[.](com)";
		p = Pattern.compile(regexEmail);
		m = p.matcher(email); 
		if(m.matches() == false)
		{
			remarks.put(email, "incorrect email");
		}
		
		String contact = student.getStudentMobile();
		String regexContact = "((91)|(0))(([9876][0-9]{9})|([0-9]{3}[0-9]{7}))";
		p = Pattern.compile(regexContact);
		m = p.matcher(contact);
		if(m.matches() == false) 
		{
			remarks.put(contact, "incorrect contact");
		}
		
		int studentClass = Integer.parseInt(student.getStudentClass());
		if(studentClass > 12 || studentClass < 0)
		{
			remarks.put(student.getStudentClass(), "class must be between (1 to 12)");
		}
		

		int noOfSubjects = student.getSubjectNumber();
		if(noOfSubjects < 0 || noOfSubjects > 6)
		{
			remarks.put(noOfSubjects+"", "no. of subjects must be between 0 to 6");
		}
		
		return remarks;
	}
}
