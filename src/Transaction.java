import java.time.LocalDate;

public class Transaction {
	private LocalDate date;
	private double amount;
	private String type;
	private String description;
	private String accountName;

	public Transaction(String accountName, LocalDate date, double amount, String type) {
		this.accountName = accountName;
		this.date = date;
		this.amount = amount;
		this.type = type;
		this.description = "";
	}

	public Transaction(String accountName, LocalDate date, double amount, String type, String description) {
		this.accountName = accountName;
		this.date = date;
		this.amount = amount;
		this.type = type;
		this.description = description;
	}

	// Getters 
	public String getAccountName() {
		return accountName;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	// Setters
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}