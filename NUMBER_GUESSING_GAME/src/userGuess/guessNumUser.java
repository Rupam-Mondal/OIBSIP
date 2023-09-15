package userGuess;
import java.util.Scanner;

public class guessNumUser{
	public int guessUser(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Now try to guess a that value = ");
		int num = sc.nextInt();
		return num;
	}
}
