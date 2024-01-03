package GUI;

import Classes.Cleric;
import Classes.Warrior;
import Classes.Wizard;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    //Constructors (private)
    private Warrior warrior;
    private Wizard wizard;
    private Cleric cleric;
    private JLabel characterImageLabel;
    private JLabel monsterImageLabel;
    private JTextArea displayText;
    private ImageIcon monsterPic;
    private SecondFrame secondFrame;

    private Boolean initial = true;

    //Constructors (public)
    public DisplayPanel(SecondFrame secondFrame){
        this.secondFrame = secondFrame;
        //Create and set font for the text
        Font myFont = new Font ("Baskerville", Font.BOLD, 20);

        //Set panel layout and properties
        setLayout(null);

        //Creating and set the title label
        JLabel choiceLabel = new JLabel("Crown of Eldoria: Chronicles of the Enchanted Realm");
        choiceLabel.setFont(new Font("Blackmoor LET", Font.BOLD, 50));
        choiceLabel.setBounds(150, 10, 480, 50);


    }

}
