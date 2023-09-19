package newAccountAct;

import java.util.Scanner;


import balenceFetch.fetching;
import balenceUpdater.updateBalence;
import deposite.addBal;
import quickCash.quick;
import userDetails.userInformation;
import withdrawal.withdraw;

public class newOperation {
	public static void options(int pin) {
		Scanner sc = new Scanner(System.in);
		fetching obj = new fetching();
		withdraw obj1 = new withdraw();
		updateBalence obj2 = new updateBalence();
		addBal obj3 = new addBal();
		quick obj4 = new quick();
		userInformation  obj5 = new userInformation();
//		System.out.println("Your account has succesfully created");
//		System.out.println("You can also do below operations");
//		System.out.println("--------------------------------");
		String s1 = "";
		do {
			System.out.println("1.check balence");
			System.out.println("2.Withdrawl");
			System.out.println("3.Deposite");
			System.out.println("4.Quick cash");
			System.out.println("5.check userdetails");
			System.out.println("Enter your choice = ");
			int op = sc.nextInt();
			switch(op) {
			case 1:
				try {
					double a = obj.getBalance(pin);
					System.out.println("Your bank balance = "+a);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					double a1 = obj.getBalance(pin);
					double curBalence = obj1.reduceBal(obj.getBalance(pin));
					obj2.update(pin , curBalence);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					double CurrBal = obj.getBalance(pin);
					double bal = obj3.add(CurrBal);
					obj2.update(pin, bal);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//add Balance
				break;
			case 4:
				try {
					double bal1 = obj.getBalance(pin);
					double currBal1 = obj4.quickWithdrawal(bal1);
					obj2.update(pin, currBal1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				obj5.getUserDetails(pin);
				break;
			}
			sc.nextLine();
			System.out.println("Do you want any further operation(yes/no)?");
			s1 = sc.nextLine();
			s1.toLowerCase();
		}while(s1.equals("yes"));
		
	}
}
