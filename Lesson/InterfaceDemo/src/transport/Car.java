package transport;

public class Car {
    private String breed;
    private String model;
    private int price;

    public int count = 0;

    public Car(String breed, String model, int price)
    {
        this.breed = breed;
        this.model = model;
        this.price = price;

        count++;
    }
    public Car() {
        count++;
    }
}
