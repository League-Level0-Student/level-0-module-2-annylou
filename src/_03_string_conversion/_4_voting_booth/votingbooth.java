package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
	
public static void main(String[] args) {
	String old = JOptionPane.showInputDialog("how old are you in years");
	int age = Integer.parseInt(old);
	if(age>=18) {
		JOptionPane.showInputDialog("who should be the new president");
		}
	else {
		JOptionPane.showMessageDialog(null, "no one cares what you think");
		}
	}
}
