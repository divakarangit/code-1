package org.polymorphism;

public class Client extends Company {
	@Override
	public void name() {
		System.out.println("Client name is Divakaran");
		super.name();
	}
	@Override
	public void location() {
		System.out.println("Client location in Avadi");
		super.location();
	}
	public static void main(String[] args) {
		Client cl = new Client();
		cl.name();
		cl.location();
	}
	}




