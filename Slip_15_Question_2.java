 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip_15_Question_2 {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label to display result
        JLabel label = new JLabel("Programming language Selected: ");
        label.setBounds(80, 20, 250, 30);
        frame.add(label);

        // ComboBox with programming languages
        String languages[] = { "C", "C++", "C#", "Java", "PHP" };
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(80, 60, 100, 25);
        frame.add(comboBox);

        // Show button
        JButton showButton = new JButton("Show");
        showButton.setBounds(200, 60, 80, 25);
        frame.add(showButton);

        // Action listener for the button
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                label.setText("Programming language Selected: " + selected);
            }
        });

        frame.setVisible(true);
    }
}
