package com.sky.demorest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource 
{
	AlienRepositry repo = new AlienRepositry();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens()
	{
		System.out.println("called");
		return repo.getAliens();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getAlien(@PathParam("id")int id)
	{
		return repo.getAlien(id);
	}
	
	@POST
	@Path("alien")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Alien createAlien(Alien a)
	{
		return repo.create(a);
	}
	
	@DELETE
	@Path("/{id}")
	public String deleteAlien(@PathParam("id")int id)
	{
		repo.deleteAlien(id);
		return "deleted";
	}
	
	@PUT
	@Path("update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateAlien(@PathParam("id")int id, Alien alien)
	{
		repo.updateAlien(id, alien.getName(), alien.getPoints());
		return "updated";
	}
	
}
