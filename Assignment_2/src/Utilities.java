import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Utilities {
	public void SearchBalanceByName(SavingAccount[] s, String Name) {
		for(int i = 0; i < s.length; i++) {
			if(s[i].getAccountName().equals(Name)) {
				s[i].displayBalance();
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Name not found!","Error", JOptionPane.PLAIN_MESSAGE);
		return;
	}
	public void addInterestByName(SavingAccount[] s, String Name,double r) {
		for(int i = 0; i < s.length; i++) {
			if(s[i].getAccountName().equals(Name)) {
				s[i].setRate(r);
				s[i].addInterest();
				JOptionPane.showMessageDialog(null, "The current balance for "+Name+" is "+s[i].getBalance(),"New Balance", JOptionPane.PLAIN_MESSAGE);
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Name not found!","Error", JOptionPane.PLAIN_MESSAGE);
		return;
	}
	public void displayAllByAccountType(SavingAccount[] s, char at) {
		if (at != 'S' && at != 'C') {
			JOptionPane.showMessageDialog(null, "Please enter C or S.","Error", JOptionPane.PLAIN_MESSAGE);
			return;
		}

		StringBuilder res = new StringBuilder();
		for(int i = 0; i < s.length; i++) {
			if(s[i].getAccountType() == at) {
				res.append(s[i].displayAll());				
			}
		}
		JTextArea textArea = new JTextArea(res.toString());
		JScrollPane scrollPane = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
		JOptionPane.showMessageDialog(null,scrollPane,"Accounts",JOptionPane.PLAIN_MESSAGE);
	}

}
