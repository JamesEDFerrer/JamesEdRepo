public class seatWork01_1 {
  public static void main(String[] args) {
    float loadBalance = 49.75f;
    System.out.println("Your current Load Balance is: ₱" + loadBalance);

    int roundedBalance = (int) loadBalance;

    System.out.println("Rounded Load Balance(for promo checking): ₱" + roundedBalance);
  }
}
