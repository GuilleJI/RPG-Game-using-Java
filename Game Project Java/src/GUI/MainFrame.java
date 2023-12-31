package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

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

        ImageIcon imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Start Page.jpg")));
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        subPanel.add(Box.createRigidArea(new Dimension(0, 100)));
        subPanel.add(imageLabel);

        JButton startButton = new JButton("Let the Quest Begin!!");
        startButton.setFont(new Font("Baskerville", Font.BOLD, 15));
        startButton.addActionListener(e -> {
            // Add the code to handle button click and change to the next page here
            SecondFrame secondFrame = new SecondFrame();
            secondFrame.setVisible(true);
            dispose();
        });

        startButton.setPreferredSize(new Dimension(200, 50));
        startButton.setMaximumSize(new Dimension(200, 50));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        subPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        subPanel.add(startButton);
        subPanel.add(Box.createVerticalGlue());

        mainPanel.add(subPanel, BorderLayout.CENTER);
        add(mainPanel);

        setVisible(true);

    }
}
