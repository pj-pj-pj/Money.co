import java.time.LocalDate;

public class FixedDepositAccount extends Account {
	private LocalDate lockInPeriod;
	private FixedDepositTransactor transactor;

	public FixedDepositAccount(String accountName, double balance, LocalDate lockInPeriod) {
		super(accountName, balance);
		this.lockInPeriod = lockInPeriod;
		this.transactor = new FixedDepositTransactor();
	}

	@Override
	public boolean addExpense(LocalDate date, double amount, String description) {
		return transactor.recordExpense(this, date, amount, description);
	}

	@Override
	public String getAccountName() {
		if (calculateIfLockInPeriodOver(getCurrentDate())) {
			return super.getAccountName();
		}

		return super.getAccountName() + " (locked)";
	}
	
	public boolean calculateIfLockInPeriodOver(LocalDate date) {
		return date.isAfter(lockInPeriod);
	}
}
