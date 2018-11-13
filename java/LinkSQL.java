import java.sql.*;
import java.util.*;

public class LinkSQL {

    Scanner scanner = new Scanner(System.in);
    private static final String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
    private final static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Test";//数据源  ！！！！注意若出现加载或者连接数据库失败一般是这里出现问题
    private static final String Name="sa";
    private static final String Pwd="wqshd16073123";
    private static Connection conn = null;
    private static Statement stmt = null;

    //静态代码块（将加载驱动、连接数据库放入静态块中）
    static {
        try {
            System.out.println("正在连接数据库...");
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
    //对外提供一个方法来新建表
    public void createTable() {
        System.out.println("正在新建表...");
        System.out.println("请输入SQL语句");
        String sql = scanner.nextLine();
        /*  手动输入时的样例
        CREATE TABLE test (id INTEGER not NULL,  first VARCHAR(255),  last VARCHAR(255),  age INTEGER,  PRIMARY KEY ( id ))
            程序中输入时的样例
        String sql = "CREATE TABLE test " + "(id INTEGER not NULL, " + " first VARCHAR(255), " + " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))"; 
        */
        System.out.println(sql);
        try {
            stmt = conn.createStatement();
        }
        /*创建表的测试样例
        "CREATE TABLE student "+"(id INTEGER not NULL, "+" first VARCHAR(255), "+" last VARCHAR(255), "+" age INTEGER, "+" PRIMARY KEY ( id ))"; 
        */
        catch(SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.executeUpdate(sql);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    //对外提供一个方法来插入数据
    public void insertData() {
        String sql = scanner.next();
        System.out.println("请输入SQL语句");
        try {
            stmt = conn.createStatement();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.executeUpdate(sql);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        LinkSQL link = new LinkSQL();
        link.createTable();
        link.insertData();
        closeConnection();
    }
}