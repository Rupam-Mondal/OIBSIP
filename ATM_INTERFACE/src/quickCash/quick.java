package quickCash;

import java.util.Scanner;

public class quick {
	public double quickWithdrawal(double balence) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.100");
		System.out.println("2.200");
		System.out.println("3.500");
		System.out.println("4.4000");
		System.out.println("5.5000");
		System.out.println("6.10000");
		System.out.println("You can directly write withdrawal index number = ");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			if(100 > balence) {
				System.out.println("Insufficient balance");
			}
			else {
				balence = balence - 100;
				System.out.println("Balence withdrawal successfull");
			}
			break;
		case 2:
			if(200 > balence) {
				System.out.println("Insufficient balance");
			}
			else {
				balence = balence - 200;
				System.out.println("Balence withdrawal successfull");
			}
			break;
		case 3:
			if(500 > balence) {
				System.out.println("Insufficient balance");
			}
			else {
				balence = balence - 500;
				System.out.println("Balence withdrawal successfull");
			}
			break;
		case 4:
			if(4000 > balence) {
				System.out.println("Insufficient balance");
			}
			else {
				balence = balence - 4000;
				System.out.println("Balence withdrawal successfull");
			}
			break;
		case 5:
			if(5000 > balence) {
				System.out.println("Insufficient balance");
			}
			else {
				balence = balence - 5000;
				System.out.println("Balence withdrawal successfull");
			}
			break;
		case 6:
			if(10000 > balence) {
				System.out.println("Insufficient balance");
			}
			else {
				balence = balence - 10000;
				System.out.println("Balence withdrawal successfull");
			}
			break;
		}
		return balence;
	}
}
