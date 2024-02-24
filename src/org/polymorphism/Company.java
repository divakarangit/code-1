package org.polymorphism;

public class Company {
	public void name() {
		System.out.println("Company name is Smart Skills");
	}
	public void location() {
		System.out.println("Company location in Pallikarnai");
		
	}
public static void main(String[] args) {
	Company c = new Company();
	c.name();
	c.location();
}
}
