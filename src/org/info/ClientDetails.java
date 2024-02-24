package org.info;

import com.sample.EmployeeDetails;

public class ClientDetails {
	private void clientId() {
		System.out.println("4567");

	}

	private void clientName() {
		System.out.println("arshi");

	}

	public static void main(String[] args) {
		ClientDetails c = new ClientDetails();
		c.clientId();
		c.clientName();
		EmployeeDetails e = new EmployeeDetails();
		e.employeeId();
		e.employeeName();

	}
}
