package ore.inhert;

public class Child extends Parent {
	public void childName() {
		System.out.println("Child name is Divakaran");

	}
public void childAge() {
	System.out.println("Child age is 31");

}
public static void main(String[] args) {
	Child c = new Child();
	c.gparentName();
	c.gparentAge();
	c.parentName();
	c.parentAge();
	c.childName();
	c.childAge();
}
}
