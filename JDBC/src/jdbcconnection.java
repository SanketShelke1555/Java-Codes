import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcconnection {
	public static void main(String[] args) {

        try {
            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Database URL
            String url = "jdbc:mysql://localhost:3306/tecknowell";

            // 3. DB credentials
            String user = "root";
            String password = "password";

            // 4. Create Connection
            Connection con =
                    DriverManager.getConnection(url, user, password);

            // 5. Test connection
            System.out.println("Connection Successful");

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
