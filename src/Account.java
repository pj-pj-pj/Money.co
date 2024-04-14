import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Account {
	private LocalDate currentDate = LocalDate.now();
	private String accountName = "Account";
	private double balance;
	private Transactor transactor;
	protected ArrayList<Transaction> transactions = new ArrayList<>();

	public Account(String accountName, double balance) {
		this.accountName = accountName;
		this.balance = balance;
		this.transactor = new DefaultTransactor();
	}

    // Getters
	public double getBalance() {
		double totalBalance = balance; // Start with the initial balance

		for (Transaction transaction : getTransactions()) {
				totalBalance += transaction.getAmount();
		}

		return totalBalance;
	}

	public LocalDate getCurrentDate() {
		return currentDate;
	}

	public ArrayList<Transaction> getTransactions() {
    ArrayList<Transaction> tempList = new ArrayList<>();
    tempList.addAll(transactions);

    Collections.sort(tempList, Comparator.comparing(Transaction::getDate).reversed());
		transactions = tempList;
    return transactions;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setaccountName(String accountName) {
		this.accountName = accountName;
	}

	// Use Transactor for deposit and withdraw methods
	public void deposit(LocalDate date, double amount) {
		transactor.increment(this, amount);

		Transaction depositTransaction = new Transaction(this.getAccountName(), date, amount, "Deposit");
		transactions.add(depositTransaction);
		depositTransaction.setIndex(transactions.indexOf(depositTransaction));
	}

	public void deposit(LocalDate date, double amount, String description) {
		transactor.increment(this, amount);

		Transaction depositTransaction = new Transaction(this.getAccountName(), date, amount, "Deposit", description );
		transactions.add(depositTransaction);
		depositTransaction.setIndex(transactions.indexOf(depositTransaction));
	}

	public void withdraw(LocalDate date, double amount) {
		transactor.decrement(this, amount);

		Transaction withdrawTransaction = new Transaction(this.getAccountName(), date, Math.abs(amount) * -1, "Withdraw");
		transactions.add(withdrawTransaction);
		withdrawTransaction.setIndex(transactions.indexOf(withdrawTransaction));
	}

	public void withdraw(LocalDate date, double amount, String description) {
		transactor.decrement(this, amount);

    Transaction withdrawTransaction = new Transaction(this.getAccountName(), date, Math.abs(amount) * -1, "Withdraw", description);
		transactions.add(withdrawTransaction);
		withdrawTransaction.setIndex(transactions.indexOf(withdrawTransaction));
	}

	public void setBalance(double d) {
		this.balance = d;
	}
}