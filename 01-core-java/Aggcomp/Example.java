package Aggcomp;

// Heart class — shows Composition (Student "has-a" Heart)
class Heart {
	private float hWeight;  // weight of the heart
	private float hBpm;     // beats per minute (BPM) of the heart

	// Constructor to initialize heart properties
	public Heart(float hWeight, float hBpm) {
		this.hWeight = hWeight;
		this.hBpm = hBpm;
	}

	// Getter method to get BPM
	public float gethBpm() {
		return hBpm;
	}

	// Getter method to get weight
	public float gethWeight() {
		return hWeight;
	}
}

// Brain class — shows Composition (Student "has-a" Brain)
class Brain {
	private float bWieght;  // weight of the brain
	private String bColour; // color of the brain

	// Constructor to initialize brain properties
	public Brain(float bWieght, String bColour) {
		this.bWieght = bWieght;
		this.bColour = bColour;
	}

	// Getter for brain weight
	public float getbWieght() {
		return bWieght;
	}

	// Getter for brain color
	public String getbColour() {
		return bColour;
	}
}

// Bike class — used in Aggregation (a Student "can-have" a Bike)
class Bike {
	private String bBrand;   // brand of the bike
	private float bMileage;  // mileage of the bike

	// Constructor to initialize bike details
	public Bike(String bBrand, float bMileage) {
		this.bBrand = bBrand;
		this.bMileage = bMileage;
	}

	// Getter for bike brand
	public String getbBrand() {
		return bBrand;
	}

	// Getter for bike mileage
	public float getbMileage() {
		return bMileage;
	}
}

// Book class — used in Aggregation (a Student "can-have" a Book)
class Book {
	private String bName;    // name of the book
	private String bAuthor;  // author of the book

	// Constructor to initialize book details
	public Book(String bName, String bAuthor) {
		this.bName = bName;
		this.bAuthor = bAuthor;
	}

	// Getter for book name
	public String getbName() {
		return bName;
	}

	// Getter for book author
	public String getbAuthor() {
		return bAuthor;
	}
}

// Student class — has composition with Heart and Brain, and aggregation with Bike and Book
class Student {

	// Composition — these objects are created *within* the Student
	Heart hrt = new Heart(2.3f, 3.3f);     // Student always has a Heart
	Brain brn = new Brain(2.2f, "Red");    // Student always has a Brain

	// Aggregation — Student can use external objects like Bike and Book
	// Bike is passed externally via method
	void hasA(Bike b) {
		System.out.println("Bike Brand: " + b.getbBrand());
		System.out.println("Bike Mileage: " + b.getbMileage());
	}

	// Book is passed externally via method
	void hasA1(Book b1) {
		System.out.println("Book Name: " + b1.getbName());
		System.out.println("Book Author: " + b1.getbAuthor());
	}
}

// Main class to run the application
public class Example {
	public static void main(String[] args) {

		// Creating external objects (Aggregation part)
		Bike b = new Bike("TVS", 67.5f);           // Bike can be used by student
		Book b1 = new Book("DVG", "jai");          // Book can be used by student

		// Creating Student object
		Student std = new Student();               // Student automatically has Heart and Brain (Composition)

		// Accessing Bike details directly (Aggregation)
		System.out.println("==Bike Info==");
		System.out.println(b.getbBrand());
		System.out.println(b.getbMileage());

		// Accessing Book details directly (Aggregation)
		System.out.println("==Book Info==");
		System.out.println(b1.getbName());
		System.out.println(b1.getbAuthor());

		// Accessing Composition objects (Heart and Brain inside Student)
		System.out.println("==Heart Info==");
		System.out.println(std.hrt.gethWeight());
		System.out.println(std.hrt.gethBpm());

		System.out.println("==Brain Info==");
		System.out.println(std.brn.getbWieght());
		System.out.println(std.brn.getbColour());

		// Using Aggregation methods — passing Bike and Book to Student
		System.out.println("==Using hasA Methods==");
		std.hasA(b);    // Bike passed to Student method
		std.hasA1(b1);  // Book passed to Student method
	}
}
