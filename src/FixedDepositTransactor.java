public class FixedDepositTransactor implements Transactor {
	public double increment(Account account, double amount) {
		if (amount > 0) {
			account.setBalance(account.getBalance() + amount);
		}
		return account.getBalance();
	}

	public double decrement(Account account, double amount) {
		account.setBalance(account.getBalance() - amount);
		return account.getBalance();
	}

	public double decrement(Account account, double amount, boolean isLockInPeriodOver) {
		if (isLockInPeriodOver) {
            account.setBalance(account.getBalance() - amount);
			return account.getBalance();
        } else {
            System.out.println("Withdrawal cannot be processed. The account is still within the lock-in period.");
			return account.getBalance();
		}
	}
}
