package balenceFetch;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetching {
    public double getBalance(int pin) throws Exception {
        String url = "jdbc:mysql://localhost:3306/atm";
        String username = "root";
        String pass = "Rupam@2022";
        String query = "SELECT Balance FROM atm_accounts WHERE PIN=" + pin;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                double balance = rs.getDouble("Balance");
                return balance;
            } else {
                System.out.println("No account found with the provided PIN.");
            }

            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}

