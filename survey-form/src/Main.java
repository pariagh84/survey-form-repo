import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("Survey Form");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //Create and configure new font for components
        Font font = new Font("Serif", Font.BOLD, 15);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0xdcb207));

        // Create and cifigure the center panel for main panel
        JPanel centertPanel = new JPanel();
        centertPanel.setLayout(new GridBagLayout());
        centertPanel.setBackground(new Color(0xdcb207));

        // Create title label
        JLabel title = new JLabel("Survey Form", SwingConstants.CENTER);
        title.setFont(font);
        title.setPreferredSize(new Dimension(150, 50));
        title.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(font);
        startButton.setPreferredSize(new Dimension(150, 75));
        startButton.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setVerticalAlignment(SwingConstants.CENTER);

        // Add components to center panel
        centertPanel.add(startButton);

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(centertPanel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(_ -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
