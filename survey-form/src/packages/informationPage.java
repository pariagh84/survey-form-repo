package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(0xdcb207));

        //Create and configure new font for components
        Font font = new Font("Serif", Font.BOLD, 15);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(font);

        nameLabel.setBounds(10, 10, 100, 20);
        JTextField nameField = new JTextField(15);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(font);
        JTextField ageField = new JTextField(15);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(font);
        JTextField emailField = new JTextField(15);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("Level of familiarity with similar software");
        levelLabel.setFont(font);

        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setFont(font);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setFont(font);
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setFont(font);
        JRadioButton level4 = new JRadioButton("No familiarity");
        level4.setFont(font);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("Next Page");
        nextButton.setFont(font);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
