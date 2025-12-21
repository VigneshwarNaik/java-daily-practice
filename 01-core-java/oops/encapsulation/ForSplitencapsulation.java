package encapsulation;
import java.util.Scanner;

// POJO Class
class Student02 {
    private int id;
    private String name;
    private String course;

    public Student02() { // zero constructor
    }

    public Student02(int id, String name, String course) {  // Parameterized constructor
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
public class ForSplitencapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int num = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        Student02[] store = new Student02[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Details of Employee " + (i + 1) + " (Format: id,name,course): ");
            String detail = sc.nextLine();
            String[] arr = detail.split(",");

            // Create a new object inside the loop
            Student02 s = new Student02();
            s.setcId(Integer.parseInt(arr[0]));
            s.setcName(arr[1]);
            s.setcCourse(arr[2]);

            store[i] = s;
        }

        System.out.println("\n--- All Employee Details ---");
        for (int i = 0; i < store.length; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("ID     : " + store[i].getcId());
            System.out.println("Name   : " + store[i].getcName());
            System.out.println("Course : " + store[i].getcCourse());
        }
    }
}
