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
    }

}
