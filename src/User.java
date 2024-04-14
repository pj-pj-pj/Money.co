import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class User {
	private List<Account> allAccounts;
	private List<Transaction> allTransactionsList;
	private String name;
	private String password;
	private double income;
	private double expenses;
	private double totalBalance;

	//default user for testing AaaaaAAAAaaAAAaaAAaAaAaAaaAaA
	public User() {
		this.allAccounts = new ArrayList<>();
		this.allTransactionsList = new ArrayList<>();
		this.name = "Komani";
		this.password = "verysecret";
		initializeDummyData();  // Initialize with dummy data
		printUserData();
	}

	public void printUserData() {
    System.out.println("User Name: " + name);
    System.out.println("Password: " + password);
    System.out.println("Accounts and Transactions:");

		System.out.println();
    for (Account account : allAccounts) {
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
		allAccounts.add(savings);
		allAccounts.add(checking);
		allAccounts.add(emergency);
		allAccounts.add(vacation);
		allAccounts.add(fixedDeposit);

		// Create transactions for each account
		addDeposit(savings, 2);
		addDeposit(checking, 2);
		addDeposit(emergency, 2);
		addDeposit(vacation, 2);
		addDeposit(fixedDeposit, 2); // 100

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

	public User(String name, String password) {
		this.allAccounts = new ArrayList<>();
		this.allTransactionsList = new ArrayList<>();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void addAccount(Account account) {
		allAccounts.add(account);
	}

	public List<Account> getAccounts() {
		return allAccounts;
	}

	private void updateAllTransactionsList() {
    allTransactionsList.clear();

		List<Transaction> tempList = new ArrayList<>();
    for (Account account : allAccounts) {
			tempList.addAll(account.getTransactions());
		}
		Collections.sort(tempList, Comparator.comparing(Transaction::getDate).reversed());
		allTransactionsList.addAll(tempList);
	}

	public List<Transaction> getTransactionsList() {
		// Update the allTransactionsList before returning
		updateAllTransactionsList();
		return allTransactionsList;
	}

	public double getTotalBalance() {
    this.totalBalance = 0;

    for (Account account : allAccounts) {
      totalBalance += account.getBalance();
    }
    
    return totalBalance;
	}

	public double getIncome() {
		// Calculate total income from all accounts
		income = 0;
		for (Account account : allAccounts) {
			for (Transaction transaction : account.getTransactions()) {
				if (transaction.getType().equalsIgnoreCase("Deposit")) {
					income += transaction.getAmount();
				}
			}
		}
		return income;
	}

	public double getExpenses() {
		// Calculate total expenses from all accounts
		expenses = 0;
		for (Account account : allAccounts) {
			for (Transaction transaction : account.getTransactions()) {
				if (transaction.getType().equalsIgnoreCase("Withdraw")) {
					expenses += transaction.getAmount();
				}
			}
		}
		return expenses;
	}

}
