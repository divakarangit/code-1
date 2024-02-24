package org.multiple;

public class Desktop implements Computer,Software {
private void desktopModel() {
	System.out.println("Desktop model: Windows hp");

}
	@Override
	public void softwareResorces() {
		System.out.println("software resources: ms windows");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println( "Hardware resources: cpu,hard disk");
		
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResorces();
		d.hardwareResources();
	}

}
