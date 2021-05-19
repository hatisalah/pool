package com.hayat;

import com.hayat.user.Employee;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setBaseSalery(120_000);

		System.out.println(employee.getBaseSalery());
	}

}
