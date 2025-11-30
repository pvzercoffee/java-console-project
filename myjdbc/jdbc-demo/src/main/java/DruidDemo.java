import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;


public class DruidDemo
{
    public static void main(String[] args) throws Exception {
        //1.导入jar

        //2.定义配置文件
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        //3.加载配置文件
        DataSource source = DruidDataSourceFactory.createDataSource(props);
        //4.获取连接池对象
        Connection conn = source.getConnection();


    }
}
