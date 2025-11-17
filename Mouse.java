// Seatwork No.2, 2nd Semester, 3rd Quarter

public class Mouse {
    private String model;
    private double price;
    private int amount;

    Mouse(String model, double price, int amount) {
        this.setModel(model);
        this.setPrice(price);
        this.setAmount(amount);
    }

    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public int getAmount() {
        return amount;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse("Gaming Mouse", 1500.5, 3);

        System.out.println("Model: " + mouse.getModel());
        System.out.println("Price: " + mouse.getPrice());
        System.out.println("Amount: " + mouse.getAmount());

        mouse.setModel("Office Mouse");
        mouse.setPrice(899.5);
        mouse.setAmount(6);

        System.out.println("Model: " + mouse.getModel());
        System.out.println("Price: " + mouse.getPrice());
        System.out.println("Amount: " + mouse.getAmount());
    }
}
