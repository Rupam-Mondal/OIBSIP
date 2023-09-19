package balenceUpdater;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateBalence {
    public void update(int pin, double newBalance) {
        String url = "jdbc:mysql://localhost:3306/atm";
        String username = "root";
        String password = "Rupam@2022";
        
        String updateQuery = "UPDATE atm_accounts SET Balance = ? WHERE PIN = ?";
        
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setDouble(1, newBalance);
            preparedStatement.setInt(2, pin);
            
            int rowsAffected = preparedStatement.executeUpdate();
//            
//            if (rowsAffected > 0) {
//                System.out.println("Balance withdrawal successfully.");
//            } else {
//                System.out.println("No account found with the provided PIN.");
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

