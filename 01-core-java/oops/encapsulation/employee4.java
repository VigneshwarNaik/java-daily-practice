package encapsulation;

class EmployeeData4{
	private String eId;
	private String eBranch;
	private double eSalary;
	
	public void setData(String eId,String eBranch,double eSalary){
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
	
	

public class employee4 {

	public static void main(String[] args) {
		EmployeeData4 eData=new EmployeeData4();		
		
//		Controlled Way Possible 
//		Setters
		eData.setData("emp201", "Computer Science", 38.099);
		
		
//		Getters
		System.out.println(eData.geteId());
		System.out.println(eData.geteBranch());
		System.out.println(eData.geteSalary());
		
		
	}

}
