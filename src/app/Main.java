package app;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		do {
		System.out.println("Menu");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		} while(choice > 1);
		
		//example1();
	}
	
	public static void example1()
	{
		Bank bank = new Bank("Bank of CPHS");
		int ewbankAccountNo = bank.createAccount("Mr. Ewbank");
		int howardAccountNo = bank.createAccount("Mr. Howard");
		
		bank.deposit(ewbankAccountNo, 25);
		bank.deposit(howardAccountNo, 75);

		bank.checkBalance(ewbankAccountNo);
		bank.checkBalance(howardAccountNo);
		
		bank.withdraw(ewbankAccountNo, 10);
		bank.closeAccount(howardAccountNo);
		
		bank.checkBalance(ewbankAccountNo);
		bank.checkBalance(howardAccountNo);
		
	}
}
