package util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by double on 16-12-21.
 */
public class DButil {
    private static String diverName;
    private static String url;
    private static String username;
    private static String password;
    static {
       try {
           Properties properties = new Properties();
           InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
           properties.load(inputStream);
           diverName= properties.getProperty(diverName);
           url=properties.getProperty(url);
           username = properties.getProperty(username);
           password=properties.getProperty(password);
           Class.forName(diverName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
    //链接数据库的方法 需要用到DriverManager.getConnection然后再次传入三个参数,链接MySQL数据库
    public static Connection getConnection(){
       Connection connection =null;
        try {
            connection= DriverManager.getConnection(url,username,password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void close(Connection con){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(PreparedStatement ps){
        if (ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
