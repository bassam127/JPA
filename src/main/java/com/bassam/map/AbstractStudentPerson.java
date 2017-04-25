package com.bassam.map;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractStudentPerson {
	
	
	protected String driverLicences;
	
	public AbstractStudentPerson()
	{
		
	}

	public String getDriverLicences() {
		return driverLicences;
	}

	public void setDriverLicences(String driverLicences) {
		this.driverLicences = driverLicences;
	}

}
