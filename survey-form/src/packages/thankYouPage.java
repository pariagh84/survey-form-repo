package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0xdcb207));

        //Create and configure new font for components
        Font font = new Font("Serif", Font.BOLD, 20);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you for your participation!", SwingConstants.CENTER);
        thankYouLabel.setFont(font);

        // Add components to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);
    }
}
