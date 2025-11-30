import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest
{
    public static void main(String[] args) throws Exception {


        List<Brand> brandList = new ArrayList<>();

        //构造Druid配置对象
        Properties prop = new Properties();
        //引用Druid配置
        prop.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        //创建DataSource
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        //获取连接池
        Connection conn = ds.getConnection();

        //增加数据
        /*
        PreparedStatement pstmt = conn.prepareStatement
                ("insert into tb_brand(brand_name,company_name,ordered,description,status) values(?,?,?,?,?)");

        String brandName = "我的品牌1";
        String companyName= "pvzer";
        int ordered = 80;
        String description = "热爱pvz的品牌";
        int status = 1;

        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);

        int result = pstmt.executeUpdate();

        if(result > 0) System.out.println("插入数据完成");
        else System.out.println("插入失败");
        */

        //删除数据
        /*
        int i = 4;
        PreparedStatement pstmt = conn.prepareStatement
                ("delete from tb_brand where id = ?");

        pstmt.setInt(1, i);

        int result = pstmt.executeUpdate();

        if(result == 1) System.out.println("删除数据完成");
        else System.out.println("删除失败");
        */

        //修改数据

        PreparedStatement pstmt = conn.prepareStatement
                ("update tb_brand set brand_name = ?,company_name = ? , ordered = ? , description = ? , status = ?  where id = ?");

        int i = 7;
        String brandName = "数据公司";
        String companyName= "orcal";
        int ordered = 5;
        String description = "我们公司很牛逼";
        int status = 1;

        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);
        pstmt.setInt(6,i);

        int result = pstmt.executeUpdate();

        if(result > 0) System.out.println("修改数据完成");
        else System.out.println("修改失败");



        //查询数据
        /*PreparedStatement pstmt = conn.prepareStatement
                ("select * from tb_brand");

        ResultSet result = pstmt.executeQuery();

        while(result.next())
        {
            int id = result.getInt("id");
            String brandName = result.getString("brand_name");
            String companyName = result.getString("company_name");
            int ordered = result.getInt("ordered");
            String description = result.getString("description");
            Integer status = result.getInt("status");

            brandList.add(new Brand(id,brandName,companyName,ordered,description,status));
        }

        result.close();*/
        pstmt.close();
        conn.close();

        for(Brand n:brandList)
        {
            System.out.println(n.toString());
        }
    }
}
