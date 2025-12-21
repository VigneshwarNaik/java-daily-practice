package encapsulation;
import java.util.Scanner;

// POJO Class
class Student0 {
    private int id;
    private String name;
    private String course;

    
   public Student0() { //zero constructor
	   
   }
    
    public Student0(int id, String name, String course) {  //Parameterized constructor
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
public class Pojoclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student0 s = new Student0();

        // Taking input from user
        System.out.print("Enter ID: ");
        int id=sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Course: ");
        String course=sc.nextLine();
        
        s.setcId(id);
        s.setcName(name);
        s.setcCourse(course);

        // Printing the student details
        System.out.println("\n--- Student Details ---");
        System.out.println("ID     : " + s.getcId());
        System.out.println("Name   : " + s.getcName());
        System.out.println("Course : " + s.getcCourse());

        
    }
}
