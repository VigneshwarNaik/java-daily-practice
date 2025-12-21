package encapsulation;


class Employee6 {
	String eId;
	String eBranch;
	double eSalary;
	
//	Employee6(){
//		
//	}
	
	public Employee6(){
		eId="emp01";
		eBranch="ML";
		eSalary=34.4334;	
	}
	
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




public class Zero {

	public static void main(String[] args) {
	
		Employee6 emp=new Employee6();
		
		System.out.println(emp.geteId());
		System.out.println(emp.geteBranch());
		System.out.println(emp.geteSalary());
		
		
		

	}

}
