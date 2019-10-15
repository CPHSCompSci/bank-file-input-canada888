package app;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		Scanner bankInfo = new Scanner(System.in);
		
		
		Bank newBank = new Bank("Bank of America");
		int choice = 0;
		do {
		System.out.println("Menu");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check");
		System.out.println("4. Create");
		System.out.println("5. Close");
		System.out.println("6. Transfer");
		System.out.println("7. Quit");
		
		System.out.println("What would you like to do?");
		choice = userInput.nextInt();
		
		switch(choice)
		{
			case 1://Deposit
				System.out.println("What is your account number?");
				int number = bankInfo.nextInt();
				
				System.out.println("How much would you like to deposit?");
				int amountDep = bankInfo.nextInt();
				
				newBank.deposit(number, amountDep);
				
				System.out.println("Your balance is " + newBank.checkBalance(number));
				break;
				
			case 2://Withdraw
				System.out.println("What is your account number?");
				int numberW = bankInfo.nextInt();
				
				System.out.println("How much would you like to withdraw?");
				int amountWith = bankInfo.nextInt();
				
				newBank.withdraw(numberW, amountWith);
				
				System.out.println("Your balance is " + newBank.checkBalance(numberW));
				break;
				
			case 3://Check Balance
				System.out.println("What is your account number");
				int accountCheck = bankInfo.nextInt();
				newBank.checkBalance(accountCheck);
				
				System.out.println("Your balance is " + accountCheck);
				break;
				
			case 4://Create Account
				System.out.println("What is your name?");
				String name = bankInfo.nextLine();
				int accountNo = newBank.createAccount(name);
				
				System.out.println("Your account number is " + accountNo);
				break;
				
			case 5:// Close Account
				System.out.println("What is the account numebr?");
				int accountClose = bankInfo.nextInt();
				newBank.closeAccount(accountClose);
				
				break;
				
			case 6:
				
				break;
			
		}
		
		
		} while(choice >= 1 && choice <= 6);
		
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
