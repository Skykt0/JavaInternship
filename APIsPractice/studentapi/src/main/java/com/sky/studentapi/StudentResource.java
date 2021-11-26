package com.sky.studentapi;

import java.util.HashMap;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource 
{	
	StudentDao sdao = new StudentDao();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents()
	{
		 return sdao.getStudents();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("id")int id)
	{
		return sdao.getStudent(id);
	}
	
	@POST
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	public String createStudent(Student student)
	{
		InfoCheck ic = new InfoCheck();
		HashMap<String, String> remarks = ic.checkStudentInfo(student);
		
		if(remarks.size() == 0)
		{
			sdao.createStudent(student);
			return student.getStudentName()+" registration successful";			
		}
		return "Count not register "+student.getStudentName()+"\n"+remarks;
	}
	
	@PUT
	@Path("update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateStudent(@PathParam("id")int id, Student student)
	{
		InfoCheck ic = new InfoCheck();
		HashMap<String, String> remarks = ic.checkStudentInfo(student);
		
		if(remarks.size() == 0)
		{
			sdao.updateStudent(id, student);
			return "Successfully Updated";
		}
		return "UnSuccessful"+student.getStudentName()+"\n"+remarks;
	}
	
	@PUT
	@Path("updateSubjectNumber/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String udpateSubjectNumber(@PathParam("id")int id, Student student)
	{
		return sdao.updateStudentSubjectNumber(id, student);
	}
	
	@DELETE
	@Path("delete/{id}")
	public String deleteStudent(@PathParam("id")int id)
	{
		return sdao.deleteStudent(id);
	}
	
}
