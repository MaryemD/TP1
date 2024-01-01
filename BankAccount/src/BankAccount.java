public class BankAccount {
	
	private int accountNumber;
	private String accountHolder;
	private int balance;
	
	public BankAccount(int accNum, String accHol, int b) {
		this.accountNumber = accNum;
		this.accountHolder = accHol;
		this.balance = b;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getAccountHolderName() {
		return this.accountHolder;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit (int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) throws WithdrawException {
		if (this.balance < amount)
			throw new WithdrawException();
		else {
			this.balance -= amount;
			System.out.println("Success!");
		}
		
	}
	
	public void afficher() {
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Holder Name: " + this.accountHolder);
		System.out.println("Account Balance: " + this.balance);
	}

}
