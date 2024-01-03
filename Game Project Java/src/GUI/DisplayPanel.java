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

        //Create and set the text area
        displayText = new JTextArea();
        displayText.setBounds(50, 350, 650, 270);
        displayText.setFont(myFont);
        displayText.setLineWrap(true);
        displayText.setEnabled(false);
        displayText.setWrapStyleWord(true);

        //Create and set the character and monster image labels
        characterImageLabel = new JLabel();
        characterImageLabel.setBounds(200, 150, 150, 150);
        monsterImageLabel = new JLabel();
        monsterImageLabel.setBounds(400, 150, 150, 150);

        //Create a back button and add an action listener
        JButton backButton = new JButton("PLAY AGAIN!");
        backButton.setFont(new Font("Blackmoor LET", Font.BOLD, 20));
        backButton.setBounds(280, 650, 200, 50);
        backButton.addActionListener(e -> {

            initial = false;
            SwingUtilities.invokeLater(MainFrame::new);
            secondFrame.dispose(); //Close the current SecondFrame
        });

        //Add components to the panel
        add(choiceLabel);
        add(displayText);
        add(characterImageLabel);
        add(monsterImageLabel);
        add(backButton);
    }

    public void displayChoice() {
        //Get character instances from SecondFrame
        warrior = SecondFrame.getTheWarrior();
        wizard = SecondFrame.getTheWizard();
        cleric = SecondFrame.getTheCleric();

        //Initialize variables
        String monster = "";
        String text = "";

        //Display character image and information based on the selected character
        if(warrior.getName() != null && !warrior.getName().isEmpty()){
            swapImages(warrior.getWarriorPic());
            text = warrior.toString();
        } else if (wizard.getName() != null && !wizard.getName().isEmpty()){
            swapImages(wizard.getWizardPic());
            text = wizard.toString();
        } else if (cleric.getName() != null && !cleric.getName().isEmpty()){
            swapImages(cleric.getClericPic());
            text = cleric.toString();
        }

        //Update display text with character information
        displayText.setText(text);
    }



}
