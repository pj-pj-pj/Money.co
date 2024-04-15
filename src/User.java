import java.util.List;
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
