package com.bassam.inhertance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="B")
public class Buss extends Vehicle {

	private int numberOfPassenger;
	
	public Buss()
	{
		
	}
	public Buss(String name, int numberOfPassenger )
	{
		super(name);
		this.numberOfPassenger=numberOfPassenger;
	}
	
}
