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

        //Create characters
        theWarrior = new Warrior("Warrior", data[0], data[1], data[2], data[3]);
        theWizard = new Wizard("Wizard", data[0], data[1], data[2], data[3]);
        theCleric = new Cleric("Cleric", data[0], data[1], data[2], data[3]);

        theMonster = new Monster("");
    }

    //Getter and Setter methods for characters and weapons

    public static Warrior getTheWarrior() {return theWarrior;}
    public static void setTheWarrior(Warrior warrior) {
        theWarrior = warrior;
    }
    public static Wizard getTheWizard() {
        return theWizard;
    }
    public static void setTheWizard(Wizard wizard) {
        theWizard = wizard;
    }
    public static Cleric getTheCleric() {
        return theCleric;
    }
    public static void setTheCleric(Cleric cleric) {
        theCleric = cleric;
    }
    public static Dagger getTheDagger() {return theDagger;}
    public static Sword getTheSword() {return theSword;}
    public static Hammer getTheHammer() {
        return theHammer;
    }

}
