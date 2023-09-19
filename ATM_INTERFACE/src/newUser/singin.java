package newUser;

import java.util.Scanner;

import newUserop.opration;

public class singin {
	public void register() {
		opration obj=  new opration();
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("Enter your username = ");
		String s1 = sc.nextLine();
		System.out.println("Enter new ATM pin = ");
		int a = sc.nextInt();
		try {
			obj.depo(a, s1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
