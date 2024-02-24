package org.polymorphism;


public class DivuDetail {
	private void employee() {
		System.out.println("Employee:");

	}
	public void employee(String name) {
		System.out.println("Employee name is " +name);
		
	}
	public void employee(int age) {
		System.out.println("Employee age is "+age);
		
	}
	public void employee(String address,int pin) {
		System.out.println("Employee adress is "+address);
		System.out.println("Employee pin is "+pin);
		
	}
	public void employee(float avg,long acc) {
		System.out.println("Employee avg is "+avg);
		System.out.println("Employee acc is "+acc);
	}
	public void employee(long phno,float sal) {
		System.out.println("Employee phno is "+phno);
		System.out.println("Employee salary is "+sal);
		
	}
	public static void main(String[] args) {
		DivuDetail d = new DivuDetail();
		d.employee();
		d.employee(31);
		d.employee("Divakaran Sukumaran");
		d.employee(79.987654567f, 12345678998765l);
		d.employee(9042863952l, 76789.998765643f);
		d.employee("No.9/17,Ruthrappa street,Choolai,Chennai", 600112);
		
	}

	

}
