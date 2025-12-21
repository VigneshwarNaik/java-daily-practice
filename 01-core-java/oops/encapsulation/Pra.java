package encapsulation;

class Emp{
	private int eId;
	private String eName;
	private int eSalary;
	
	public Emp(){
	eId=981;
	eName="Vignesh";
	eSalary=111110;
	}
	
	public Emp(int eId,String eName,int eSalary){
		this();
		this.eId=eId;
		this.eName=eName;
	}
	
	int geteId(){
		return eId;
	}
	
	String geteName(){
		return eName;
	}
	
	int geteSalary(){
		return eSalary;
	}
}


public class Pra {

	public static void main(String[] args) {
		
		Emp emp=new Emp(112,"Dhoni",2323232);
		System.out.println(emp.geteId());
		System.out.println(emp.geteName());
		System.out.println(emp.geteSalary());
		
		
		
	}

}
