package restart;

import checker.decider;
import checkerLev2.deciderLev2;

public class restarting {
	public void againStart() {
		decider obj = new decider();
		System.out.println("Try to reduce the number of try");
		System.out.println("-------------------------------");
		System.out.println("Computer has guessed a number");
		obj.decide();
	}
}
