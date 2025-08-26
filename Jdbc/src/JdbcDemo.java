import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con= DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/College", "root","root123");
           Statement statement=con.createStatement();
           String query="select * from student";
           ResultSet rs=statement.executeQuery(query);
           System.out.println("----Read Data-----");
           while(rs.next()) {
               System.out.println(
                       rs.getInt("Id") + "|" +
                               rs.getString("Name") + "|" +
                               rs.getInt("RollNo") + "|" +
                               rs.getString("Email") + "|"
               );
           }
       }catch(Exception e){
e.printStackTrace();
       }
    }
}