import java.time.LocalDate;

public class FixedDepositTransactor implements Transactor {
	public double recordIncome(Account account, LocalDate date, double amount, String description) {
		Transaction depositTransaction = new Transaction(account.getAccountName(), date, amount, "Deposit", description );
		account.getTransactions().add(depositTransaction);
		depositTransaction.setIndex(account.getTransactions().indexOf(depositTransaction));
		
		return account.getBalance();
	}

	public double recordExpense(Account account, LocalDate date, double amount, String description) {
		return 0.0;
	}

	public double recordExpense(FixedDepositAccount account, LocalDate date, double amount, String description) {
		if (account.calculateIfLockInPeriodOver(date)) {
			Transaction withdrawTransaction = new Transaction(account.getAccountName(), date, Math.abs(amount) * -1, "Withdraw");
			account.getTransactions().add(withdrawTransaction);
			withdrawTransaction.setIndex(account.getTransactions().indexOf(withdrawTransaction));		} else {
			System.out.println("Withdrawal cannot be processed. The account is still within the lock-in period.");
		}
		return account.getBalance();
	}

}
