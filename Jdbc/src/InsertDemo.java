import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class InsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/College", "root", "root123");
            Statement statement = con.createStatement();
            String query = "  INSERT INTO Student(Id,Name,RollNo,Email)VALUES(4,'Swayam',37447,'swayam123@gmail.com'); ";
            int update = statement.executeUpdate(query);
            System.out.println("Inserted"+update+"Row");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}