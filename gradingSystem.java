import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fill out the following.");
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Grade Level: ");
        int gradeLevel = input.nextInt();
        input.nextLine();
        System.out.print("Strand & Section: ");
        String strandSection = input.nextLine();

        System.out.println("\nNow, enter their following grades");
        System.out.print("\nEffective Communication: ");
        double effComm = input.nextDouble();
        System.out.print("\nGeneral Math: ");
        double genMath = input.nextDouble();
        System.out.print("\nLife & Career Skills");
        double LifSki = input.nextDouble();
        System.out.print("\nPag-aaral sa Kasaysayan at Lipunang Pilipino: ");
        double PASKALP = input.nextDouble();
        System.out.print("\nProgramming: ");
        double genProg = input.nextDouble();
        System.out.print("\nGeneral Science: ");
        double genSci = input.nextDouble();

        double gradeAverage = ((effComm + genMath + LifSki + PASKALP + genProg + genSci) / 6);

        char grade = '?';

        if (gradeAverage >= 90) {
            grade = 'A';
        } else if (gradeAverage >= 80 && gradeAverage <= 89) {
            grade = 'B';
        } else if (gradeAverage >= 70 && gradeAverage <= 79) {
            grade = 'C';
        } else if (gradeAverage >= 60 && gradeAverage <= 69) {
            grade = 'D';
        } else if (gradeAverage < 60) {
            grade = 'F';
        }

        String gradeSent = "Unknown";

        if (grade == 'A') {
            gradeSent = "Excellent";
        } else if (grade == 'B') {
            gradeSent = "Very Satisfactory";
        } else if (grade == 'C') {
            gradeSent = "Satisfactory";
        } else if (grade == 'D') {
            gradeSent = "Did not meet expectations";
        } else if (grade == 'F') {
            gradeSent = "Failed";
        }

        System.out.println("The student, " + name + " of " + strandSection.toUpperCase() + ", Grade " + gradeLevel + ", has an average score of " + gradeAverage + " and has been given the Grade of " + grade + ": " + gradeSent);
    }
}
