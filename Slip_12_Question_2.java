import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    // Constructor
    public LoginForm() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Use GridBagLayout for precise control
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Labels and Fields
        JLabel lblUser = new JLabel("Username:");
        JLabel lblPass = new JLabel("Password:");
        JTextField txtUser = new JTextField(12);
        JPasswordField txtPass = new JPasswordField(12);

        // Buttons
        JButton btnLogin = new JButton("Login");
        JButton btnReset = new JButton("Reset");

        // Username Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblUser, gbc);

        // Username TextField
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(txtUser, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblPass, gbc);

        // Password Field
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(txtPass, gbc);

        // Buttons Panel
        JPanel panelButtons = new JPanel();
        panelButtons.add(btnLogin);
        panelButtons.add(btnReset);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(panelButtons, gbc);

        // Button actions
        btnLogin.addActionListener(e -> {
            String username = txtUser.getText();
            String password = new String(txtPass.getPassword());
            JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + password);
        });

        btnReset.addActionListener(e -> {
            txtUser.setText("");
            txtPass.setText("");
        });
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}
