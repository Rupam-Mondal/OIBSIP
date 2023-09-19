package starter;

import java.util.Scanner;

import existingUser.login;
import newUser.singin;

public class Main {
	public static void main(String[] args) {
		singin obj= new singin();
		login obj1 = new login();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our ATM");
		System.out.println("Already have a account(yes/no)? = ");
		String s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		if(s1.equals("yes")) {
			obj1.detailsLoad();
		}
		else {
			obj.register();
		}
	}
}
