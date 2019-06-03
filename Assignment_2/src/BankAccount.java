import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;

public class BankAccount
{
	private String strName;
	private int id;
	private char accountType;
	private double balance;//Assignment calls for methods that will tap into the account balance. 

	public BankAccount()
	{
		strName = "Standard account of anonymous citizen";
		id = 0;
		accountType = 'C';
		balance = 0.0;
	}

	public BankAccount(String n, int i, char at, double b)
	{
		strName = n;
		id = i;
		accountType = at;
		balance = b;
	}

	public String getAccountName()
	{
		return strName;
	}
	
	public int getID()
	{
		return id;
	}

	public char getAccountType()
	{
		return accountType;
	}

	public double getBalance()
	{
		return balance;
	}
	
	
	public void setAccountName(String n)
	{
		strName = n;
	}	

	public void setId(int newId)
	{
		id = newId;
	}

	public void setAccountType(char c)
	{
		accountType = c;
	}

	public void withdraw(double amount)
	{
		balance -= amount;
	}

	public void deposit(double amount)
	{
		balance += amount;
	}

	public void displayBalance()
	{
		JOptionPane.showMessageDialog(null, "The account balance is " + balance , "Bank account " + strName, JOptionPane.PLAIN_MESSAGE);
	}

	public String displayAll()
	{
		//JOptionPane.showMessageDialog(null, "Account Information : \nName: " + strName + "\nID: " + id + "\nAccountType: " + accountType + "\nBalance: " + balance, "Bank", JOptionPane.PLAIN_MESSAGE);
		return "Account Information : \nName: " + strName + "\nID: " + id + "\nAccountType: " + accountType + "\nBalance: " + balance + "\n\n";
	}
}
