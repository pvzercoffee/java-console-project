import bird.BirdSimulator;
import bird.impl.Penguin;
import bird.impl.Sparrow;

public class BirdTest {
    public static void main(String[] args) {
        testSoon();
    }

    public static void testSoon()
    {
        Penguin penguin = new Penguin();
        Sparrow sparrow = new Sparrow();

        BirdSimulator birdSimulator = new BirdSimulator();
        birdSimulator.simulateSong(penguin);
        birdSimulator.simulateSong(sparrow);
    }
}