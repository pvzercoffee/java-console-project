import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        login();

        String[] userDate;
        System.out.println("请输入生日（YYYY-MM-DD）");
        Scanner scanner = new Scanner(System.in);
        userDate = scanner.nextLine().split("-");
        int age = 2025-Integer.parseInt(userDate[0]);
        System.out.println("您的年龄为："+age);
    }

    public static void login()
    {
        String username = "张三";
        String password = "123456ABc";
        String usernameInput;
        String passwordInput;

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入用户名");
            usernameInput = sc.nextLine();
            System.out.println("请输入密码");
            passwordInput = sc.nextLine();

            if(!(usernameInput.equals(username) && passwordInput.equals(password)))
            {
                System.out.println("用户名或密码错误");
                continue;
            }

            break;
        }

        System.out.println("登录成功！"+username);
    }
}