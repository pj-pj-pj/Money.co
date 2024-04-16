import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LogInUI extends EntryUI {
	private javax.swing.JPasswordField txtFldPassword;

	public LogInUI() {
		initComponents();
	}

	public void initComponents() {
		txtFldPassword = new JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		getLblTitle().setFont(new java.awt.Font("IM FELL DW Pica", 1, 48)); // NOI18N
		getLblTitle().setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		getLblTitle().setText("Money.co");
		getLblTitle().setToolTipText("");

		getLbldesc().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getLbldesc().setText("Where you can manage your budget hassle-free.");

		getJPanel2().setBackground(new java.awt.Color(204, 204, 204));

		getJLabel1().setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
		getJLabel1().setText("Login to Your Account");

		getJLabel2().setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		getJLabel2().setText("Username:");

		getJLabel3().setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		getJLabel3().setText("Password");

		getTxtFieldUsername().setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		getTxtFieldUsername().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		txtFldPassword.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		txtFldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		getBtnLogin().setBackground(new java.awt.Color(102, 102, 102));
		getBtnLogin().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getBtnLogin().setForeground(new java.awt.Color(255, 255, 255));
		getBtnLogin().setText("Login");

		getBtnSignup().setBackground(new java.awt.Color(204, 204, 204));
		getBtnSignup().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getBtnSignup().setForeground(new java.awt.Color(0, 0, 0));
		getBtnSignup().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		getBtnSignup().setText("Sign up");

		getBtnTestAccount().setBackground(new java.awt.Color(204, 204, 204));
		getBtnTestAccount().setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		getBtnTestAccount().setForeground(new java.awt.Color(0, 0, 0));
		getBtnTestAccount().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		getBtnTestAccount().setText("Use Test Account");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(getJPanel2());
		getJPanel2().setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(87, 87, 87)
						.addComponent(getJLabel1()))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(getJLabel3())
							.addComponent(getJLabel2())
							.addComponent(getTxtFieldUsername(), javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(txtFldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(135, 135, 135)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addComponent(getBtnLogin(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(getBtnSignup(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(getBtnTestAccount(), javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
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
			.addComponent(txtFldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(64, 64, 64)
			.addComponent(getBtnLogin(), javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(getBtnSignup(), javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(getBtnTestAccount(), javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(33, Short.MAX_VALUE))
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
		String str = new String(txtFldPassword.getPassword());
		return str;
	}

	public JPasswordField getTxtFldPassword() {
		return txtFldPassword;
	}
}
