package com.sky.demorest;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepositry 
{
	Connection conn = null;
	public AlienRepositry()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/universe","root","sky3102");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public List<Alien> getAliens()
	{
		List<Alien> aliens = new ArrayList<>();
		try 
		{
			PreparedStatement pstmt = conn.prepareStatement("select *from aliens");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
				aliens.add(a);
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return aliens;
	}
	
	public Alien getAlien(int id)
	{
		Alien a = new Alien();
		try 
		{
			PreparedStatement pstmt = conn.prepareStatement("select *from aliens where id = ?");
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return a;
	}
	
	public Alien create(Alien a)
	{
		try 
		{
			PreparedStatement pstmt = conn.prepareStatement("insert into aliens(id,name,points) values(?,?,?)");
			pstmt.setInt(1,a.getId());
			pstmt.setString(2, a.getName());
			pstmt.setInt(3, a.getPoints());
			pstmt.executeUpdate();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return a;
	}
	
	public void deleteAlien(int id)
	{
		try
		{
			PreparedStatement pstmt = conn.prepareStatement("delete from aliens where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void updateAlien(int id, String name, int points)
	{
		try
		{
			PreparedStatement pstmt = conn.prepareStatement("update aliens set name = ?, points = ? where id = ?");
			pstmt.setString(1,name);
			pstmt.setInt(2, points);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
