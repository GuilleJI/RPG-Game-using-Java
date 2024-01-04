package Classes;

import GUI.ChoosePanel;

import javax.swing.*;

public class Warrior extends PlayerCharacter {

    //Constructors (private):
    private ImageIcon warriorPic;
    private ImageIcon monsterPic;
    private String name;

    //Constructors (public):
    public Warrior(String name, int baseAttack, int defense, int agility, int hitPoints){
        super(name, baseAttack, defense, agility, hitPoints);
        warriorPic = new ImageIcon(this.getClass().getResource("/Images/Warrior.jpg"));
    }

    public ImageIcon getWarriorPic() {

        return warriorPic;
    }

    public void setWarriorPic(ImageIcon warriorPic) {

        this.warriorPic = warriorPic;
    }

    public ImageIcon getMonsterPic() {
        return monsterPic;
    }

    public void setMonsterPic(ImageIcon monsterPic) {

        this.monsterPic = monsterPic;
    }

    //toString method to return a description of the object:
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

    public String getCharacterInformString() {
        return "Warriors are engaged or experienced in warfare. They have higher HP and defence but low in agility.";
    }
}
