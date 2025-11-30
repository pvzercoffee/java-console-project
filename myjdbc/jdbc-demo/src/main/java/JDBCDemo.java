import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) throws Exception
    {

        String url = "jdbc:mysql://192.168.88.129:3306/pvzercoffee";
        String user = "root";
        String password = "1234";

        String sql = "update student set name = '修改后的名字' where telephone = '19574587026'";

        Connection conn = DriverManager.getConnection(url,user,password);

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();
        conn.close();
    }
}