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
    }

}
