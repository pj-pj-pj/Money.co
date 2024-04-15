import java.time.LocalDate;

public class TestUser extends User {
  	//default user for testing AaaaaAAAAaaAAAaaAAaAaAaAaaAaA
	public TestUser() {
    super("Komani", "verysecret");
		initializeDummyData();  // Initialize with dummy data
		printUserData();
	}

  public void printUserData() {
    System.out.println("User Name: " + getName());
    System.out.println("Password: " + getPassword());
    System.out.println("Accounts and Transactions:");

		System.out.println();
    for (Account account : getAccounts()) {
			System.out.println("  Account Name: " + account.getAccountName());
			System.out.println("  Account Balance: " + account.getBalance());
			System.out.println();
    }

		System.out.println("Balance: " + getTotalBalance());
		System.out.println("Income: " + getIncome());
		System.out.println("Expenses: " + getExpenses());
	}

	private void initializeDummyData() {
		// Create some accounts
		Account savings = new Account("Savings Account", 0);
		Account checking = new Account("Checking Account", 0);
		Account emergency = new Account("Emergency Fund", 0);
		Account vacation = new Account("Vacation Fund", 0);
		FixedDepositAccount fixedDeposit = new FixedDepositAccount("Fixed Deposit",0, LocalDate.of(2024, 4, 16)); // 12 months lock-in

		// Add accounts to allAccounts list
		getAccounts().add(savings);
		getAccounts().add(checking);
		getAccounts().add(emergency);
		getAccounts().add(vacation);
		getAccounts().add(fixedDeposit);

		// Create transactions for each account
		addDeposit(savings, 2);
		addDeposit(checking, 2);
		addDeposit(emergency, 2);
		addDeposit(vacation, 2);
		addDeposit(fixedDeposit, 2); // 1000

		addWithdraw(savings, 1);
		addWithdraw(checking, 1);
		addWithdraw(emergency, 1);
		addWithdraw(vacation, 1);
		addWithdraw(fixedDeposit, 1); //40

		// Compute total account balance from accounts and transactions (Not implemented here, assuming it is handled elsewhere)
	}

  private void addDeposit(Account account, int count) {
		for (int i = 0; i < count; i++) {
			account.addIncome(account.getCurrentDate().minusDays(count - i), 100, "Deposit #" + (i + 1));
		}
	}

	private void addWithdraw(Account account, int count) {
		for (int i = 0; i < count; i++) {
			account.addExpense(account.getCurrentDate().minusDays(count - i), 10, "Withdraw #" + (i + 1));
    }
	}

}
