public class Main {
  public static void main(String[] args) {
    System.out.println("JAMES FERRER");
    int balance = 500;
    int deposit = 200;
    int withdraw = 300;

    balance += deposit;
    System.out.println("After deposit: ₱" + balance);

    balance -= withdraw;
    System.out.println("After withdrawal: ₱" + balance);

    boolean isLowBalance = balance < 300;
    System.out.println("Is balance less than 500?" + isLowBalance;

    boolean hasPendingTransaction = true;
    boolean isVerifiedUser = true;

    if (isLowBalance && !hasPendingTransaction) {
      System.out.println("Add funds to continue.");
    } else if (isLowBalance || !isVerifiedUser {
      System.out.println("Warning: Limited features available.");
    }

    int studentFlag = 0b0001;
    int seniorFlag = 0b0010;
    int discountStatus = studentFlag | seniorFlag;

    System.out.println("Discount code (Bitwise OR): " + discountStatus);
    System.out.println("Is student?" + ((discountStatus & studentFlag) != 0));
    System.out.println("Is senior?" + ((discountStatus & seniorFlag) != 0));
  }
}
