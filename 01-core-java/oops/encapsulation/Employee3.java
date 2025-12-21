package encapsulation;

class EmployeeData3{
	private String eId;
	private String eBranch;
	private double eSalary;
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteBranch() {
		return eBranch;
	}
	public void seteBranch(String eBranch) {
		this.eBranch = eBranch;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
	
//	public void setId(String eId){
//		this.eId=eId; 
//	}
//	
//	public void setBranch(String eBranch){
//		this.eBranch=eBranch; 
//	}
//	
//	public void setSalary(double eSalary){
//		this.eSalary=eSalary;
//	}
//	
//	public String getId(){
//		return eId;
//	}
//	
//	public String getBranch(){
//		return eBranch;
//	}
//	
//	public double getSalary(){
//		return eSalary;
//	}
	
}

public class Employee3 {

	public static void main(String[] args) {
		EmployeeData3 eData=new EmployeeData3();

//		Direct access is Prevented  	
//		System.out.println(eData.eId);
//		System.out.println(eData.eBranch);
//		System.out.println(eData.eSalary);
		
		
//		Controlled Way Possible 
//		Setters
		eData.seteId("employee111");
		eData.seteBranch("Computer Science");
		eData.seteSalary(29.999);
		
		
//		Getters
		System.out.println(eData.geteId());
		System.out.println(eData.geteBranch());
		System.out.println(eData.geteSalary());
		
		
	}

}
