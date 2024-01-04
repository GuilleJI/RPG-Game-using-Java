package Classes;

import GUI.ChoosePanel;

import javax.swing.*;

public class Cleric extends PlayerCharacter {

    //Constructors (private)
    private ImageIcon clericPic;
    private String name;

    //Constructors (public)
    public Cleric(String name, int baseAttack, int defense, int agility, int hitPoints) {
        super(name, baseAttack, defense, agility, hitPoints);

        clericPic = new ImageIcon(this.getClass().getResource("/Images/Cleric.jpg"));
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public ImageIcon getClericPic() {

        return clericPic;
    }

    public void setClericPic(ImageIcon clericPic){

        this.clericPic = clericPic;
    }

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


    public String getCharacterInformString() {
        return "Clerics are powerful healers due to the large number of healing and curative magics available to them. They have higher defense but low agility.";
    }

    public String getWeaponInformString() {

        return null;
    }


    public String getCharactorInformString() {
        return null;
    }
}
