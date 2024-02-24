package org.bike;

public class Ktm implements BikeInformation {

	@Override
	public void cost() {
		System.out.println("Cost is 2,30,000");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed is 150Km/Hr");
		
	}
public static void main(String[] args) {
	Ktm k = new Ktm();
	k.cost();
	k.speed();
}
}
