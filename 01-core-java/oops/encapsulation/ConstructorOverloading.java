package encapsulation;


class EmployeeV {
	String eId;
	String eBranch;
	double eSalary;
	
	
	public EmployeeV(){
		eId="emp01";
		eBranch="ML";
		eSalary=34.4334;	
	}
	
	EmployeeV(String eId,String eBranch,double eSalary){
		this.eId=eId;
		this.eBranch=eBranch;
		this.eSalary=eSalary;
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




public class ConstructorOverloading {

	public static void main(String[] args) {
	
		EmployeeV emp=new EmployeeV();
		
		System.out.println(emp.geteId());
		System.out.println(emp.geteBranch());
		System.out.println(emp.geteSalary());
		System.out.println();
		EmployeeV empp=new EmployeeV("emp02","Maths",72.9929);
		System.out.println(empp.geteId());
		System.out.println(empp.geteBranch());
		System.out.println(empp.geteSalary());
		
		
		
		
		

	}

}
