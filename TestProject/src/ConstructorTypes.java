
class Employee {
private String name;
 private int age;

 // Default constructor
public Employee() {
this.name = "Bikash";
this.age = 20;
}

 // Parameterized constructor
 public Employee(String name, int age) {
 this.name = name;
 this.age = age;
 }

 // Copy constructor
 public Employee(Employee other) {
 this.name = other.name;
 this.age = other.age;
 }

  // Getters and setter
 public String getName() {
return name;
}

public int getAge() {
return age;
}

public void setName(String name) {
this.name = name;
}

public void setAge(int age) {
this.age = age;
    }
}
public class ConstructorTypes {
	public static void main(String[] args) {
	     // Test default constructor
	      Employee ob1 = new Employee();
	        System.out.println("Default constructor:");
	        System.out.println("Name: " + ob1.getName());
	        System.out.println("Age: " + ob1.getAge());

	        // Test parameterized constructor
	      Employee ob2 = new Employee("Biswojeet", 25);
	        System.out.println("\nParameterized constructor:");
	        System.out.println("Name: " + ob2.getName());
	        System.out.println("Age: " + ob2.getAge());

	        // Test copy constructor
	      Employee ob3 = new Employee(ob2);
	        System.out.println("\nCopy constructor:");
	        System.out.println("Name: " + ob3.getName());
	        System.out.println("Age: " + ob3.getAge());
	    }
}
