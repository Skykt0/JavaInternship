package com.sky.studentapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam; 
import javax.ws.rs.core.MediaType;

@Path("students")
public class SubjectResource 
{
	SubjectDao sdao = new SubjectDao();
	@PUT
	@Path("{id}/addSubject")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addSubject(@PathParam("id")int id, Subjects subject) 
	{
		return sdao.addSubject(id, subject);
	}
	
	@DELETE
	@Path("{id}/deleteSubject/{subjectName}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteSubject(@PathParam("id")int id, @PathParam("subjectName")String subjectName)
	{
		return sdao.deleteSubject(id, subjectName);
	}
	
	@PUT
	@Path("{id}/updateSubject/{subjectName}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateSubject(@PathParam("id")int id, @PathParam("subjectName")String subjectName, Subjects subject)
	{
		List<Integer> marks = new ArrayList<>();
		InfoCheck ic = new InfoCheck();

		String output = "Update not successful";
		marks.add(subject.getSubjectMarks());
		HashMap<String, String> remarks = ic.checkMarks(marks);
		System.out.println(remarks);
		if(remarks.size() == 0){
			output = sdao.updateSubject(id, subjectName, subject);
		}
		return output +"\n"+remarks;
	}
	
}
