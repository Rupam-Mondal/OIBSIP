package LevelUp;

import java.util.Random;

public class Level2 {
	public int compGuessLev2() {
		Random random = new Random();
		System.out.println("Computer has guessed a number from 1 to 1000");
		int randNum = random.nextInt(1000) + 1;
		return randNum;
	}
}
