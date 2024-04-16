import java.time.LocalDate;

public class FixedDepositTransactor implements Transactor {
	public double recordIncome(Account account, LocalDate date, double amount, String description) {
		Transaction depositTransaction = new Transaction(account.getAccountName(), date, amount, "Deposit", description );
		account.getTransactions().add(depositTransaction);
		depositTransaction.setIndex(account.getTransactions().indexOf(depositTransaction));
		
		return account.getBalance();
	}

	public boolean recordExpense(Account account, LocalDate date, double amount, String description) {
		return true;
	}

	public boolean recordExpense(FixedDepositAccount account, LocalDate date, double amount, String description) {
		if (account.calculateIfLockInPeriodOver(date)) {
			Transaction withdrawTransaction = new Transaction(account.getAccountName(), date, Math.abs(amount) * -1, "Withdraw");
			account.getTransactions().add(withdrawTransaction);
			withdrawTransaction.setIndex(account.getTransactions().indexOf(withdrawTransaction));
			return true;
		} 
		return false;
	}

}
