package GUI;
import Classes.*;

import javax.swing.*;

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


}
