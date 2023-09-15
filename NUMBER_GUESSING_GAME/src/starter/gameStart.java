package starter;
import java.util.Scanner;

import checker.decider;
import checkerLev2.deciderLev2;
import restart.restarting;

public class gameStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		decider obj= new decider();
		System.out.println("Welcome to the game");
		System.out.println("--------------------");
		System.out.println("In this game you have to guess a number which should be equal to computer guessed number");
		System.out.println();
		System.out.println("Level 1 :");
		System.out.println("guess from 1 to 100");
		System.out.println("Level 2 :");
		System.out.println("guess from 1 to 1000");
		System.out.println();
		obj.decide();
	}
}
