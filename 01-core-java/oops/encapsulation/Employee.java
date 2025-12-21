package encapsulation;

class EmployeeData{
	private String eId;
	private String eBranch;
	private double eSalary;
	
	public void setter1(String x){
		eId=x;
	}
	
	public void setter2(String y){
		eBranch=y;
	}
	
	public void setter3(double z){
		eSalary=z;
	}
	
	public String getter1(){
		return eId;
	}
	
	public String getter2(){
		return eBranch;
	}
	
	public double getter3(){
		return eSalary;
	}
	
}

public class Employee {

	public static void main(String[] args) {
		EmployeeData eData=new EmployeeData();

//		Direct access is Prevented  	
//		System.out.println(eData.eId);
//		System.out.println(eData.eBranch);
//		System.out.println(eData.eSalary);
		
		
//		Controlled Way Possible 
//		Setters
		eData.setter1("employee111");
		eData.setter2("Computer Science");
		eData.setter3(29.999);
		
		
//		Getters
		System.out.println(eData.getter1());
		System.out.println(eData.getter2());
		System.out.println(eData.getter3());
		
		
	}

}
