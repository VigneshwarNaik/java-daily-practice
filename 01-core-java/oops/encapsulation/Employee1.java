package encapsulation;

class EmployeeData1{
	private String eId;
	private String eBranch;
	private double eSalary;
	
	public void setId(String x){
		eId=x;
	}
	
	public void setBranch(String y){
		eBranch=y;
	}
	
	public void setSalary(double z){
		eSalary=z;
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

public class Employee1 {

	public static void main(String[] args) {
		EmployeeData1 eData=new EmployeeData1();

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
