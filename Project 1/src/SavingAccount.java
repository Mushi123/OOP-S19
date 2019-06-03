import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;

public class SavingAccount extends Account
{
	private double rate;
	
	public SavingAccount(String n, int i, char at, double r, double b)
	{
		super(n, i, at, b);
		rate = r;
	}
	public void setRate(double r) {
		this.rate = r;
	}

	public void addInterest()
	{
		//Method needs Clarification
		this.deposit(this.getBalance()*this.rate/(100*12)); 
	}

	public void deductLoan()
	{
		//Method needs Clarification
	}
}
