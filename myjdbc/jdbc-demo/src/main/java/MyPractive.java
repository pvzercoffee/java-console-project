import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyPractive
{
    public static void main(String[] args) throws SQLException {
        String address = "jdbc:mysql://centos/pvzercoffee";
        String username = "root";
        String password = "1234";

        Connection conn = DriverManager.getConnection(address,username,password);
        Statement stmt = conn.createStatement();

        String sql = "update student set name = '测试更新' where code = '0000000001'";

        int count = stmt.executeUpdate(sql);

        System.out.println("受影响行数："+count);

        stmt.close();
        conn.close();
    }
}
