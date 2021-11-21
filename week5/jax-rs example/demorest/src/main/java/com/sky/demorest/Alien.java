package com.sky.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien 
{
	private String name;
	private int points;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getPoints() {
		return points;
	}
	public int getId() {
		return id;
	}
}
