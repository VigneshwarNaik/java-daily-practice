package encapsulation;

class Student{
	String sId;
	String sBranch;
	int sMarks;
	
	public Student(){
	sId="Rohit";
	sBranch="CS";
	sMarks=92;
	}
	
	public Student(String sId,String sBranch,int sMarks){
		this();
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

public class Localchaining {

	public static void main(String[] args) {
		Student std=new Student("Dhoni","Mech",45);
		
		System.out.println(std.getsId());
		System.out.println(std.getsBranch());
		System.out.println(std.getsMarks());

	}

}
