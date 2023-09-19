package newUserop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import newAccountAct.newOperation;

public class opration {
	public void depo(int pin , String userid)throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("As you are a new user , you can only deposite money");
		System.out.println("Enter the amount = ");
		double amount = sc.nextInt();
		String url = "jdbc:mysql://localhost:3306/atm"; 
        String username = "root";
        String pass = "Rupam@2022";
        String query = "insert into atm_accounts values (? , ? , ?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, pass);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, pin);
        st.setString(2, userid);
        st.setDouble(3, amount);
        int count = st.executeUpdate();
        st.close();
        con.close();
        System.out.println("Your account has succesfully created");
		System.out.println("You can also do below operations");
		System.out.println("--------------------------------");
        newOperation obj = new newOperation();
        obj.options(pin);
	}
}
