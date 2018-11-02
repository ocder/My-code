import java.sql.*;

public class LinkSQL {

    public static void main(String[] args) {
      GetConnection();
  }
  /*和数据库取得连接函数*/
    public static Connection GetConnection() {
        String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
        String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Test";//数据源  ！！！！注意若出现加载或者连接数据库失败一般是这里出现问题
        String Name="sa";
        String Pwd="wqshd16073123";
        Connection conn = null;

        try{
            Class.forName(driverName);
            conn=DriverManager.getConnection(dbURL,Name,Pwd);
            System.out.println("连接数据库成功");
        } 
        catch(Exception e){
            e.printStackTrace();
            System.out.println("连接失败");
        }
        return conn;
    }
}