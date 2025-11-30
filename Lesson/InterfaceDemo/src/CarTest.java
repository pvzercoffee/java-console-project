import transport.Car;

public class CarTest {
    public static void main(String[] args) {
        testCount();
    }
    public static void testCount()
    {
        Car car = new Car();
        System.out.println(car.count);

        Car car2 = new Car();
        System.out.println(car2.count);
    }
}
