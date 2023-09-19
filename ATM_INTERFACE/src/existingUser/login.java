package existingUser;

import java.util.Scanner;

import balenceFetch.fetching;
import newAccountAct.newOperation;

public class login {
	public void detailsLoad() {
		fetching obj = new fetching();
		newOperation obj1 = new newOperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter registered user name = ");
		String userName = sc.nextLine();
		System.out.println("Enter registered pin = ");
		int pin = sc.nextInt();
		try {
			double a = obj.getBalance(pin);
			if(a == -1) {
				return;
			}
			obj1.options(pin);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
