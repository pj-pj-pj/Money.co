import java.util.ArrayList;
import java.time.LocalDate;

public class Account {
	private String accountNumber;
	private String accountHolderName;
	private LocalDate currentDate = LocalDate.now();
	private String accountDescription = "Account";
	protected double balance = 0;
	protected ArrayList<Transaction> transactions =new ArrayList<>();
	protected Transactor transactor;

  	public Account(String accountNumber, String accountHolderName, String accountDescription) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountDescription = accountDescription;
		this.transactor = new DefaultTransactor();
	}

    // Getters
	public String getAccountNumber() {
		return accountNumber;
	}

  	public String getAccountHolderName() {
    	return accountHolderName;
	}

	public double getBalance() {
    	return balance;
	}

	public LocalDate getCurrentDate() {
    	return currentDate;
  	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public String getAccountDescription() {
		return accountDescription;
	}

	// Setters
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	// Use Transactor for deposit and withdraw methods
	public void deposit(LocalDate date, double amount) {
		transactor.increment(this, amount);
		Transaction depositTransaction = new Transaction(date, amount, "Deposit");
		transactions.add(depositTransaction);
	}

	public void deposit(LocalDate date, double amount, String description) {
		transactor.increment(this, amount);
		Transaction depositTransaction = new Transaction(date, amount, "Deposit", description);
		transactions.add(depositTransaction);
	}

	public void withdraw(LocalDate date, double amount) {
		transactor.decrement(this, amount);
		Transaction depositTransaction = new Transaction(date, amount, "Withdraw");
		transactions.add(depositTransaction);
	}

	public void withdraw(LocalDate date, double amount, String description) {
		transactor.decrement(this, amount);
		Transaction withdrawTransaction = new Transaction(date, amount, "Withdraw", description);
		transactions.add(withdrawTransaction);
	}
}