import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class User {
	private ArrayList<Account> allAccounts;
	private ArrayList<Transaction> allTransactionsList;
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

	private void printUserData() {
    System.out.println("User Name: " + name);
    System.out.println("Password: " + password);
    System.out.println("Accounts and Transactions:");

    for (Account account : allAccounts) {
			System.out.println("  Account Name: " + account.getAccountName());
			System.out.println("  Transactions:");
			ArrayList<Transaction> accountTransactions = account.getTransactions(); // Get account transactions

			for (Transaction transaction : accountTransactions) {
				System.out.printf("    Date: %s, Amount: %.2f, Type: %s, Description: %s\n",
				transaction.getDate(), transaction.getAmount(), transaction.getType(), transaction.getDescription());
			}
    }

    System.out.println("\nAll Transactions:");
    for (Transaction transaction : getTransactionsList()) {
			System.out.printf("    Date: %s, Amount: %.2f, Type: %s, Description: %s\n",
			transaction.getDate(), transaction.getAmount(), transaction.getType(), transaction.getDescription());
    }

		System.out.println("Balance: " + getTotalBalance());
		System.out.println("Income: " + getIncome());
		System.out.println("Expenses: " + getExpenses());
	}

	private void initializeDummyData() {
		// Create some accounts
		Account savings = new Account("Savings Account");
		Account checking = new Account("Checking Account");
		Account emergency = new Account("Emergency Fund");
		Account vacation = new Account("Vacation Fund");
		FixedDepositAccount fixedDeposit = new FixedDepositAccount("Fixed Deposit", 12); // 12 months lock-in

		// Add accounts to allAccounts list
		allAccounts.add(savings);
		allAccounts.add(checking);
		allAccounts.add(emergency);
		allAccounts.add(vacation);
		allAccounts.add(fixedDeposit);

		// Create transactions for each account
		addTransactions(savings, 5);
		addTransactions(checking, 3);
		addTransactions(emergency, 8);
		addTransactions(vacation, 4);
		addTransactions(fixedDeposit, 4);

		// Compute total account balance from accounts and transactions (Not implemented here, assuming it is handled elsewhere)
	}

	private void addTransactions(Account account, int count) {
		for (int i = 0; i < count; i++) {
			Transaction transaction = new Transaction(account.getCurrentDate().minusDays(count - i), 303.26 * (i + 1), "Deposit", "Deposit #" + (i + 1));
			account.transactions.add(transaction);
		}
	}

	public User(String name, String password) {
		this.allAccounts = new ArrayList<>();
		this.allTransactionsList = new ArrayList<>();
		this.name = name;
		this.password = password;  // Updated for realistic testing
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

	public ArrayList<Account> getAccounts() {
		return allAccounts;
	}

	private void updateAllTransactionsList() {
    allTransactionsList.clear();

		ArrayList<Transaction> tempList = new ArrayList<>();
    for (Account account : allAccounts) {
			tempList.addAll(account.getTransactions());
		}
		Collections.sort(tempList, Comparator.comparing(Transaction::getDate).reversed());
		allTransactionsList.addAll(tempList);
	}

	public ArrayList<Transaction> getTransactionsList() {
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
