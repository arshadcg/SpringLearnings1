package com.company.learnings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	

public class Car implements Vehicle {
	
	private tyre tyre;
	
	@Autowired
	
	
	public tyre getTyre() {
		return tyre;
	}


	public void setTyre(tyre tyre) {
		this.tyre = tyre;
	}



	public void drive()
	{
		System.out.println("Its cruising man");
		}
}

