// DEBUG AND RUN!!
// SEM 2 SEATWORK 9

import java.util.ArrayList;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student Created " + name);
    }

    void displayInfo() {
        System.out.println("ID: " + id + ". Name" + name);
    }

    // CALLED BY GARBAGE COLLECTOR BEFORE OBJECT DESTRUCTION
    @Override
    protected void finalise() throws Throwable {
        System.out.println("Garbage Collector destroying Student Object: " + name);
    }
}

public class GarbageCollectorDemo {
    public static void main(String[] args) {

        System.out.println("=== Student Record System ===");

        // LIST TO STORE STUDENT OBJECTS
        ArrayList<Student> students = new ArrayList<>();

        // CREATING STUDENT OBJECTS
        students.add(new Student(1, "Juan"));
        students.add(new Student(2, "Maria"));
        students.add(new Student(3, "Pedro"));

        System.out.println("\n--- Displaying Student Records ---");
        for (Student s : students) {
            s.displayInfo();
        }

        // REMOVING REFERENCES
        System.out.println("\n--- Removing Student Records ---");
        students.remove(0); // JUAN REMOVED
        students.remove(0); // MARIA REMOVED

        // SYSTEM GARBAGE COLLECTION
        System.out.println("\nRequesting Garbage Collection...");
        System.gc();

        // CREATING MORE OBJECTS TO INCREASE MEMORY USAGE
        System.out.println("\n--- Creating Temporary Student Objects");
        for (int i = 4; i <= 20; i++) {
            Student temp = new Student(i, "TempStudent" + i);
        }

        // NULLIFYING REMAINING REFERENCES
        System.out.println("\n--- Clearing Remaining References ---");
        students = null;

        // REQUEST GC AGAIN
        System.out.println("\nRequesting Garbage Collection Again...");
        System.gc();

        // PAUSE TO ALLOW GC TO RUN
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("\n=== Program Ended ===");
    }
}