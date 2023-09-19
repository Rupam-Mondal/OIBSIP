package withdrawal;

import java.util.Scanner;

public class withdraw {
	public double reduceBal(double balence) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdrawal amount = ");
		double a = sc.nextDouble();
		if(a > balence) {
			System.out.println("Insufficient balence");
		}
		else {
			balence = balence - a;
			System.out.println("Balence withdrawal successfully");
		}
		return balence;
	}
}
