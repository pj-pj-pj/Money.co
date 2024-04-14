import java.time.LocalDate;

public class FixedDepositAccount extends Account {
	private LocalDate lockInPeriod;
	private boolean isLockInPeriodOver;
	private FixedDepositTransactor transactor;

	public FixedDepositAccount(String accountName, double balance, LocalDate lockInPeriod) {
		super(accountName, balance);
		this.lockInPeriod = lockInPeriod;
		this.transactor = new FixedDepositTransactor();
		this.isLockInPeriodOver = calculateIfLockInPeriodOver();
	}

	@Override
	public void withdraw(LocalDate date, double amount, String description) {
		transactor.decrement(this, amount, isLockInPeriodOver);
		if (isLockInPeriodOver) {
			Transaction withdrawTransaction = new Transaction(this.getAccountName(), date, Math.abs(amount) * -1, "Withdraw", description);
			transactions.add(withdrawTransaction);
			withdrawTransaction.setIndex(transactions.indexOf(withdrawTransaction));
		}
	}

	public void withdraw(LocalDate date, double amount) {
		transactor.decrement(this, amount, isLockInPeriodOver);
		if (isLockInPeriodOver) {
			Transaction withdrawTransaction = new Transaction(this.getAccountName(), date, Math.abs(amount) * -1, "Withdraw");
			transactions.add(withdrawTransaction);
			withdrawTransaction.setIndex(transactions.indexOf(withdrawTransaction));
		}
	}
	
	private boolean calculateIfLockInPeriodOver() {
		return getCurrentDate().isAfter(lockInPeriod);
}
}
