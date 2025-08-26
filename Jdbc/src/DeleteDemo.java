import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DeleteDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/College", "root", "root123");
            Statement statement = con.createStatement();
            String query = " Delete From Student where Id=4 ";
            int Delete = statement.executeUpdate(query);
            System.out.println("Deleted "+Delete+" Row");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}