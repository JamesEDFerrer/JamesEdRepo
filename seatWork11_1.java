public class seatWork11_1 {
  public static void main(String[] args) {
    System.out.println("Seatwork No. 11 Part 1");

    int[][] myNumbers = { { 1, 4, 2}, {3, 6, 8, 5, 2} };

    for (int row = 0; row < myNumbers.length; row++) {
      for (int col = 0; col < myNumbers[row].length; col++) {
        System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
      }
    }
  }
}
