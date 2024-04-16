import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MoneyTracker {
	private LogInUI login = new LogInUI();
	private SignUpUI signup;
	private MainUI ui;
	private DefaultTableModel tableModel;
	private ArrayList<User> usersList = new ArrayList<>();

	public void init() {
		usersList.add(new TestUser());
		setupLoginUI();
	}

	private void setupMainUI(User user) {
		String balance = new DecimalFormat("0.00").format(user.getTotalBalance());
		String income = new DecimalFormat("0.00").format(user.getIncome());
		String expense = new DecimalFormat("0.00").format(user.getExpenses());

		ui.setAccountName(user.getName());
		ui.setTotalAccBalance(balance, income, expense); //Convert totalBalance to String

		//display info on tables
		displayLatestTransactions(user);
		displayTransactions(user);
		displayAccounts(user);

		//actionListenerSSSS
		addActionListeners(user);

		addAccountsToComboBox(user);
	}

	private void addActionListeners(User user) {
		addTransaction(user);
		addAccount(user);

		// deleting a transaction by pressing delete btn
		ui.getTblTransactions().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DELETE) {
					int row = ui.getTblTransactions().getSelectedRow();
					handleDeleteTransaction(user, row);
				}
			}
		});

		// deleting a account by pressing delete btn
		ui.getTblAccList().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DELETE) {
					int row = ui.getTblAccList().getSelectedRow();
					handleDeleteAccount(user, row);
				}
			}
		});

		// log out
		ui.getLogOutBtn().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ui.dispose();
				ui.setVisible(false);
				login = new LogInUI();
				setupLoginUI();
			}
		});

		// double click event --- NOT IMPLEMENTED
		ui.getTblTransactions().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					// show accounts transactions individually MAYBE, NEED TO MAKE NEW CARD T-T
				}
			}});
	}

	private void handleDeleteTransaction(User user, int row) {
		Transaction transaction = user.getTransactionsList().get(row);
		int index = transaction.getIndex();
		
		for (Account acc : user.getAccounts()) {
			if (transaction.getAccountName().equalsIgnoreCase(acc.getAccountName()) && transaction.getIndex() == index) {
				acc.getTransactions().remove(transaction);
			}
		}

		reload(user);
	}

	private void handleDeleteAccount(User user, int row) {
		user.getAccounts().remove(row);
		reload(user);
	}

	// UHH RELOAD DONT NEED TO EXPLAIN
	private void reload(User user) {
		String balance = new DecimalFormat("0.00").format(user.getTotalBalance());
		String income = new DecimalFormat("0.00").format(user.getIncome());
		String expense = new DecimalFormat("0.00").format(user.getExpenses());
		
		ui.setTotalAccBalance(balance, income, expense);

		//display info on tables
		displayLatestTransactions(user);
		displayTransactions(user);
		displayAccounts(user);

		addAccountsToComboBox(user);
	}

	private void displayLatestTransactions(User user) {
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

	private void displayTransactions(User user) {
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

	private void displayAccounts(User user) {
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

	private void addAccountsToComboBox(User user) {
    javax.swing.DefaultComboBoxModel<String> comboModel = new javax.swing.DefaultComboBoxModel<>();
    for (Account account : user.getAccounts()) {
			comboModel.addElement(account.getAccountName());
    }
    ui.getcomboAccountList().setModel(comboModel);
	}

	private void addTransaction(User user) {
		ui.getBtnSaveTransaction().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ui.btnSaveTransactionActionPerformed(evt);
				Transaction newTransaction = ui.getNewTransaction();

				for (Account account : user.getAccounts()) {
					if (newTransaction.getAccountName().equals(account.getAccountName())) {
						if (newTransaction.getType().equalsIgnoreCase("income")) {
							account.addIncome(newTransaction.getDate(), newTransaction.getAmount(), newTransaction.getDescription());
						} else {
							boolean transactionSuccessful = account.addExpense(newTransaction.getDate(), newTransaction.getAmount(), newTransaction.getDescription());
							if (transactionSuccessful) {
								// do nothing
							} else {
								JOptionPane.showMessageDialog(null, "Withdrawal cannot be processed. The account is still within the lock-in period. ", "Operation Failed", JOptionPane.WARNING_MESSAGE);
							}
						}
					}
				}

				reload(user);
			}
		});
	}

	private void addAccount(User user) {
		ui.getBtnSaveAccount().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ui.btnSaveAccountActionPerformed(evt);
				Account newAccount = ui.getNewAccount();
            
				// Check if the account name already exists
				boolean accountExists = user.getAccounts().stream()
					.anyMatch(account -> account.getAccountName().equalsIgnoreCase(newAccount.getAccountName()));

				if (!accountExists) {
					user.getAccounts().add(newAccount);
					reload(user);
				} else {
					// Display a warning message that the account name already exists
					JOptionPane.showMessageDialog(null, "New account not added. \nAccount with the same name already exists!", "Operation Failed", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
	}

	private void setupLoginUI() {
		// open main ui as komani
		login.getBtnTestAccount().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				login.dispose();
				TestUser user = new TestUser();
				ui = new MainUI();
				setupMainUI(user);
			}
		});

		//sign up window appears
		login.getBtnSignup().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				login.dispose();
				signup = new SignUpUI();
				setupSignupUI();
			}
		});

		login.getBtnLogin().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				User user = logInSuccessful(login.getUsername(), login.getPassword());
				if (user != null) {
					login.dispose();
					ui = new MainUI();
					setupMainUI(user);
				}
		}});
	}

	private void setupSignupUI() {
		signup.getBtnTestAccount().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				signup.dispose();
				TestUser user = new TestUser();
				ui = new MainUI();
				setupMainUI(user);
			}
		});

		signup.getBtnSignup().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String username = signup.getUsername();
        String password = signup.getPassword();

				if (!username.equals("") && !password.equals("")) {
					// Check if username already exists in the list
					boolean usernameExists = usersList.stream()
						.anyMatch(user -> user.getName().equalsIgnoreCase(username));

					if (!usernameExists) {
						usersList.add(new User(username, password));
						JOptionPane.showMessageDialog(null, "Signup successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
						showLoginWindow();
					} else {
						// Username already exists, show error message
						JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.", "Signup Failed", JOptionPane.WARNING_MESSAGE);
					}
        } else {
					// Either username or password is empty
					JOptionPane.showMessageDialog(null, "Username and password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }
			}
		});

		signup.getBtnLogin().addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				showLoginWindow();
			}
		});
	}

	private void  showLoginWindow() {
		signup.dispose();
		login = new LogInUI();
		setupLoginUI();
	}

	private User logInSuccessful(String name, String pw) {
		for (User user : usersList) {
			System.out.println(user.getName() + " " + user.getPassword());
			if (user.getName().equals(name) && user.getPassword().equals(pw)) {
				return user;
			}
		}

		login.getTxtFieldUsername().setText("");
		login.getTxtFldPassword().setText("");
		JOptionPane.showMessageDialog(null, "Invalid username or password.", "Operation Failed", JOptionPane.WARNING_MESSAGE);

		return null;
	}

}
