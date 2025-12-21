package encapsulation;

class EmployeeData5{
	private String eId;
	private String eBranch;
	private double eSalary;
	
	public EmployeeData5(String eId,String eBranch,double eSalary){
		this.eId=eId;
		this.eBranch=eBranch;
		this.eSalary=eSalary;
	}
	
	public String geteId() {
		return eId;
	}
	
	public String geteBranch() {
		return eBranch;
	}
	
	public double geteSalary() {
		return eSalary;
	}

	
}	
	
	

public class Employee5 {

	public static void main(String[] args) {
		EmployeeData5 eData=new EmployeeData5("emp201", "Computer Science", 38.099);		
		
//		Controlled Way Possible 
//		Setters
	 
		
		
//		Getters
		System.out.println(eData.geteId());
		System.out.println(eData.geteBranch());
		System.out.println(eData.geteSalary());
		
		
	}

}
