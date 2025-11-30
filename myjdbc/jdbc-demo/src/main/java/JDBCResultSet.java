import java.sql.*;
import java.util.ArrayList;

public class JDBCResultSet
{

    public static void main(String[] args) throws SQLException {
        //0. 存储结果对象的列表
        ArrayList<Student> list = new ArrayList<>();

        //1.列出mysql地址、用户名、密码
        String address = "jdbc:mysql://centos/pvzercoffee";
        String username = "root";
        String password = "1234";

        //2.创建Connection对象,传入连接参数
        Connection conn = DriverManager.getConnection(address,username,password);

        //3.获取Statement，用于写sql语句
        Statement stmt = conn.createStatement();

        //4.写好查询语句
        String sql = "select * from student";

        //5.用ResultSet对象接收查询结果
        ResultSet rs = stmt.executeQuery(sql);

        //6.遍历保存结果
        //6.1. rs.next()指向下一个数据，若返回false则此行为无效行
        while(rs.next())
        {
            //6.2. getXxx()方法获取源数据
            String code = rs.getString("code");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String telephone = rs.getString("telephone");

            //6.3. 存储当前行数据到Student对象
            Student stu = new Student(code,name,age,telephone);
            //6.4. 添加到ArrayList
            list.add(stu);

        }
        //7. 释放资源
        rs.close();
        stmt.close();
        conn.close();

        //8. 试从ArrayList遍历查询到的所有结果
        for (Student student : list) student.print();
    }
}

