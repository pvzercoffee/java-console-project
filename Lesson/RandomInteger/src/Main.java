import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        randomGame();
    }
    public static void randomGame()
    {
        int userInput;
        int result = new Random().nextInt(100)+1;
        System.out.println("猜数字游戏，请猜一个1-100的数：");

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            userInput = scanner.nextInt();
            if(userInput > result)
            {
                System.out.println("你猜大了，再试一次");
            }
            else if(userInput < result)
            {
                System.out.println("你猜小了，再试一次");
            }
            else if(userInput == result)
            {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}