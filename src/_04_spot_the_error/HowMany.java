package _04_spot_the_error;

import java.util.Random;

public class HowMany {
	
	// This program is supposed to print a random number between 1 and 100.
	// BUT it's not working. If you don't believe me, try running it.
	
	
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100)+1;
		System.out.println(number);
		
		
	}
}
