 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
	
		String momsBirthday = "December 30th";
		String dadsBirthday = "Janurary 27th";
		String myBirthday = "Novenber 29th";

		
	String who = JOptionPane.showInputDialog("Who's Birthday do you want to be reminded of?");
	
	//JOptionPane.showMessageDialog(null, who);

	if (who.equals("mom")) {
		JOptionPane.showMessageDialog(null, who+"'s birthday is " +momsBirthday);
	}
	else if (who.equals("dad")) {
		JOptionPane.showMessageDialog(null, who+"'s birthday is " +dadsBirthday);
	}
	else if (who.equals("Maria")) {
		JOptionPane.showMessageDialog(null, who+"'s birthday is " +myBirthday);
	}
	else{
		JOptionPane.showMessageDialog(null, "Sorry, I don't think I know that name, maybe try a different one?");
	}
	

	} 
}