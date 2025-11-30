import com.pvzer.Car;
import com.pvzer.impl.Rectangle;
import com.pvzer.impl.Triangle;
import com.pvzer.shape.Polygon;


public class Main {
    public static void main(String[] args) throws Exception {

        Polygon rectangle = new Rectangle(30,30);
        rectangle.showArea();

        Polygon triangle = new Triangle(30,30,40);
        triangle.showArea();

        Car car = new Car("pvzer","le5");
        car.displayInfo();

        //错误，无法修改
//        car.MAX_SPEED = 8;
    }
}