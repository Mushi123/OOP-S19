import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Utilities {
    public SavingAccount [] s = new SavingAccount[50];
    public Utilities(){
        for(int i = 1;i < 51;i++) {
            char c = 'S';
            if(i > 25) c = 'C';
            s[i-1] = new SavingAccount("TTU"+i,i,c,0,i*10);
        }
    }
    public void SearchBalanceByName(String Name) {
            for(int i = 0; i < s.length; i++) {
                    if(s[i].getAccountName().equals(Name)) {
                            s[i].displayBalance();
                            return;
                    }
            }
            JOptionPane.showMessageDialog(null, "Name not found!","Error", JOptionPane.PLAIN_MESSAGE);
            return;
    }
    
}
