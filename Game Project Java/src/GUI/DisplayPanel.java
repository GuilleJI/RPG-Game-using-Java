package GUI;

import Classes.Cleric;
import Classes.Warrior;
import Classes.Wizard;

import javax.swing.*;

public class DisplayPanel extends JPanel {
    private Warrior warrior;
    private Wizard wizard;
    private Cleric cleric;
    private JLabel characterImageLabel;
    private JLabel monsterImageLabel;
    private JTextArea displayText;
    private ImageIcon monsterPic;
    private SecondFrame secondFrame;

    private Boolean initial = true;

}
