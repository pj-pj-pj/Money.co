import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JComboBox;
import javax.swing.JTable;

import org.jdatepicker.impl.*; 
import java.awt.*;  

public class MainUI extends javax.swing.JFrame {

	public MainUI() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(102, 102, 102));
		setFont(new java.awt.Font("Raleway", 0, 10)); // NOI18N
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src/assets/Icon.png");    
		setIconImage(icon);    
		setLayout(null);

		headerInit();
		sidebarInit();
		contentPanelInit();

		pack();
		setSize(1300, 850);
		setLocationRelativeTo(null);
		setVisible(true);	
	}            

	private void headerInit() {
		header = new javax.swing.JPanel();
		lblTitleHeader = new javax.swing.JLabel();
		btnAddTransaction = new java.awt.Button();

		header.setBackground(new java.awt.Color(102, 102, 102));

		lblTitleHeader.setFont(new java.awt.Font("IM FELL DW Pica", 0, 24)); // NOI18N
		lblTitleHeader.setForeground(new java.awt.Color(255, 255, 255));
		lblTitleHeader.setText("Money.co");

		btnAddTransaction.setBackground(new java.awt.Color(0, 0, 0));
		btnAddTransaction.setForeground(new java.awt.Color(255, 255, 255));
		btnAddTransaction.setLabel("+ ADD TRANSACTION");
		btnAddTransaction.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddTransactionActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
		header.setLayout(headerLayout);
		headerLayout.setHorizontalGroup(
			headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
				.addGap(34, 34, 34)
				.addComponent(lblTitleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 539, Short.MAX_VALUE)
				.addComponent(btnAddTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(12, 12, 12))
		);
		headerLayout.setVerticalGroup(
			headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(btnAddTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addContainerGap())
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
				.addContainerGap(17, Short.MAX_VALUE)
				.addComponent(lblTitleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18))
		);
	}

	private void sidebarInit() {
		sidebar = new javax.swing.JPanel();
		pnlAccName = new javax.swing.JPanel();
		lblAccName = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		lblTotalAccountBalance = new javax.swing.JLabel();
		btnViewAllAcc = new java.awt.Button();
		btnLogOut = new java.awt.Button();
		btnViewAllTrans = new java.awt.Button();
		lblYourTrans = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		tblTransPreview = new javax.swing.JTable();

		sidebar.setBackground(new java.awt.Color(204, 204, 204));
		lblAccName.setBackground(new java.awt.Color(255, 255, 255));
		lblAccName.setFont(new java.awt.Font("IM FELL DW Pica", 0, 18)); // NOI18N
		lblAccName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblAccName.setText("account name");

		javax.swing.GroupLayout pnlAccNameLayout = new javax.swing.GroupLayout(pnlAccName);
		pnlAccName.setLayout(pnlAccNameLayout);
		pnlAccNameLayout.setHorizontalGroup(
			pnlAccNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAccNameLayout.createSequentialGroup()
				.addGap(69, 69, 69)
				.addComponent(lblAccName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlAccNameLayout.setVerticalGroup(
			pnlAccNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAccNameLayout.createSequentialGroup()
				.addGap(14, 14, 14)
				.addComponent(lblAccName)
				.addContainerGap(15, Short.MAX_VALUE))
		);

		jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Total Account Balance:");

		lblTotalAccountBalance.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
		lblTotalAccountBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTotalAccountBalance.setText("0.00");

		btnViewAllAcc.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		btnViewAllAcc.setLabel("VIEW ALL ACCOUNTS >");
		btnViewAllAcc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnViewAllAccActionPerformed(evt);
			}
		});

		btnLogOut.setBackground(new java.awt.Color(0, 0, 0));
		btnLogOut.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
		btnLogOut.setLabel("LOG OUT");

		btnViewAllTrans.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		btnViewAllTrans.setLabel("VIEW ALL TRANSACTIONS >");
		btnViewAllTrans.setVisible(false);
		btnViewAllTrans.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnViewAllTransActionPerformed(evt);
			}
		});

		lblYourTrans.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblYourTrans.setText("Your Latest Transactions:");

		tblTransPreview.setModel(new javax.swing.table.DefaultTableModel(
			new Object [][] {
				{null, null},

			},
			new String [] {
				"Transactions", "Amount"
			}
		));
		jScrollPane3.setViewportView(tblTransPreview);

		javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
		sidebar.setLayout(sidebarLayout);
		sidebarLayout.setHorizontalGroup(
			sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(sidebarLayout.createSequentialGroup()
				.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(sidebarLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(pnlAccName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(sidebarLayout.createSequentialGroup()
						.addGap(50,50,50)
						.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
									.addComponent(btnViewAllTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(23, 23, 23))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
									.addComponent(lblYourTrans)
									.addGap(0, 0, 30))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
									.addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(23, 23, 23)))
							.addComponent(lblTotalAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(0, 32, Short.MAX_VALUE)))
				.addContainerGap())
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
						.addComponent(jLabel2)
						.addGap(0, 45, 70))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
						.addComponent(btnViewAllAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 45, 70))))
		);
		sidebarLayout.setVerticalGroup(
			sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(sidebarLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(pnlAccName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(jLabel2)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(lblTotalAccountBalance)
				.addGap(10,10,10)
				.addComponent(btnViewAllAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(20, 20, 20)
				.addComponent(lblYourTrans)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnViewAllTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(50, 50, 50))
		);
	}

	public void setAccountName(String name) {
		lblAccName.setText(name);
		lblTransactionHeaderTitle.setText(name.toUpperCase() + "'S TRANSACTIONS");
		lblViewAccHeaderTitle.setText(name.toUpperCase() + "'S ACCOUNTS");
	}

	public void setTotalAccBalance(String total, String income, String expense) {
		lblTotalAccountBalance.setText(total);

		//accounts
		lblIncome.setText(income);
		lblExpense.setText(expense);
		lblTotal.setText(total);
	}

	public JTable getTblTransPreview() {
		return tblTransPreview;
	}

	public JTable getTblAccList() {
		return tblAccList;
	}

	private void contentPanelInit() {
		contentPanel = new javax.swing.JPanel();
		cardViewAllTrans = new javax.swing.JPanel();
		cardMonth = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		tblTransactions = new javax.swing.JTable();
		pnlAllTransactionsHeader = new javax.swing.JPanel();
		lblTransactionHeaderTitle = new javax.swing.JLabel();
		cardAddTransaction = new javax.swing.JPanel();
		pnlAddTransHeader = new javax.swing.JPanel();
		lblAddTransactionTitle = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		txtFieldAmount = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		comboAccountList = new javax.swing.JComboBox<>();
		jLabel9 = new javax.swing.JLabel();
		lblTitleHeader0 = new javax.swing.JLabel();
		lblTitleHeader1 = new javax.swing.JLabel();
		comboTypeOfTransaction = new javax.swing.JComboBox<>();
		btnSaveTransaction = new java.awt.Button();
		txtFldDescription = new javax.swing.JTextField();
		cardViewAllAccounts = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblAccList = new javax.swing.JTable();
		pnlAllAccountsHeader = new javax.swing.JPanel();
		lblViewAccHeaderTitle = new javax.swing.JLabel();
		btnAddNewAcc = new java.awt.Button();
		lblTitleHeader9 = new javax.swing.JLabel();
		lblTotal = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		lblIncome = new javax.swing.JLabel();
		lblExpense = new javax.swing.JLabel();
		cardAddNewAcc = new javax.swing.JPanel();
		pnlAddNewAccountHeader = new javax.swing.JPanel();
		lbladdNewAccountTitle = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		txtFldAccName = new javax.swing.JTextField();
		jLabel27 = new javax.swing.JLabel();
		comboAccType = new javax.swing.JComboBox<>();
		lblAddAccType = new javax.swing.JLabel();
		lblForFixedInfo = new javax.swing.JLabel();
		txtFldInitBalance = new javax.swing.JTextField();
		btnSaveAccount = new java.awt.Button();
		lblLockAccUntil = new javax.swing.JLabel();

		contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		contentPanel.setLayout(new java.awt.CardLayout());
		contentPanel.setPreferredSize(getPreferredSize());
		cardViewAllTrans.setLayout(new java.awt.CardLayout());

		cardMonth.setBackground(new java.awt.Color(237, 236, 233));

		tblTransactions.setFont(new java.awt.Font("Poppins", 0, 12)); 
		tblTransactions.setRowHeight(22);
		tblTransactions.getTableHeader().setFont(new Font("Poppins", 0, 12));
		tblTransactions.getTableHeader().setPreferredSize(new Dimension(header.getWidth(), 43));
		tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
			new Object [][] {},
			new String [] {
				"Date", "Account","Description", "Type of Transaction", "Amount"
			}
		));
		jScrollPane2.setViewportView(tblTransactions);

		pnlAllTransactionsHeader.setBackground(new java.awt.Color(0, 0, 0));
		pnlAllTransactionsHeader.setPreferredSize(new java.awt.Dimension(655, 68));
		lblTransactionHeaderTitle.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblTransactionHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
		lblTransactionHeaderTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTransactionHeaderTitle.setText("{ACCOUNT NAME}'S TRANSACTIONS");

		javax.swing.GroupLayout pnlAllTransactionsHeaderLayout = new javax.swing.GroupLayout(pnlAllTransactionsHeader);
		pnlAllTransactionsHeader.setLayout(pnlAllTransactionsHeaderLayout);
		pnlAllTransactionsHeaderLayout.setHorizontalGroup(
			pnlAllTransactionsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAllTransactionsHeaderLayout.createSequentialGroup()
				.addGap(16, 16, 16)
				.addComponent(lblTransactionHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlAllTransactionsHeaderLayout.setVerticalGroup(
			pnlAllTransactionsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAllTransactionsHeaderLayout.createSequentialGroup()
				.addGap(23, 23, 23)
				.addComponent(lblTransactionHeaderTitle)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		javax.swing.GroupLayout cardMonthLayout = new javax.swing.GroupLayout(cardMonth);
		cardMonth.setLayout(cardMonthLayout);
		cardMonthLayout.setHorizontalGroup(
			cardMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(cardMonthLayout.createSequentialGroup()
				.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
			.addGroup(cardMonthLayout.createSequentialGroup()
				.addComponent(pnlAllTransactionsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);
		cardMonthLayout.setVerticalGroup(
			cardMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(cardMonthLayout.createSequentialGroup()
				.addComponent(pnlAllTransactionsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				)
		);

		cardViewAllTrans.add(cardMonth, "cardMonth");

		contentPanel.add(cardViewAllTrans, "cardViewAllTrans");

		pnlAddTransHeader.setBackground(new java.awt.Color(0, 0, 0));

		lblAddTransactionTitle.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblAddTransactionTitle.setForeground(new java.awt.Color(255, 255, 255));
		lblAddTransactionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblAddTransactionTitle.setText("ADD TRANSACTION");

		javax.swing.GroupLayout pnlAddTransHeaderLayout = new javax.swing.GroupLayout(pnlAddTransHeader);
		pnlAddTransHeader.setLayout(pnlAddTransHeaderLayout);
		pnlAddTransHeaderLayout.setHorizontalGroup(
			pnlAddTransHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAddTransHeaderLayout.createSequentialGroup()
				.addGap(16, 16, 16)
				.addComponent(lblAddTransactionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
		);
		pnlAddTransHeaderLayout.setVerticalGroup(
			pnlAddTransHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAddTransHeaderLayout.createSequentialGroup()
				.addGap(23, 23, 23)
				.addComponent(lblAddTransactionTitle)
				.addContainerGap(23, Short.MAX_VALUE))
		);

		jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel6.setText("AMOUNT:");

		txtFieldAmount.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		txtFieldAmount.setText("0");
		txtFieldAmount.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
							e.consume(); // Ignore non-numeric characters
					}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// DI KAILANGAN PERO BAWAL TANGGALIN
		}

			@Override
			public void keyReleased(KeyEvent e) {
				// DI KAILANGAN PERO BAWAL TANGGALIN
			}
	});

		jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel8.setText("ACCOUNT:");

		comboAccountList.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

		jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel9.setText("DESCRIPTION:");

		lblTitleHeader0.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblTitleHeader0.setText("DATE:");

		lblTitleHeader1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblTitleHeader1.setText("TYPE:");

		comboTypeOfTransaction.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		comboTypeOfTransaction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INCOME", "EXPENSE" }));

		btnSaveTransaction.setBackground(new java.awt.Color(0, 0, 0));
		btnSaveTransaction.setForeground(new java.awt.Color(255, 255, 255));
		btnSaveTransaction.setLabel("+ ADD");

		txtFldDescription.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		model.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));

		model.setSelected(true); 
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

		datePicker.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

		javax.swing.GroupLayout cardAddTransactionLayout = new javax.swing.GroupLayout(cardAddTransaction);
		cardAddTransaction.setLayout(cardAddTransactionLayout);
		cardAddTransactionLayout.setHorizontalGroup(
			cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(pnlAddTransHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addGroup(cardAddTransactionLayout.createSequentialGroup()
				.addGap(152, 152, 152)
				.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jLabel6)
					.addComponent(lblTitleHeader1)
					.addComponent(jLabel9)
					.addComponent(jLabel8)
					.addComponent(lblTitleHeader0))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(cardAddTransactionLayout.createSequentialGroup()
						.addGap(217, 217, 217)
						.addComponent(btnSaveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addComponent(comboAccountList, javax.swing.GroupLayout.Alignment.TRAILING, 0, 360, Short.MAX_VALUE)
					.addComponent(txtFieldAmount)
					.addComponent(comboTypeOfTransaction, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(txtFldDescription)
					.addComponent(datePicker))
				.addGap(83, 83, 83))
		);
		cardAddTransactionLayout.setVerticalGroup(
			cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(cardAddTransactionLayout.createSequentialGroup()
				.addComponent(pnlAddTransHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(60, 60, 60)
				.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(comboTypeOfTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(lblTitleHeader1))
				.addGap(18, 18, 18)
				.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(txtFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel6))
				.addGap(18, 18, 18)
				.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(comboAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel8))
				.addGap(18, 18, 18)
				.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(txtFldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel9))
				.addGap(18, 18, 18)
				.addGroup(cardAddTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(lblTitleHeader0)
					.addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
				.addComponent(btnSaveTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(65, 65, 65))
		);

		contentPanel.add(cardAddTransaction, "cardAddTransaction");

		cardAllAccountInit();

		pnlAddNewAccountHeader.setBackground(new java.awt.Color(0, 0, 0));

		lbladdNewAccountTitle.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lbladdNewAccountTitle.setForeground(new java.awt.Color(255, 255, 255));
		lbladdNewAccountTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lbladdNewAccountTitle.setText("ADD NEW ACCOUNT");

		javax.swing.GroupLayout pnlAddNewAccountHeaderLayout = new javax.swing.GroupLayout(pnlAddNewAccountHeader);
		pnlAddNewAccountHeader.setLayout(pnlAddNewAccountHeaderLayout);
		pnlAddNewAccountHeaderLayout.setHorizontalGroup(
			pnlAddNewAccountHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAddNewAccountHeaderLayout.createSequentialGroup()
				.addGap(16, 16, 16)
				.addComponent(lbladdNewAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlAddNewAccountHeaderLayout.setVerticalGroup(
			pnlAddNewAccountHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAddNewAccountHeaderLayout.createSequentialGroup()
				.addGap(23, 23, 23)
				.addComponent(lbladdNewAccountTitle)
				.addContainerGap(23, Short.MAX_VALUE))
		);

		jLabel26.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel26.setText("INITIAL BALANCE");

		txtFldAccName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		txtFldAccName.setText("Account");

		jLabel27.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel27.setText("ACCOUNT NAME:");

		comboAccType.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		comboAccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard Account", "Fixed Deposit Account" }));
		comboAccType.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedAccount = (String) comboAccType.getSelectedItem();
					if (selectedAccount.equals("Fixed Deposit Account")) {
						lockPeriodDatePicker.setVisible(true);
						lblForFixedInfo.setVisible(true);
						lblLockAccUntil.setVisible(true);
					} else {
						lockPeriodDatePicker.setVisible(false);
						lblForFixedInfo.setVisible(false);
						lblLockAccUntil.setVisible(false);
				}
			}
	});

		lblAddAccType.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblAddAccType.setText("TYPE:");

		txtFldInitBalance.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		txtFldInitBalance.setText("0");
		txtFldInitBalance.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
							e.consume(); // Ignore non-numeric characters
					}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// DI KAILANGAN PERO BAWAL TANGGALIN
		}

			@Override
			public void keyReleased(KeyEvent e) {
				// DI KAILANGAN PERO BAWAL TANGGALIN
			}
	});

		btnSaveAccount.setBackground(new java.awt.Color(0, 0, 0));
		btnSaveAccount.setForeground(new java.awt.Color(255, 255, 255));
		btnSaveAccount.setLabel("+ ADD");

		lblLockAccUntil.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblLockAccUntil.setText("LOCK ACCOUNT UNTIL:");

		model2.setDate(calendar.get(Calendar.YEAR) + 5, calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
		model2.setSelected(true); 
		JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p);
		lockPeriodDatePicker = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
		lockPeriodDatePicker.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

		lblForFixedInfo.setText("(For fixed deposit account)");

		lockPeriodDatePicker.setVisible(false);
		lblForFixedInfo.setVisible(false);
		lblLockAccUntil.setVisible(false);

		javax.swing.GroupLayout cardAddNewAccLayout = new javax.swing.GroupLayout(cardAddNewAcc);
			cardAddNewAcc.setLayout(cardAddNewAccLayout);
			cardAddNewAccLayout.setHorizontalGroup(
				cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(pnlAddNewAccountHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addGroup(cardAddNewAccLayout.createSequentialGroup()
				.addGap(152, 152, 152)
				.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(cardAddNewAccLayout.createSequentialGroup()
						.addComponent(lblForFixedInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardAddNewAccLayout.createSequentialGroup()
						.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(cardAddNewAccLayout.createSequentialGroup()
								.addComponent(lblLockAccUntil)
								.addGap(21, 21, 21)
								.addComponent(lockPeriodDatePicker))
							.addComponent(btnSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGroup(cardAddNewAccLayout.createSequentialGroup()
								.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addComponent(jLabel26)
									.addComponent(jLabel27)
									.addComponent(lblAddAccType))
								.addGap(59, 59, 59)
								.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
									.addComponent(comboAccType, 0, 201, Short.MAX_VALUE)
									.addComponent(txtFldInitBalance)
									.addComponent(txtFldAccName))))
								.addGap(115, 115, 115))))
				);
				cardAddNewAccLayout.setVerticalGroup(
					cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(cardAddNewAccLayout.createSequentialGroup()
						.addComponent(pnlAddNewAccountHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(54, 54, 54)
						.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(cardAddNewAccLayout.createSequentialGroup()
								.addGap(6, 6, 6)
								.addComponent(jLabel27))
							.addComponent(txtFldAccName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(cardAddNewAccLayout.createSequentialGroup()
								.addGap(6, 6, 6)
								.addComponent(jLabel26))
							.addComponent(txtFldInitBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(lblAddAccType)
							.addComponent(comboAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(35, 35, 35)
						.addComponent(lblForFixedInfo)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(cardAddNewAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(lblLockAccUntil)
							.addComponent(lockPeriodDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
						.addComponent(btnSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(44, 44, 44))
				);
		contentPanel.add(cardAddNewAcc, "cardAddNewAcc");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
				.addContainerGap())
			.addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)))
		);
	}

	private void cardAllAccountInit() {
		tblAccList.setFont(new java.awt.Font("Poppins", 0, 13)); 
		tblAccList.getTableHeader().setPreferredSize(new Dimension(header.getWidth(), 43));
		tblAccList.getTableHeader().setFont(new Font("Poppins", 0, 12));
		tblAccList.setRowHeight(34);
		tblAccList.setModel(new javax.swing.table.DefaultTableModel(
			new Object [][] {
				{null, null},
			},
			new String [] {
				"Accounts", "Balance"
			}
		));
		jScrollPane1.setViewportView(tblAccList);

		pnlAllAccountsHeader.setBackground(new java.awt.Color(0, 0, 0));

		lblViewAccHeaderTitle.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblViewAccHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
		lblViewAccHeaderTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblViewAccHeaderTitle.setText("{ACCOUNT NAME}'S ACCOUNTS");

		btnAddNewAcc.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		btnAddNewAcc.setLabel("+ ADD NEW ACCOUNT");
		btnAddNewAcc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddNewAccActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlAllAccountsHeaderLayout = new javax.swing.GroupLayout(pnlAllAccountsHeader);
		pnlAllAccountsHeader.setLayout(pnlAllAccountsHeaderLayout);
		pnlAllAccountsHeaderLayout.setHorizontalGroup(
			pnlAllAccountsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAllAccountsHeaderLayout.createSequentialGroup()
			.addGap(16, 16, 16)
				.addComponent(lblViewAccHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(btnAddNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(25, 25, 25))
		);
		pnlAllAccountsHeaderLayout.setVerticalGroup(
			pnlAllAccountsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(pnlAllAccountsHeaderLayout.createSequentialGroup()
			.addGap(23, 23, 23)
			.addGroup(pnlAllAccountsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(btnAddNewAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(lblViewAccHeaderTitle))
				.addContainerGap(23, Short.MAX_VALUE))
		);

		jLabel22.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel22.setText("INCOME");

		lblTitleHeader9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblTitleHeader9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTitleHeader9.setText("EXPENSES");

		jLabel21.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel21.setText("TOTAL");

		lblExpense.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblExpense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblExpense.setText("0.0");

		lblIncome.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblIncome.setText("0.0");

		lblTotal.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTotal.setText("0.0");

		javax.swing.GroupLayout cardViewAllAccountsLayout = new javax.swing.GroupLayout(cardViewAllAccounts);
			cardViewAllAccounts.setLayout(cardViewAllAccountsLayout);
			cardViewAllAccountsLayout.setHorizontalGroup(
				cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnlAllAccountsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardViewAllAccountsLayout.createSequentialGroup()
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(lblTitleHeader9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(cardViewAllAccountsLayout.createSequentialGroup()
					.addComponent(jScrollPane1))
				.addGroup(cardViewAllAccountsLayout.createSequentialGroup()
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(lblExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
		);
		cardViewAllAccountsLayout.setVerticalGroup(
			cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(cardViewAllAccountsLayout.createSequentialGroup()
				.addComponent(pnlAllAccountsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(jLabel22)
					.addComponent(lblTitleHeader9)
					.addComponent(jLabel21))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(cardViewAllAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(lblIncome)
					.addComponent(lblExpense)
					.addComponent(lblTotal))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		contentPanel.add(cardViewAllAccounts, "cardViewAllAccounts");
		
		contentPanel.add(cardViewAllAccounts, "cardViewAllAccounts");
	}

	public JTable getTblTransactions() {
		return tblTransactions;
	}

	public JComboBox<String> getcomboAccountList() {
		return comboAccountList;
	}

	private void btnViewAllAccActionPerformed(java.awt.event.ActionEvent evt) {                                              
		CardLayout card = (CardLayout)contentPanel.getLayout();
		card.show(contentPanel, "cardViewAllAccounts");
		btnAddTransaction.setVisible(true);
		btnViewAllAcc.setVisible(false);
		btnViewAllTrans.setVisible(true);
	}                                                                                    

	private void btnAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {                                                  
		CardLayout card = (CardLayout)contentPanel.getLayout();
		card.show(contentPanel, "cardAddTransaction");
		btnAddTransaction.setVisible(false);
		btnViewAllAcc.setVisible(true);
		btnViewAllTrans.setVisible(true);

		resetInput();
	}                       

	private void btnViewAllTransActionPerformed(java.awt.event.ActionEvent evt) {                                                
		CardLayout card2 = (CardLayout)contentPanel.getLayout();
		CardLayout card = (CardLayout)cardViewAllTrans.getLayout();
		card2.show(contentPanel, "cardViewAllTrans");
		card.show(cardViewAllTrans, "cardMonth");
		btnAddTransaction.setVisible(true);
		btnViewAllAcc.setVisible(true);
		btnViewAllTrans.setVisible(false);
	}                                               

	public void btnSaveTransactionActionPerformed(java.awt.event.ActionEvent evt) {                                                   
		CardLayout card2 = (CardLayout)contentPanel.getLayout();
		CardLayout card = (CardLayout)cardViewAllTrans.getLayout();
		card2.show(contentPanel, "cardViewAllTrans");
		card.show(cardViewAllTrans, "cardMonth");
		btnAddTransaction.setVisible(true);
		btnViewAllAcc.setVisible(true);
		btnViewAllTrans.setVisible(false);
	}

	public Transaction getNewTransaction() {
		String accountName = comboAccountList.getSelectedItem().toString();
		String type = comboTypeOfTransaction.getSelectedItem().toString();
		String description = txtFldDescription.getText();
		Double amount = Double.parseDouble(txtFieldAmount.getText());
		
		Date selectedDateUtil = (Date) datePicker.getModel().getValue();

		Instant instant = selectedDateUtil.toInstant();
		ZoneId zoneId = ZoneId.systemDefault();
		LocalDate selectedDate = instant.atZone(zoneId).toLocalDate();

		System.out.println(accountName +'\n'+ selectedDate +'\n'+ amount +'\n'+ type +'\n'+ description);

		return new Transaction(accountName, selectedDate, amount, type, description);
	}

	public Button getBtnSaveTransaction() {
		return btnSaveTransaction;
	}

	public void btnSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {   
		btnViewAllAccActionPerformed(evt);
	} 

	public Account getNewAccount() {
		String accountName = txtFldAccName.getText(); 
		double balance = Double.parseDouble(txtFldInitBalance.getText());
		String selectedAccount = (String) comboAccType.getSelectedItem();
		Date selectedDateUtil = (Date) lockPeriodDatePicker.getModel().getValue();
		Instant instant = selectedDateUtil.toInstant();
		ZoneId zoneId = ZoneId.systemDefault();
		LocalDate selectedDate = instant.atZone(zoneId).toLocalDate();

		System.out.println(accountName);
		System.out.println(balance);
		if (selectedDate != null) {
			System.out.println(selectedDate);
		}

		if (selectedAccount.equals("Fixed Deposit Account")) {
			return new FixedDepositAccount(accountName, balance, selectedDate);
		} else {
			return new Account(accountName, balance);
		}
	}

	public Button getBtnSaveAccount() {
		return btnSaveAccount;
	}

	private void btnAddNewAccActionPerformed(java.awt.event.ActionEvent evt) {                                             
		CardLayout card = (CardLayout)contentPanel.getLayout();
		card.show(contentPanel, "cardAddNewAcc");
		btnAddTransaction.setVisible(true);
		btnViewAllAcc.setVisible(true);
		btnViewAllTrans.setVisible(true);

		resetInput();
	}

	private void resetInput() {
		// reset transaction input
		txtFldDescription.setText("");
		txtFieldAmount.setText("0");
		model.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));

		// reset account input
		txtFldAccName.setText("Account");
		txtFldInitBalance.setText("0");
		model2.setDate(calendar.get(Calendar.YEAR) + 5, calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
	}

	public Button getLogOutBtn() {
		return btnLogOut;
	}

		// Variables declaration - do not modify    
		private JDatePickerImpl lockPeriodDatePicker; 
		private JDatePickerImpl datePicker;                
		private java.awt.Button btnAddNewAcc;
		private java.awt.Button btnAddTransaction;
		private java.awt.Button btnLogOut;
		private java.awt.Button btnSaveAccount;
		private java.awt.Button btnSaveTransaction;
		private java.awt.Button btnViewAllAcc;
		private java.awt.Button btnViewAllTrans;
		private javax.swing.JPanel cardAddNewAcc;
		private javax.swing.JPanel cardAddTransaction;
		private javax.swing.JPanel cardMonth;
		private javax.swing.JPanel cardViewAllAccounts;
		private javax.swing.JPanel cardViewAllTrans;
		private javax.swing.JPanel contentPanel;
		private javax.swing.JTextField txtFldInitBalance;
		private javax.swing.JPanel header;
		private javax.swing.JComboBox<String> comboAccountList;
		private javax.swing.JComboBox<String> comboTypeOfTransaction;
		private javax.swing.JComboBox<String> comboAccType;
		private javax.swing.JLabel lblTitleHeader;
		private javax.swing.JLabel lblTitleHeader0;
		private javax.swing.JLabel lblTitleHeader1;
		private javax.swing.JLabel lblViewAccHeaderTitle;
		private javax.swing.JLabel lblTransactionHeaderTitle;
		private javax.swing.JLabel lblTitleHeader9;
		private javax.swing.JLabel jLabel2;
		private javax.swing.JLabel lblTotal;
		private javax.swing.JLabel jLabel21;
		private javax.swing.JLabel jLabel22;
		private javax.swing.JLabel lblIncome;
		private javax.swing.JLabel lblExpense;
		private javax.swing.JLabel lbladdNewAccountTitle;
		private javax.swing.JLabel jLabel26;
		private javax.swing.JLabel jLabel27;
		private javax.swing.JLabel lblAddAccType;
		private javax.swing.JLabel lblLockAccUntil;
		private javax.swing.JLabel lblAddTransactionTitle;
		private javax.swing.JLabel jLabel6;
		private javax.swing.JLabel jLabel8;
		private javax.swing.JLabel jLabel9;
		private javax.swing.JLabel lblForFixedInfo;
		private javax.swing.JScrollPane jScrollPane1;
		private javax.swing.JScrollPane jScrollPane2;
		private javax.swing.JScrollPane jScrollPane3;
		private javax.swing.JTextField txtFieldAmount;
		private javax.swing.JTextField txtFldAccName;
		private javax.swing.JLabel lblAccName;
		private javax.swing.JLabel lblTotalAccountBalance;
		private javax.swing.JLabel lblYourTrans;
		private javax.swing.JPanel pnlAccName;
		private javax.swing.JPanel pnlAddNewAccountHeader;
		private javax.swing.JPanel pnlAddTransHeader;
		private javax.swing.JPanel pnlAllTransactionsHeader;
		private javax.swing.JPanel pnlAllAccountsHeader;
		private javax.swing.JPanel sidebar;
		private javax.swing.JTable tblAccList;
		private javax.swing.JTable tblTransPreview;
		private javax.swing.JTable tblTransactions;
		private javax.swing.JTextField txtFldDescription;
		private UtilDateModel model2 = new UtilDateModel();
		private UtilDateModel model = new UtilDateModel();
		private Calendar calendar = Calendar.getInstance();
	// End of variables declaration                   
}
