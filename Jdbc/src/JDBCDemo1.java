 import java.sql.*;

    public class JDBCDemo1 {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/College";
            String user = "root";
            String pass = "root123";

            try (
                    Connection con = DriverManager.getConnection(url, user, pass);
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM Student WHERE id=?")
            ) {
                    ps.setInt(1, 1); // set parameter
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getInt("Id") + " - " + rs.getString("Name"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

