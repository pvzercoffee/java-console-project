import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCPreparedStatement
{
    public static void main(String[] args) throws Exception {
        //列出主机地址、用户名和密码
        String host = "jdbc:mysql://centos/pvzercoffee?useServerPrepStmts=true";
        String user = "root";
        String password = "1234";

        ArrayList<Student> list = new ArrayList<>();

        //让控制台得到查询字段
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名以查询数据：");
        String query = sc.nextLine();

        //获取Connection对象
        Connection conn = DriverManager.getConnection(host,user,password);

        //写好sql语句，关键字段用?代替
        String sql = "select * from student where name = ?";

        //获取PreparedStatement
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置pstmt的问号部分数据
        pstmt.setString(1,query);

        //提交sql
        ResultSet rs = pstmt.executeQuery();

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
        for(Student stu : list)
            stu.print();

        rs.close();
        pstmt.close();
        conn.close();
    }
}
