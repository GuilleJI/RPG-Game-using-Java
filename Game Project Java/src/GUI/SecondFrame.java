package GUI;

import Classes.*;

import javax.swing.*;
import java.awt.*;

public class SecondFrame extends JFrame {

    //Constructors (private)
    private static Warrior theWarrior;
    private static Wizard theWizard;
    private static Cleric theCleric;
    private static Dagger theDagger;
    private static Sword theSword;
    private static Hammer theHammer;

    private static Monster theMonster;

    private int[] data;

    //Constructors (public)
    public SecondFrame() {
        //Create display screen
        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 750, 800);
        setTitle("DND Game!");
        setLayout(new CardLayout());


        //Add Panel "screens"
        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel(this);
        add(chooseScreen);
        chooseScreen.setBackground(Color.LIGHT_GRAY); //Added Background color for ChooseScreen
        add(displayScreen);
        displayScreen.setBackground(Color.LIGHT_GRAY); //Added Background color for DisplayScreen

        //Navigate to display screen
        JButton displayBtn = chooseScreen.getStartBattleBtn();
        displayBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                chooseScreen.setVisible(false);
                displayScreen.displayChoice();
                displayScreen.setVisible(true);
            }
        });

        data = ChoosePanel.getTextFieldsData();

        //Create list of weapons
        theDagger = new Dagger(0,0);
        theSword = new Sword(0,0);
        theHammer = new Hammer(0,0);


    }

}
