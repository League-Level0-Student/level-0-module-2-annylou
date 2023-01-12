//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
			System.out.println("123");
		}
		else if (randomNumber == 2) {
			System.out.println("234");
		}
		else if (randomNumber == 3) {
			System.out.println("345");
		}
		else if (randomNumber == 4) {
			System.out.println("456");
		}
		else {
			System.out.println("567");
		}
		// 2. Repeat all the code above 5 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
