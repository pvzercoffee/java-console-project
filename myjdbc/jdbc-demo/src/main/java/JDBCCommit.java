import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCCommit
{
    public static void main(String[] args) throws Exception {

        //列出主机地址、用户名和密码
        String host = "jdbc:mysql://192.168.88.129:3306/pvzercoffee?useSSL=false";
        String user = "root";
        String password = "1234";


        //获取jdbc的conn对象
        Connection conn = DriverManager.getConnection(host,user,password);

        Statement stmt = conn.createStatement();
        int count2 = 0;

        //异常包裹，出现异常时回滚事务
        try {
            //开启手动提交事务
            conn.setAutoCommit(false);

            //执行第一条sql
            String sql1 = "update student set name = '第一个名字' where code = '0000000001'";
            int count1 = stmt.executeUpdate(sql1);

            System.out.println(count1);

            //执行第二条sql
            String sql2 = "update student set name = '第二个名字' where code = '0000000002'";
            count2 = stmt.executeUpdate(sql2);

            //提交事务
            conn.commit();
        } catch (Exception e) {
            //异常回滚
            conn.rollback();
            System.out.println("出现异常！");
        }

        System.out.println(count2);

        //释放
        stmt.close();
        conn.close();
    }
}
