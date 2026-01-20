package javaPrograms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserValidatorUI {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("User Validator");
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 25);
        frame.add(userLabel);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 100, 25);
        frame.add(passLabel);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 100, 100, 25);
        frame.add(ageLabel);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(20, 140, 100, 25);
        frame.add(mobileLabel);

        // Text fields
        JTextField userText = new JTextField();
        userText.setBounds(120, 20, 150, 25);
        frame.add(userText);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(120, 60, 150, 25);
        frame.add(passText);

        JTextField ageText = new JTextField();
        ageText.setBounds(120, 100, 150, 25);
        frame.add(ageText);

        JTextField mobileText = new JTextField();
        mobileText.setBounds(120, 140, 150, 25);
        frame.add(mobileText);

        // Button
        JButton validateBtn = new JButton("Validate");
        validateBtn.setBounds(120, 180, 100, 30);
        frame.add(validateBtn);

        // Result label
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(20, 220, 300, 25);
        frame.add(resultLabel);

        // Button click action
        validateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = userText.getText();
                String password = new String(passText.getPassword());
                String age = ageText.getText();
                String mobile = mobileText.getText();

                if (username.isEmpty()) {
                    resultLabel.setText("❌ Username is required");
                } else if (password.length() < 6) {
                    resultLabel.setText("❌ Password must be 6+ chars");
                } else if (!age.matches("\\d+") || Integer.parseInt(age) < 18) {
                    resultLabel.setText("❌ Age must be >= 18");
                } else if (!mobile.matches("\\d{10}")) {
                    resultLabel.setText("❌ Mobile must be 10 digits");
                } else {
                    resultLabel.setText("✅ User data is VALID");
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
