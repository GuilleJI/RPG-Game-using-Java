package GUI;
import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        //Change screen button
        battleStartBtn = new JButton("Start Game");
        battleStartBtn.setFont(myFont);
        battleStartBtn.setBounds(500, 700, 200, 50);

        rerollBtn = new JButton("Reroll");
        rerollBtn.setFont(myFont);
        rerollBtn.setBounds(500, 320, 200, 50);

        //Add all controls to Panel
        add(rdoWarrior);
        add(rdoWizard);
        add(rdoCleric);
        add(rdoDagger);
        add(rdoHammer);
        add(rdoSword);
        add(titleLabel);
        add(enterNameLabel);
        add(nameText);
        add(imageLabel);
        add(imageLabelWeapon);
        add(characterInformation);
        add(weaponInformation);
        add(battleStartBtn);
        add(rerollBtn);

        //Create text fields for displaying random numbers
        textField1 = new JTextField();
        textField1.setBounds(650, 170, 50, 30);
        textField2 = new JTextField();
        textField2.setBounds(650, 205, 50, 30);
        textField3 = new JTextField();
        textField3.setBounds(650, 240, 50, 30);
        textField4 = new JTextField();
        textField4.setBounds(650, 275, 50, 30);
        textField5 = new JTextField();
        textField5.setBounds(650, 460, 50, 30);
        textField6 = new JTextField();
        textField6.setBounds(650, 500, 50, 30);
        textField7 = new JTextField();

        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);
        add(textField6);
        getRerollBtn();

    }

    private void addWeaponSelect(Font myFont) {
        Font selectTitle = new Font("Baskerville", Font.BOLD, 30 );
        //Create the Dagger radio button
        rdoDagger = new JRadioButton("Dagger");
        rdoDagger.setFont(myFont);
        rdoDagger.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                //When the Dagger radio button is selected, get the Dagger object
                dagger = SecondFrame.getTheDagger();
                //Update the weapon information label with the Dagger's stats
                weaponInformation.setText(dagger.getWeaponInformString());
                //Update the weapon image to show the Dagger
                swapImageWeapon(dagger.getDaggerPic());
                //Create the weapon stats panel
                createWeaponStats();
            }
        });

        //Create the Sword radio button
        rdoSword = new JRadioButton("Sword");
        rdoSword.setFont(myFont);
        rdoSword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                //When the Sword radio button is selected, get the Sword object
                sword = SecondFrame.getTheSwrod();
                //Update the weapon information label with the Sword's stats
                weaponInformation.setText(sword.getWeaponInformString());
                //Update the weapon image to show the Sword
                swapImagesWeapon(sword.getSwordPic());
                //Create the weapon stats panel
                createWeaponStats();
            }
        });
        //Create the Hammer radio button
        rdoHammer = new JRadioButton("Hammer");
        rdoHammer.setFont(myFont);
        rdoHammer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                //When the Hammer radio button is selected get the Hammer object
                hammer = SecondFrame.getTheHammer();
                //Update the weapon information label with the Hammer's stats
                weaponInformation.setText(hammer.getWeaponInformString());
                //Update the weapon image to show the Hammer
                swapImagesWeapon(hammer.getHammerPic());
                //Create the weapon stats panel
                createWeaponStats();
            }
        });
        //Set the bounds for the Dagger, Sword, and Hammer radio button
        rdoDagger.setBounds(50, 460, 150, 50);
        rdoSword.setBounds(50, 520, 150, 50);
        rdoHammer.setBounds(50, 580, 150, 50);

        //ButtonGroup to group the radio buttons
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoDagger);
        grpColorRadios.add(rdoSword);
        grpColorRadios.add(rdoHammer);
    }

    private void addCharacterStats(Font myFont){
        //Create Warrior radio button
        rdoWarrior = new JRadioButton("Warrior");
        rdoWarrior.setFont(myFont);
        rdoWarrior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                warrior = SecondFrame.getTheWarrior();
                characterInformation.setText(warrior.getCharacterInformString());
                swapImages(warrior.getWarriorPic());
                createCharacterStats();
            }
        });

        //Create Wizard radio button
        rdoWizard = new JRadioButton("Wizard");
        rdoWizard.setFont(myFont);
        rdoWizard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                wizard = SecondFrame.getTheWizard();
                characterInformation.setText(wizard.getCharacterInformString());
                swapImages(wizard.getWizardPic());
                createCharacterStats();
            }
        });

        //Create Cleric radio button
        rdoCleric = new JRadioButton("Cleric");
        rdoCleric.setFont(myFont);
        rdoCleric.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cleric = SecondFrame.getTheCleric();
                characterInformation.setText(cleric.getCharactorInformString());
                swapImages(cleric.getClericPic());
                createCharacterStats();
            }
        });

        rdoWarrior.setBounds(50, 170, 150, 50);
        rdoWizard.setBounds(50, 220, 150, 50);
        rdoCleric.setBounds(50, 270, 150, 50);

        //ButtonGroup to group the radio buttons
        ButtonGroup grpColorRadios = new ButtonGroup();
        grpColorRadios.add(rdoWarrior);
        grpColorRadios.add(rdoWizard);
        grpColorRadios.add(rdoCleric);
    }

    public void swapImages(ImageIcon image){
        imageLabel.setIcon(image);
    }

    public void swapImagesWeapon(ImageIcon image){

        imageLabelWeapon.setIcon(image);
    }

    private void getRerollBtn(){
        //Reroll button action listener
        rerollBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                createCharacterStats();
            }
        });
    }

    public void createCharacterStats() {
        String name = nameText.getText();
        if(rdoWarrior.isSelected()) {
            warrior = SecondFrame.getTheWarrior();
            warrior.setName(name);
            //Create 4 random numbers and put them in text boxes
            int[] nums = new int[4];
            for (int i =0; i < nums.length; i++){
                nums[i] = (int) (Math.random() * 100);
            }
            textField1.setText(String.valueOf(nums[0]));
            textField2.setText(String.valueOf(nums[1]));
            textField3.setText(String.valueOf(nums[2]));
            textField4.setText(String.valueOf(nums[3]));
            textField7.setText("Warrior");
            CharacterType = "Warrior";

        }else if (rdoWizard.isSelected()) {
            //Create 4 random numbers and put them in text boxes
            wizard = SecondFrame.getTheWizard();
            wizard.setName(name);
            int[] nums = new int[4];
            for (int i = 0; i < nums.length; i++){
                nums[i] = (int) (Math.random() * 100);
            }
            textField1.setText(String.valueOf(nums[0]));
            textField2.setText(String.valueOf(nums[1]));
            textField3.setText(String.valueOf(nums[2]));
            textField4.setText(String.valueOf(nums[3]));
            CharacterType = "Wizard";

        }else if (rdoCleric.isSelected()){
            //Create 4 random numbers and put them in text boxes
            cleric = SecondFrame.getTheCleric();
            cleric.setName(name);
            int[] nums = new int[4];
            for (int i =0; i < nums.length; i++){
                nums[i] = (int) (Math.random() * 100);
            }
            textField1.setText(String.valueOf(nums[0]));
            textField2.setText(String.valueOf(nums[1]));
            textField3.setText(String.valueOf(nums[2]));
            textField4.setText(String.valueOf(nums[3]));
            CharacterType = "Cleric";
        }
    }

    public void createWeaponStats() {
        if(rdoDagger.isSelected()) {
            //Create 4 random numbers and put them in text boxes
            int[] nums = new int[2];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) (Math.random() * 50);
            }
            textField5.setText(String.valueOf(nums[0]));
            textField6.setText(String.valueOf(nums[1]));
            weaponType = "Dagger";

        } else if (rdoHammer.isSelected()) {
            //Create 4 random numbers and put them in text boxes
            int[] nums = new int[2];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) (Math.random() * 50);
            }
            textField5.setText(String.valueOf(nums[0]));
            textField6.setText(String.valueOf(nums[1]));
            weaponType = "Hammer";
    }



}
