import java.time.LocalDate;

public class DefaultTransactor implements Transactor {
	@Override
	public double recordIncome(Account account, LocalDate date, double amount, String description) {
		Transaction depositTransaction = new Transaction(account.getAccountName(), date, amount, "Deposit", description );
		account.getTransactions().add(depositTransaction);
		depositTransaction.setIndex(account.getTransactions().indexOf(depositTransaction));
		
		return account.getBalance();
	}

	@Override
	public double recordExpense(Account account, LocalDate date, double amount, String description) {
		Transaction withdrawTransaction = new Transaction(account.getAccountName(), date, Math.abs(amount) * -1, "Withdraw", description);
		account.getTransactions().add(withdrawTransaction);
		withdrawTransaction.setIndex(account.getTransactions().indexOf(withdrawTransaction));
		
		return account.getBalance();
	}
}