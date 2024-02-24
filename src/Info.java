
public  class Info extends Details{
	public void ownerName() {
		System.out.println("Owner name:anu");

	} 
	@Override
	public void empId() {
		System.out.println("Employee Id:6567");
		
	}
	
	public static void main(String[] args) {
		Info i=new Info();
		i.ownerName();
		i.empName();
		i.empId();
		
		
	}



	
	

	

}
