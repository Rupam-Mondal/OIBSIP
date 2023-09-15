package checkerLev2;

import java.util.Scanner;

import LevelUp.Level2;
import restart.restarting;
import userGuess.guessNumUser;

public class deciderLev2 {
	public void checkingLev2() {
		Scanner sc = new Scanner(System.in);
		String s1;
		restarting obj1 = new restarting();
		Level2 obj = new Level2();
		guessNumUser obj2 = new guessNumUser();
		int numFromComp = obj.compGuessLev2();
		boolean flag = false;
		int count = 0;
		while(!flag) {
			try {
				int numFromUser = obj2.guessUser();
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
		System.out.println("Do you want to play again? (yes/no) = ");
		s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		if(s1.equals("yes")) {
			System.out.println("Welcome back again");
			System.out.println("------------------");
			System.out.println("Your previous score was = "+count);
			obj1.againStart();
		}
		else {
			System.out.println("Game over");
			return;
		}
	}
}
