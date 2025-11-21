// Seatwork No.3 Part 2, 2nd Semester 3rd Quarter
// Parent Class (Base Class)
class Person {
    // Encapsulated Variables (private)
    private String name;
    private int age;

    // Setters (Write Data)
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    // Getters (Read Data)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
// Child class (Derived class)
// Inheritance: student inherits Person
class Student extends Person {
    private String course;

    // Setter and Getter for new Variable
    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }

    // Responsive method (easy to modify)
    public void displayInfo() {
        System.out.println("-----Student Info-----");
        System.out.println("Name     : " + getName());
        System.out.println("Age      : " + getAge());
        System.out.println("Course   : " + getCourse());
        System.out.println("----------------------");
    }
}
// Main Class
public class Seatwork3Part2_2ndSem3rdQuarter {
    public static void main(String[] args) {
        // Create object of Child Class
        Student s = new Student();

        // Using setters from Person (Inherited)
        s.setName("James");
        s.setAge(17);

        // Using setter from Student
        s.setCourse("TECHPRO");

        // display all info
        s.displayInfo();
    }
}
