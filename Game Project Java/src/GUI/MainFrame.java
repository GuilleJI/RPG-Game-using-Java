package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200, 750,750);
        setTitle("Crown of Eldoria: Chronicles of the Enchanted Realm");

        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Crown of Eldoria: Chronicles of the Enchanted Realm", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Blackmoor LET", Font.BOLD, 30));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));
        subPanel.setBackground(Color.LIGHT_GRAY);

    }
}
