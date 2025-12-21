package encapsulation;

class Student2{
	String sId;
	String sBranch;
	int sMarks;
	
	public Student2(){
	sId="Rohit";
	sBranch="CS";
	sMarks=92;
	}
	
	public Student2(String sBranch){
		this();
		this.sBranch=sBranch;  //		Overwriting
	}
	
	Student2(String sId,String sBranch,int sMarks){
		this(sBranch);
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

public class Localchaining2{

	public static void main(String[] args) {
		Student2 std=new Student2("Dhoni","Mech",45);
		
		System.out.println(std.getsId());
		System.out.println(std.getsBranch());
		System.out.println(std.getsMarks());

	}

}
