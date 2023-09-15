package guessComp;

import java.util.Random;

public class guessNumComp {
	public int compGuess() {
		Random random = new Random();
		System.out.println("Level 1 started");
		System.out.println("Computer has succesfully guessed a number from 1 to 100");
		System.out.println("-----------------------------------------");
		int randNum = random.nextInt(100 + 1) + 1;
		return randNum;
	}
}
