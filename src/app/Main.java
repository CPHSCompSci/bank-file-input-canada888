package app;

public class Main {

	public static void main(String[] args) 
	{
		example1();
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
