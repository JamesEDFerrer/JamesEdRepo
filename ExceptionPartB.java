// Sem 2 Seatwork 7 Part B

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Main {
    static void checkPassword(String password) throws PasswordException {
        if (password.length() < 12) {
            throw new PasswordException("Passkey must be 12 characters long.")
        } else {
            System.out.println("Passkey allowed.")
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("Earth");
        } catch (PasswordException e) {
            System.out.println("PasswordException: " + e.getMessage());
        }
    }
}