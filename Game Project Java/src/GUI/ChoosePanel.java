package GUI;
import Classes.*;

import javax.swing.*;
import java.awt.*;

public class ChoosePanel extends JPanel {

    //Some controls need to be declared at the class level, if referenced in multiple places
    private JButton battleStartBtn, rerollBtn;
    private JTextArea characterInformation, weaponInformation;
    private JLabel imageLabel, imageLabelWeapon;
    private static JTextField nameText;
    private JRadioButton rdoWarrior, rdoWizard, rdoCleric;
    private JRadioButton rdoDagger;
    private JRadioButton rdoSword;
    private JRadioButton rdoHammer;

    private Warrior warrior = null;
    private Wizard wizard = null;
    private Cleric cleric = null;

    private Dagger dagger = null;
    private Sword sword = null;
    private Hammer hammer = null;

    private static JTextField textField1;
    private static JTextField textField2;
    private static JTextField textField3;
    private static JTextField textField4;
    private static JTextField textField5
    private static JTextField textField6;
    private static JTextField textField7;

    public static String CharacterType;
    private static String currentMonsterName;
    private static String weaponType;
    private ImageIcon monsterPic;

    public ChoosePanel() {
        //set font Object
        Font myFont = new Font("Blackmoor LET", Font.BOLD, 22);
        Font screenTitle = new Font("Blackmoor LET", Font.BOLD, 40);
        Font selectTitle = new Font("Blackmoor LET", Font.BOLD, 30);
        Font information = new Font("Blackmoor LET", Font.BOLD, 10);
        //Set Panel Properties
        setLayout(null);
        setVisible(true);
        //Create all GUI objects
        //Radiobutton for each shape
        addCharacterStats(myFont);
        addWeaponSelect(myFont);

        JLabel titleLabel = new JLabel("Character Generator");
        titleLabel.setFont(screenTitle);
        titleLabel.setBounds(50, 20, 500, 50);

        //Label control for name
        JLabel enterNameLabel = new JLabel("Enter Name:");
        enterNameLabel.setFont(selectTitle);
        enterNameLabel.setBounds(50, 70, 200, 50);

        //Label control for Character Type
        JLabel characterTypeLabel = new JLabel("Character Type");
        characterTypeLabel.setFont(selectTitle);
        characterTypeLabel.setBounds(50, 120, 300, 50);
        add(characterTypeLabel);

        //Label control for Character Stats
        JLabel characterStatsLabel = new JLabel("Character Stats");
        characterStatsLabel.setFont(selectTitle);
        characterStatsLabel.setBounds(500, 120, 300, 50);

        //Label control for Hit Points
        JLabel chaHit = new JLabel("Hit Points");
        chaHit.setFont(myFont);
        chaHit.setBounds(500, 170, 300, 30);
        add(chaHit);

        //Label control for Defense
        JLabel chaDef = new JLabel("Defense");
        chaDef.setFont(myFont);
        chaDef.setBounds(500, 205, 300, 30);
        add(chaDef);

        //Label control for Agility
        JLabel chaAgi = new JLabel("Agility");
        chaAgi.setFont(myFont);
        chaAgi.setBounds(500, 240, 300, 30);
        add(chaAgi);

        //Label control for Base Attack
        JLabel chaBaseAtt = new JLabel("Base Attack");
        chaBaseAtt.setFont(myFont);
        chaBaseAtt.setBounds(500, 275, 300, 30);
        add(chaBaseAtt);

        //Label control for "Select your Weapon"
        JLabel weaponLabel = new JLabel("Select your Weapon");
        weaponLabel.setFont(selectTitle);
        weaponLabel.setBounds(50, 400, 300, 50);
        add(weaponLabel);

        //Label control for Weapon Stats
        JLabel weaponStatsLabel = new JLabel("Weapon Stats");
        weaponStatsLabel.setFont(selectTitle);
        weaponStatsLabel.setBounds(500, 400, 300, 50);
        add(weaponStatsLabel);

        //Label control for Attack Modifier
        JLabel weaponAttack = new JLabel("Attack Modifier");
        weaponAttack.setFont(myFont);
        weaponAttack.setBounds(500, 460, 290, 30);
        add(weaponAttack);

        //Label control for Weight
        JLabel weaponWeight = new JLabel("Weight");
        weaponWeight.setFont(myFont);
        weaponWeight.setBounds(500, 500, 300, 30);
        add(weaponWeight);

        //Textfield control for name
        nameText = new JTextField();
        nameText.setFont(myFont);
        nameText.setBounds(260, 70, 200, 50);

        //Labels to show dimensions of each shape in a single field
        characterInformation = new JTextArea();
        characterInformation.setLineWrap(true);
        characterInformation.setFont(myFont);
        characterInformation.setBounds(50, 320, 400,70);

        weaponInformation = new JTextArea();
        weaponInformation.setLineWrap(true);
        weaponInformation.setFont(information);
        weaponInformation.setBounds(50, 630, 400,90);

        //Label for shape image
        imageLabel = new JLabel();
        imageLabel.setBounds(240, 170, 150, 150);

        imageLabelWeapon = new JLabel();
        imageLabelWeapon.setBounds(240, 450, 150, 150);







    }


}
