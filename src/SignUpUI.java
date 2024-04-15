public class SignUpUI extends EntryUI {
	private javax.swing.JTextField txtFieldPassword;

	public SignUpUI() {
		initComponents();
	}

	private void initComponents() {
		txtFieldPassword = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false); 

		getLblTitle().setFont(new java.awt.Font("IM FELL DW Pica", 1, 48)); // NOI18N
		getLblTitle().setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		getLblTitle().setText("Money.co");
		getLblTitle().setToolTipText("");

		getLbldesc().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getLbldesc().setText("Where you can manage your budget hassle-free.");

		getJPanel2().setBackground(new java.awt.Color(204, 204, 204));

		getJLabel1().setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
		getJLabel1().setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		getJLabel1().setText("Sign up");

		getJLabel2().setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		getJLabel2().setText("Username:");

		getJLabel3().setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		getJLabel3().setText("Password");

		getTxtFieldUsername().setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		getTxtFieldUsername().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		txtFieldPassword.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		txtFieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		getBtnLogin().setBackground(new java.awt.Color(204, 204, 204));
		getBtnLogin().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getBtnLogin().setText("Login");
		getBtnLogin().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		getBtnSignup().setBackground(new java.awt.Color(102, 102, 102));
		getBtnSignup().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getBtnSignup().setForeground(new java.awt.Color(255, 255, 255));
		getBtnSignup().setText("Sign up");

		getBtnTestAccount().setBackground(new java.awt.Color(204, 204, 204));
		getBtnTestAccount().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getBtnTestAccount().setText("Use Test Account");
		getBtnTestAccount().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(getJPanel2());
		getJPanel2().setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(135, 135, 135)
						.addComponent(getBtnSignup(), javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(87, 87, 87)
							.addComponent(getJLabel1(), javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(getJLabel3())
								.addComponent(getJLabel2())
								.addComponent(getTxtFieldUsername(), javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(getBtnLogin(), javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(getBtnTestAccount(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
			.addContainerGap(68, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGap(31, 31, 31)
				.addComponent(getJLabel1())
				.addGap(48, 48, 48)
				.addComponent(getJLabel2())
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(getTxtFieldUsername(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(52, 52, 52)
				.addComponent(getJLabel3())
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(47, 47, 47)
				.addComponent(getBtnSignup(), javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(getBtnTestAccount(), javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(getBtnLogin(), javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(26, 26, 26))
		);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(getJPanel1());
		getJPanel1().setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(270, 270, 270)
							.addComponent(getLblTitle(), javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(251, 251, 251)
							.addComponent(getLbldesc()))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(197, 197, 197)
							.addComponent(getJPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(230, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addGap(19, 19, 19)
				.addComponent(getLblTitle(), javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getLbldesc())
				.addGap(26, 26, 26)
				.addComponent(getJPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(35, Short.MAX_VALUE))
		);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(getJPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addComponent(getJPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(0, 0, Short.MAX_VALUE))
		);

    pack();
		setVisible(true);
		setLocationRelativeTo(null);
  }

	public String getPassword() {
		return txtFieldPassword.getText();
	}                
}
