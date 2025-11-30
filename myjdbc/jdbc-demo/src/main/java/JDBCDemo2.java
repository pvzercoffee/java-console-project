import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2
{
    public static void main(String[] args) throws Exception {

        //列出主机地址、用户名和密码
        String host = "jdbc:mysql://192.168.88.129:3306/pvzercoffee?useSSL=false";
        String user = "root";
        String password = "1234";

        //列出sql语句
        String sql = "update student set name = '测试02' where telephone = '19574587026'";

        //获取jdbc的conn对象
        Connection conn = DriverManager.getConnection(host,user,password);

        Statement stmt = conn.createStatement();

        //int接收受影响行数，用于执行sql语句
        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        //释放
        stmt.close();
        conn.close();
    }
}
