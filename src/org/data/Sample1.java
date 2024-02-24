package org.data;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter your age");
		int age = s.nextInt();
		System.out.println("enter your name");
		String name = s.nextLine();
		System.out.println("enter ut bro name");
		String broname = s.nextLine();
		System.out.println("where are you from");
		String place = s.next();
		
		System.out.println("Details: \n========");
		
		System.out.println("my age is "+age);
		System.out.println("my name is "+name);
		System.out.println("enter ur bro name "+broname);
		System.out.println("my place is "+place);
		
		
		
	}

	

}
