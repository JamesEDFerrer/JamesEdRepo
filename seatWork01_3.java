import java.util.Scanner;

public class seatWork01_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an int: ");
    int myInt = input.nextInt();

    System.out.println("Enter a long: ");
    long myLong = input.nextLong();

    System.out.println("Enter a short: ");
    short myShort = input.nextShort();

    System.out.println("Enter a float: ");
    float myFloat = input.nextFloat();

    System.out.println("Enter a double: ");
    double myDouble = input.nextDouble();

    System.out.println("\n--- Display Original Values ---");
    System.out.println("int: " + myInt);
    System.out.println("long: " + myLong);
    System.out.println("short: " + myShort);
    System.out.println("float: " + myFloat);
    System.out.println("double: " + myDouble);

    double castedDouble = myInt;
    int castedInt = (int) myDouble;
    short castedShort = (short) myInt;
    long castedLong = (long) myFloat;

    System.out.println("\n--- After Casting ---");
    System.out.println("int to double (Widening): " + castedDouble);
    System.out.println("double to int (Narrowing): " + castedInt);
    System.out.println("int to short (Narrowing): " + castedShort);
    System.out.println("float to long (Narrowing): " + castedLong);
  }
}
