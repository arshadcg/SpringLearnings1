package com.company.learnings;

import org.springframework.stereotype.Component;

@Component 

public class brakes implements Vehicle {
	
	public void drive()
	{
		
		System.out.println("Vehicle is stopping");
		
	}

}
