package userDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userInformation {
    public void getUserDetails(int pin) {
        String url = "jdbc:mysql://localhost:3306/atm";
        String username = "root";
        String password = "Rupam@2022";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM atm_accounts WHERE PIN = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, pin);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String userID = resultSet.getString("UserID");
                double balance = resultSet.getDouble("Balance");
                
                System.out.println("User ID: " + userID);
                System.out.println("PIN: " + pin);
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("No user found with the provided PIN.");
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

