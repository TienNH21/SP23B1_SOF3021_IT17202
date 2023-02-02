package sof3021.beans;

import org.springframework.stereotype.Component;

// @Component
public class Company {
	private String name;
	
	public Company()
	{
		this.name = "IT17202";
	}
	
	public Company(String n)
	{
		this.name= n;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
}
