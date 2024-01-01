
public class Main {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(1, "Mehdi Moalla", 150);
		b.afficher();
		b.deposit(200);
		try {
			b.withdraw(300);
		} catch (WithdrawException e) {}
		b.afficher();
		
		try {
			b.withdraw(300);
		} catch (WithdrawException e) {}
		b.afficher();

	}

}
