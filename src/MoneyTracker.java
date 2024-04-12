import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class MoneyTracker {
	UI ui = new UI();
	User user = new User();
	private DefaultTableModel tableModel;

	public void init() {
		setup();
	}

	private void initializeTableModel() {
		String[] columnNames = {"Transactions", "Amount"};
		tableModel = new DefaultTableModel(columnNames, 0);
		ui.getTblTransPreview().setModel(tableModel);
	}

	private void setup() {
		ui.setAccountName(user.getName());
		ui.setTotalAccBalance(new DecimalFormat("0.00").format(user.getTotalBalance())); //Convert totalBalance to String
		initializeTableModel();
		displayLatestTransactions();
	}

	private void displayLatestTransactions() {
	// Get the latest 3 transactions from the sorted list
	ArrayList<Transaction> latestTransactions = new ArrayList<>(user.getTransactionsList().subList(0, Math.min(3, user.getTransactionsList().size())));

	// Add the latest transactions to the table model
	for (Transaction transaction : latestTransactions) {
		Object[] rowData = {transaction.getDescription(), transaction.getAmount()};
		tableModel.addRow(rowData);
	}
	}

	public boolean logInSuccessful() {
		return true;
	}
}
