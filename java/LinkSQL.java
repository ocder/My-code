import java.sql.*;
import java.util.*;

public class LinkSQL {

    private static final String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
    private final static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Test";//数据源  ！！！！注意若出现加载或者连接数据库失败一般是这里出现问题
    private static final String Name="sa";
    private static final String Pwd="wqshd16073123";

    private static Connection conn = null;
    //静态代码块（将加载驱动、连接数据库放入静态块中）
    static {
        try {
            Class.forName(driverName);
            conn=DriverManager.getConnection(dbURL,Name,Pwd);
            System.out.println("连接数据库成功");
        } 
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("连接失败");
        }
    }
    //对外提供一个方法来获取数据库连接
    public static Connection getConnection(){
        return conn;
    }
    //对外提供一个方法来关闭数据库连接
    public static void closeConnection() {
        if(conn != null) {  // 关闭连接对象   
            try {   
               conn.close();
               System.out.println("数据库已关闭");
            }
            catch(SQLException e) {   
               e.printStackTrace();   
            }
        }
    }

    public static void main(String[] args) {
        getConnection();
        closeConnection();
    }
}