package Classes;

import GUI.ChoosePanel;

import javax.swing.*;

public class Wizard extends PlayerCharacter {

    //Constructor (private)
    private ImageIcon wizardPic;
    private String name;

    //Constructor (public)
    public Wizard(String name, int baseAttack, int defense, int agility, int hitPoints){
        super(name, baseAttack, defense, agility, hitPoints);

        //Set image for this shape
        wizardPic = new ImageIcon(this.getClass().getResource("/Images/Wizard.jpg"));
    }

    public ImageIcon getWizardPic() {

        return wizardPic;
    }

    public void setWizardPic(ImageIcon wizardPic) {

        this.wizardPic = wizardPic;
    }

    //toString method to return a description of the object.
    public String toString() {
        int[] stats = ChoosePanel.getTextFieldsData();
        int[] monsStats = ChoosePanel.getSelectMonster();
        String monsterName = ChoosePanel.getMonsterName();
        return String.format("Player : %-10s\n---------------------" +
                        "\nClass  : %-10s" +
                        "\nHP     : %-3d               Attack Point : %-3d          Defense : %-3d          Agility : %-3d" +
                        "\nWeapon : %-13s Weight : %-3d               Attack Mod : %-3d" +
                        "\n\n" +

                        "Monster Name : %-10s\n---------------------" +
                        "\nHP       : %-3d               Defence     : %-3d          Base Attack : %-3d",
                name,
                ChoosePanel.getCharacterType(),
                100,
                stats[0],
                stats[1],
                stats[2],
                ChoosePanel.getWeaponType(),
                stats[5],
                stats[4],
                monsterName,
                50,
                monsStats[0],
                monsStats[1]);
    }


    public String getWeaponInformString() {

        return null;
    }

    public String getCharacterInformString(){
        return "Wizards are wise men who can perform magic spells. They have higher hit points but low in defense.";
    }
}
