package encapsulation;


class Employee7 {
	String eId;
	String eBranch;
	double eSalary;
	
	
	
	String geteId(){
		return eId;
	}
	
	String geteBranch(){
		return eBranch;
	}
	
	double geteSalary(){
		return eSalary;
	}
}




public class Default {

	public static void main(String[] args) {
	
		Employee7 emp=new Employee7();
		
		System.out.println(emp.geteId());
		System.out.println(emp.geteBranch());
		System.out.println(emp.geteSalary());
		
		
		

	}

}
