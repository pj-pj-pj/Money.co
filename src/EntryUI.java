import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class EntryUI extends javax.swing.JFrame {
  // Variables declaration - do not modify 
	private javax.swing.JButton btnLogin = new javax.swing.JButton();
	private javax.swing.JButton btnSignup = new javax.swing.JButton();
	private javax.swing.JButton btnTestAccount = new javax.swing.JButton();                   
	private javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
	private javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
	private javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
	private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
	private javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
	private javax.swing.JTextField txtFieldUsername = new javax.swing.JTextField();
	private javax.swing.JLabel lblTitle = new javax.swing.JLabel();
	private javax.swing.JLabel lbldesc = new javax.swing.JLabel();
	// End of variables declaration 

	public EntryUI() {
		initComponents();
	}

  private void initComponents() {
    Image icon = Toolkit.getDefaultToolkit().getImage("src/assets/Icon.png");    
		setIconImage(icon); 
  }

  public JLabel getJLabel1() {
    return jLabel1;
  }

  public JLabel getJLabel2() {
      return jLabel2;
  }

  public JLabel getJLabel3() {
      return jLabel3;
  }

  public JPanel getJPanel1() {
      return jPanel1;
  }

  public JPanel getJPanel2() {
      return jPanel2;
  }

  public JTextField getTxtFieldUsername() {
      return txtFieldUsername;
  }

  public JLabel getLblTitle() {
      return lblTitle;
  }

  public JLabel getLbldesc() {
      return lbldesc;
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

	public String getUsername() {
		return txtFieldUsername.getText();
	}

  public String getPassword() {
		return "";
	}

  public String setPassword() {
		return "";
	}
}
