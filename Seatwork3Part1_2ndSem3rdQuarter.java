// Seatwork No.3 Part 1, 2nd Semester 3rd Quarter
class Seatwork3Part1_2ndSem3rdQuarter {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Seatwork3Part1_2ndSem3rdQuarter {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
