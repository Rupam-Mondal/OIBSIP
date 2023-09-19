package deposite;

import java.util.Scanner;

public class addBal {
	public double add(double balence) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value you want to deposite = ");
		double a = sc.nextDouble();
		if(a < 0) {
			System.out.println("Invalid amount");
		}
		else {
			balence = balence + a;
			System.out.println("Balance updated");
		}
		return balence;
	}
}
