import java.util.ArrayList;

public class User {
	private ArrayList<Account> allAccounts;
	private ArrayList<Transaction> allTransactionsList;
	private String name;
	private String password;

	public User() {
		this.allAccounts = new ArrayList<>();
		this.allTransactionsList = new ArrayList<>();
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

	public ArrayList<Account> getAccounts() {
		return allAccounts;
	}

	public ArrayList<Transaction> getTransactionsList() {
		// Update the allTransactionsList before returning
		updateAllTransactionsList();
		return allTransactionsList;
	}

	// method collects transactions from all accounts
	private void updateAllTransactionsList() {
		// Clear the existing transactions list to avoid duplication
		allTransactionsList.clear();
	
		// Iterate through each account and add their transactions to the list
		for (Account account : allAccounts) {
			allTransactionsList.addAll(account.getTransactions());
		}
	}
}
