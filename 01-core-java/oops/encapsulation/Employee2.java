package encapsulation;

class EmployeeData2{
	private String eId;
	private String eBranch;
	private double eSalary;
	
	public void setId(String eId){
		eId=eId; // Shadowing problem 
	}
	
	public void setBranch(String eBranch){
		eBranch=eBranch; // Shadowing problem 
	}
	
	public void setSalary(double eSalary){
		eSalary=eSalary; // Shadowing problem 
	}
	
	public String getId(){
		return eId;
	}
	
	public String getBranch(){
		return eBranch;
	}
	
	public double getSalary(){
		return eSalary;
	}
	
}

public class Employee2 {

	public static void main(String[] args) {
		EmployeeData2 eData=new EmployeeData2();

//		Direct access is Prevented  	
//		System.out.println(eData.eId);
//		System.out.println(eData.eBranch);
//		System.out.println(eData.eSalary);
		
		
//		Controlled Way Possible 
//		Setters
		eData.setId("employee111");
		eData.setBranch("Computer Science");
		eData.setSalary(29.999);
		
		
//		Getters
		System.out.println(eData.getId());
		System.out.println(eData.getBranch());
		System.out.println(eData.getSalary());
		
		
	}

}
