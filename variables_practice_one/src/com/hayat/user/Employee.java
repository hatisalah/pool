package com.hayat.user;

public class Employee {
	private int baseSalery; // instance
	private  int hourlyRate;
	
	public Employee() {
		super();
		// System.out.println("Constructor method running");
		
	}
	
	public Employee(int baseSalery) {
		// super();
		this.baseSalery = baseSalery;
	}

	public int getBaseSalery() {
		return baseSalery;
	}
	public void setBaseSalery(int baseSalery) {
		if(baseSalery > 0) {
			this.baseSalery = baseSalery;
		}else {
			System.out.println("Base salery should be >0 ");
			
		}
		
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
	 
	 

}
