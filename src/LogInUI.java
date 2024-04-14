import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;

public class LogInUI extends javax.swing.JFrame {
	public LogInUI() {
		initComponents();
	}

	public void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		lblTitle = new javax.swing.JLabel();
		lbldesc = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txtFieldUsername = new javax.swing.JTextField();
		txtFldPassword = new javax.swing.JPasswordField();
		btnLogin = new javax.swing.JButton();
		btnSignup = new javax.swing.JButton();
		btnTestAccount = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		lblTitle.setFont(new java.awt.Font("IM FELL DW Pica", 1, 48)); // NOI18N
		lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblTitle.setText("Money.co");
		lblTitle.setToolTipText("");

		lbldesc.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		lbldesc.setText("Where you can manage your budget hassle-free.");

		jPanel2.setBackground(new java.awt.Color(204, 204, 204));

		jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
		jLabel1.setText("Login to Your Account");

		jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		jLabel2.setText("Username:");

		jLabel3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		jLabel3.setText("Password");

		txtFieldUsername.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		txtFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		txtFldPassword.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		txtFldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		btnLogin.setBackground(new java.awt.Color(102, 102, 102));
		btnLogin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		btnLogin.setForeground(new java.awt.Color(255, 255, 255));
		btnLogin.setText("Login");

		btnSignup.setBackground(new java.awt.Color(204, 204, 204));
		btnSignup.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		btnSignup.setForeground(new java.awt.Color(0, 0, 0));
		btnSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btnSignup.setText("Sign up");

		btnTestAccount.setBackground(new java.awt.Color(204, 204, 204));
		btnTestAccount.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
		btnTestAccount.setForeground(new java.awt.Color(0, 0, 0));
		btnTestAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btnTestAccount.setText("Use Test Account");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(87, 87, 87)
						.addComponent(jLabel1))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jLabel3)
							.addComponent(jLabel2)
							.addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(txtFldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(135, 135, 135)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnTestAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
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
			.addComponent(txtFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(52, 52, 52)
			.addComponent(jLabel3)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(txtFldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(64, 64, 64)
			.addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(btnTestAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(33, Short.MAX_VALUE))
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

		Image icon = Toolkit.getDefaultToolkit().getImage("src/assets/Icon.png");    
		setIconImage(icon);    

		pack();
		setVisible(true);
		setLocationRelativeTo(null);
  }

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public JButton getBtnSignup() {
		return btnSignup;
	}

	public JButton getBtnTestAccount() {
		return btnTestAccount;
	}

	// Variables declaration - do not modify                     
	private javax.swing.JButton btnLogin;
	private javax.swing.JButton btnSignup;
	private javax.swing.JButton btnTestAccount;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField txtFieldUsername;
	private javax.swing.JPasswordField txtFldPassword;
	private javax.swing.JLabel lblTitle;
	private javax.swing.JLabel lbldesc;
	// End of variables declaration                   
}
