import javax.swing.JButton;

public class SignUpUI extends javax.swing.JFrame {
	public SignUpUI() {
		initComponents();
	}

	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		lblTitle = new javax.swing.JLabel();
		lbldesc = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		loginBtn = new javax.swing.JButton();
		signupBtn = new javax.swing.JButton();
		testBtn = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		lblTitle.setFont(new java.awt.Font("IM FELL DW Pica", 1, 48)); // NOI18N
		lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTitle.setText("Money.co");
		lblTitle.setToolTipText("");

		lbldesc.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lbldesc.setText("Where you can manage your budget hassle-free.");

		jPanel2.setBackground(new java.awt.Color(204, 204, 204));

		jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Sign up");

		jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		jLabel2.setText("Username:");

		jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		jLabel3.setText("Password");

		jTextField1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		jTextField3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		loginBtn.setBackground(new java.awt.Color(204, 204, 204));
		loginBtn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		loginBtn.setText("Login");
		loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		signupBtn.setBackground(new java.awt.Color(102, 102, 102));
		signupBtn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		signupBtn.setForeground(new java.awt.Color(255, 255, 255));
		signupBtn.setText("Sign up");

		testBtn.setBackground(new java.awt.Color(204, 204, 204));
		testBtn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		testBtn.setText("Use Test Account");
		testBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(135, 135, 135)
						.addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(87, 87, 87)
							.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel3)
								.addComponent(jLabel2)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel2Layout.createSequentialGroup()
									.addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(testBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
			.addContainerGap(68, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGap(31, 31, 31)
				.addComponent(jLabel1)
				.addGap(48, 48, 48)
				.addComponent(jLabel2)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(52, 52, 52)
				.addComponent(jLabel3)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(47, 47, 47)
				.addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
				.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(testBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(26, 26, 26))
		);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(270, 270, 270)
							.addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(251, 251, 251)
							.addComponent(lbldesc))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(197, 197, 197)
							.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(230, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addGap(19, 19, 19)
				.addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(lbldesc)
				.addGap(26, 26, 26)
				.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(35, Short.MAX_VALUE))
		);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(0, 0, Short.MAX_VALUE))
		);

    pack();
		setLocationRelativeTo(null);
  }      
	
	public JButton getBtnLogin() {
		return loginBtn;
	}

	public JButton getBtnSignup() {
		return signupBtn;
	}

	public JButton getBtnTestAccount() {
		return testBtn;
	}

	// Variables declaration - do not modify                     
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JLabel lblTitle;
	private javax.swing.JLabel lbldesc;
	private javax.swing.JButton loginBtn;
	private javax.swing.JButton signupBtn;
	private javax.swing.JButton testBtn;
	// End of variables declaration                   
}
