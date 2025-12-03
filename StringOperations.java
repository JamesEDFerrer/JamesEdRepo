import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.println("Enter a string (type 'exit' to quit):");
            inputString = scanner.nextLine();

            if (!inputString.equals("exit")) {
                int i = 0;
                while (i < 1) {
                    System.out.println("Length of the string: " + inputString.length());
                    System.out.println("Uppercase: " + inputString.toUpperCase());
                    System.out.println("Lowercase: " + inputString.toLowerCase());
                    System.out.println("First Character: " + inputString.charAt(0));
                    System.out.println("Last Character: " + inputString.charAt(inputString.length() - 1));

                    // Check if the string has enough characters to avoid StringIndexOutOfBoundsException
                    if (inputString.length() >= 5) {
                        System.out.println("Substring from 2nd to 5th character: " + inputString.substring(1, 5));
                    } else {
                        System.out.println("String is not long enough to extract substring from 2nd to 5th character.");
                    }
                    i++;
                }
            }
        } while (!inputString.equals("exit"));

        System.out.println("Program terminated.");
        scanner.close();
    }
}
