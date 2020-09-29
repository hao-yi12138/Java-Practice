import java.sql.*;
import java.util.Arrays;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-09-24 18:51
 **/
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //建立数据库连接
        String defaultDatabaseName = "hy_924";
        String user = "root";
        String password = "as4567";
        String url = "jdbc:mysql://127.0.0.1:3306/"+defaultDatabaseName+"?useSSL=false&characterEncoding=utf8";
        Connection connection = DriverManager.getConnection(url,user,password);
        //打印验证是否连接成功
        System.out.println(connection);

        //queryDemo(connection);
        //updateDemo(connection);
        connection.close();
    }

    private static void updateDemo(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "insert into student_923 (sn,name,sex) values ('10003','小李'，'男')";
        int affectedRows = statement.executeUpdate(sql);
        System.out.printf("Query OK, %d row affected%n",affectedRows);
        statement.close();
    }
    private static void queryDemo(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "select * from student_923";
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        System.out.println("+----+-------+--------+-----+");
        System.out.println("| id | sn    | name   | sex |");
        System.out.println("+----+-------+--------+-----+");
        while(resultSet.next()){
            String id = resultSet.getString(1);
            String sn = resultSet.getString(2);
            String name = resultSet.getString(3);
            String sex = resultSet.getString(4);
            System.out.format("| %2s | %4s | %6s| %3s |%n",id,sn,name,sex);
           count++;
        }
        System.out.println("+----+-------+--------+-----+");
        System.out.format("%d rows in set",count);

        resultSet.close();
        statement.close();
    }
}
