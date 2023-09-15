package checker;

import java.util.Scanner;

import checkerLev2.deciderLev2;
import guessComp.guessNumComp;
import restart.restarting;
import userGuess.guessNumUser;

public class decider {
	public void decide() {
		Scanner sc = new Scanner(System.in);
		String s1;
		deciderLev2 obj3 = new deciderLev2();
		restarting obj2 = new restarting();
		guessNumUser obj = new guessNumUser();
		guessNumComp obj1 = new guessNumComp();
		int numFromComp = obj1.compGuess();
		boolean flag = false;
		int count = 0;
		while(!flag) {
			try {
				int numFromUser = obj.guessUser();
				int ans = numFromUser - numFromComp;
				count++;
				if(ans > 0) {
					System.out.println("oh! you should think a lesser number");
				}
				else if(ans < 0) {
					System.out.println("Guess number higher");
				}
				else {
					flag = true;
					System.out.println("You have guessed the correct number in "+count+" try");
				}
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("Invalid input");
				System.out.println("Reinitialize the game");
				flag = true;
			}
		}
		System.out.println("Do you want to play Level 2 ? (yes/no) = ");
		s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		if(s1.equals("yes")) {
			System.out.println("Welcome back again");
			System.out.println("------------------");
			System.out.println("Your previous score was = "+count);
			obj3.checkingLev2();
		}
		else {
			System.out.println("Game over");
			return;
		}
	}
}
