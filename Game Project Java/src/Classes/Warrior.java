package Classes;

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

    public String getWeaponInformString() {
        return null;
    }

    public String getCharacterInformString() {
        return "Warriors are engaged or experienced in warfare. They have higher HP and defence but low in agility.";
    }
}
