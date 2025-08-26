import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class UpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/College", "root", "root123");
            Statement statement = con.createStatement();
            String query = "  update Student set Name='Rama' where Id=1; ";
            int update = statement.executeUpdate(query);
            System.out.println("Updated"+update+"Row");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}