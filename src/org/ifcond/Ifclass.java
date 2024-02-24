package org.ifcond;

public class Ifclass {
	public int sub() {
		int a=20, b=10;
		int c=a-b;
		return c;
		
	}
	public String name() {
		String name="Substraction";
		return name;
		
	}
	public float percent() {
		float percent=(50.567432f);
		return percent;
		
	}
	public static void main(String[] args) {
		Ifclass i = new Ifclass();
		int d=i.sub();
		String name=i.name();
		float percent=i.percent();
		System.out.println(d);
		
	}
}
