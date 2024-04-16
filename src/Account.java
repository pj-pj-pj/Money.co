import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Account {
	private LocalDate currentDate = LocalDate.now();
	private String accountName = "Account";
	private double recordedBalance;
	private Transactor transactor;
	private ArrayList<Transaction> transactions = new ArrayList<>();

	public Account(String accountName, double recordedBalance) {
		this.accountName = accountName;
		this.recordedBalance = recordedBalance;
		this.transactor = new DefaultTransactor();
	}

  // Getters
	public double getBalance() {
		double income = 0;
		double expenses = 0;

		for (Transaction transaction : getTransactions()) {
			if (transaction.getType().equalsIgnoreCase("Deposit")) {
				income += transaction.getAmount();
			} else if (transaction.getType().equalsIgnoreCase("Withdraw")) {
				expenses += transaction.getAmount();
			}
		}

		return recordedBalance + (income + expenses);
	}

	public LocalDate getCurrentDate() {
		return currentDate;
	}

	public ArrayList<Transaction> getTransactions() {
    Collections.sort(transactions, Comparator.comparing(Transaction::getDate).reversed());
    return transactions;
	}

	public String getAccountName() {
		return accountName;
	}

	public void addIncome(LocalDate date, double amount, String description) {
		transactor.recordIncome(this, date, amount, description);
	}

	public boolean addExpense(LocalDate date, double amount, String description) {
		return transactor.recordExpense(this, date, amount, description);
	}
}