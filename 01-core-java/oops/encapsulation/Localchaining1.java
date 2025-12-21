package encapsulation;

class Student1{
	String sId;
	String sBranch;
	int sMarks;
	
	public Student1(){
	sId="Rohit";
	sBranch="CS";
	sMarks=92;
	}
	
	public Student1(String sId,String sBranch,int sMarks){
		this();
//		Overwriting
		this.sId=sId;
		this.sBranch=sBranch;
		this.sMarks=sMarks;
	}
	
	public String getsId(){
		return sId;
	}
	
	public String getsBranch(){
		return sBranch;
	}
	
	public int getsMarks(){
		return sMarks;
	}
}

public class Localchaining1 {

	public static void main(String[] args) {
		Student1 std=new Student1("Dhoni","Mech",45);
		
		System.out.println(std.getsId());
		System.out.println(std.getsBranch());
		System.out.println(std.getsMarks());

	}

}
