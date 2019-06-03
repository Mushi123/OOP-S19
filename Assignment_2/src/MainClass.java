import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;

public class MainClass {
	public static void main(String []args) {
		SavingAccount [] s = new SavingAccount[50];
		for(int i = 1;i < 51;i++) {
			char c = 'S';
			if(i > 25) c = 'C';
			s[i-1] = new SavingAccount("TTU"+i,i,c,0,i*10);
		}
		Utilities u = new Utilities();
//		u.SearchBalanceByName(s,"TTU4");
//		u.addInterestByName(s, "TTU4",24);
		u.displayAllByAccountType(s, 'C');
		
	}

}
