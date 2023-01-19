package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {

	public static void main(String[] args) {
	
		Random ran = new Random();
		
		String message = "";
		
		int numbers = 0;
		
		for (int lottery=0; lottery<6; lottery+=1) {
			numbers = ran.nextInt(75);
			message += numbers + ", ";
			
		}
		
		JOptionPane.showMessageDialog(null, message);
		
	}
}
