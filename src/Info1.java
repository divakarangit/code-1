
public class Info1 implements Details1 {
	private void empName() {
		System.out.println("Employee Name:Tabu");

	}
	private void empId() {
		System.out.println("Employee Id:556");

	}
	@Override
	public void stuName() {
		System.out.println("Student name:Meena");
		
	}
	@Override
	public void stuId() {
		System.out.println("Student id:352");
		
	}
	@Override
	public void stuDpt() {
		System.out.println("Student Dept;Maths");
	}
	public static void main(String[] args) {
		Info1 i=new Info1();
		i.empName();
		i.empId();
		i.stuName();
		i.stuId();i.stuDpt();
	}

}
