package encapsulation;
import java.util.Scanner;

// POJO Class
class Student01 {
    private int id;
    private String name;
    private String course;

    
   public Student01() { //zero constructor
	   
   }
    
    public Student01(int id, String name, String course) {  //Parameterized constructor
		this.id = id;
		this.name = name;
		this.course = course;
	}
    
 // Getters and Setters
    
    public int getcId() {
        return id;
    }
    
	public void setcId(int id) {
        this.id = id;
    }

    public String getcName() {
        return name;
    }
    public void setcName(String name) {
        this.name = name;
    }

    public String getcCourse() {
        return course;
    }
    public void setcCourse(String course) {
        this.course = course;
    }

}

// Main class
public class Splitencapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student01 s = new Student01();

        // Taking input from user
        System.out.print("Enter Details: \n");
        String detail=sc.nextLine();
        String[] arr=detail.split(",");

        
        s.setcId(Integer.parseInt(arr[0]));
        s.setcName(arr[1]);
        s.setcCourse(arr[2]);

        // Printing the student details
        System.out.println("\n--- Student Details ---");
        System.out.println("ID     : " + s.getcId());
        System.out.println("Name   : " + s.getcName());
        System.out.println("Course : " + s.getcCourse());

        
    }
}
