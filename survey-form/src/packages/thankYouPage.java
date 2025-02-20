package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        //Create and configure new font for components
        Font font = new Font("Serif", Font.BOLD, 15);


        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you for your participation!");
        thankYouLabel.setFont(font);
        thankYouLabel.setBounds(10, 10, 200, 20);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
