import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MoneyTracker {
	private UI ui = new UI();
	private User user = new User();
	private DefaultTableModel tableModel;

	public void init() {
		setup();
	}

	private void setup() {
		ui.setAccountName(user.getName());
		ui.setTotalAccBalance(new DecimalFormat("0.00").format(user.getTotalBalance())); //Convert totalBalance to String

		//display info on tables
		displayLatestTransactions();
		displayTransactions();
		displayAccounts();

		//actionListenerSSSS
		addActionListeners();

		addAccountsToComboBox();
	}

	private void addActionListeners() {
		addTransaction();
		addAccount();

		// deleting a transaction by pressing delete btn
		ui.getTblTransactions().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DELETE) {
					int row = ui.getTblTransactions().getSelectedRow();
					handleDeleteTransaction(row);
				}
			}
		});

		// deleting a account by pressing delete btn
		ui.getTblAccList().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DELETE) {
					int row = ui.getTblAccList().getSelectedRow();
					handleDeleteAccount(row);
				}
			}
		});

		// double click event
		ui.getTblTransactions().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					// show accounts transactions individually MAYBE, NEED TO MAKE NEW CARD T-T
				}
			}});
	}

	private void reload() {
		ui.setTotalAccBalance(new DecimalFormat("0.00").format(user.getTotalBalance())); //Convert totalBalance to String with format 0.00

		//display info on tables
		displayLatestTransactions();
		displayTransactions();
		displayAccounts();

		addAccountsToComboBox();
	}

	private void displayLatestTransactions() {
		String[] columnNames = {"Transactions", "Amount"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
		};
		ui.getTblTransPreview().setModel(tableModel);

		// Get the latest 3 transactions from the sorted list
		ArrayList<Transaction> latestTransactions = new ArrayList<>(user.getTransactionsList().subList(0, Math.min(3, user.getTransactionsList().size())));

		// Add the latest transactions to the table model
		for (Transaction transaction : latestTransactions) {
			Object[] rowData = {transaction.getType(), new DecimalFormat("0.00").format(transaction.getAmount())};
			tableModel.addRow(rowData);
		}
	}

	private void displayTransactions() {
		String type = "<html><div style='text-align: center;'>Type of<br>Transaction</div></html>";
		String[] columnNames = {"Date", "Account","Description", type, "Amount"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
		};

		ui.getTblTransactions().setModel(tableModel);
    tableModel.setRowCount(0);

		for (Transaction transaction : user.getTransactionsList()) {
			Object[] rowData = {transaction.getDate(), transaction.getAccountName(), transaction.getDescription(), transaction.getType(), new DecimalFormat("0.00").format(transaction.getAmount())};
			tableModel.addRow(rowData);
    }
	}

	private void handleDeleteTransaction(int row) {
		Transaction transaction = user.getTransactionsList().get(row);
		int index = transaction.getIndex();
		
		for (Account acc : user.getAccounts()) {
			if (transaction.getAccountName().equalsIgnoreCase(acc.getAccountName()) && transaction.getIndex() == index) {
				acc.getTransactions().remove(transaction);
			}
		}

		reload();
	}

	private void handleDeleteAccount(int row) {
		user.getAccounts().remove(row);
		reload();
	}

	private void displayAccounts() {
		String[] columnNames = {"Account", "Balance"};
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
		};
		ui.getTblAccList().setModel(tableModel);
    tableModel.setRowCount(0); // Clear existing rows

    for (Account account : user.getAccounts()) {
			Object[] rowData = {account.getAccountName(), new DecimalFormat("0.00").format(account.getBalance())};
			tableModel.addRow(rowData);
    }
	}

	private void addAccountsToComboBox() {
    javax.swing.DefaultComboBoxModel<String> comboModel = new javax.swing.DefaultComboBoxModel<>();
    for (Account account : user.getAccounts()) {
			comboModel.addElement(account.getAccountName());
    }
    ui.getcomboAccountList().setModel(comboModel);
	}

	private void addTransaction() {
		ui.getBtnSaveTransaction().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ui.btnSaveTransactionActionPerformed(evt);
				Transaction newTransaction = ui.getNewTransaction();

				for (Account account : user.getAccounts()) {
					if (newTransaction.getAccountName().equals(account.getAccountName())) {
						if (newTransaction.getType().equalsIgnoreCase("income")) {
							account.deposit(newTransaction.getDate(), newTransaction.getAmount(), newTransaction.getDescription());
						} else {
							account.withdraw(newTransaction.getDate(), newTransaction.getAmount(), newTransaction.getDescription());
						}
					}
				}

				reload();
			}
		});
	}

	private void addAccount() {
		ui.getBtnSaveAccount().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ui.btnSaveAccountActionPerformed(evt);
				Account newAccount = ui.getNewAccount();
				user.getAccounts().add(newAccount);
				user.printUserData();
				reload();
			}
		});
	}

	public boolean logInSuccessful() {
		return true;
	}
}
