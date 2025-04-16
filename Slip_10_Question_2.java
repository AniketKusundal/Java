import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip_10_Question_2 extends JFrame implements ActionListener {

    // GUI components
    JLabel lblUsername, lblPassword, lblMessage;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin;

    public Slip_10_Question_2() {
        // Frame settings
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the frame

        // Layout manager
        setLayout(new GridLayout(4, 2, 5, 5));

        // Initialize components
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        btnLogin = new JButton("Login");
        lblMessage = new JLabel("");

        // Add action listener to button
        btnLogin.addActionListener(this);

        // Add components to the frame
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(new JLabel("")); // empty cell
        add(btnLogin);
        add(lblMessage);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = txtUsername.getText();
        String pass = new String(txtPassword.getPassword());

        if (user.equals(user) && pass.equals(pass)) {
            lblMessage.setText("Login Successful!");
        } else {
            lblMessage.setText("Invalid Credentials.");
        }
    }

    public static void main(String[] args) {
        new Slip_10_Question_2();
    }
}
