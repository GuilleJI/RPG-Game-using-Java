package Classes;

import javax.swing.*;

public class Cleric extends PlayerCharacter {

    //Constructors (private)
    private ImageIcon clericPic;
    private String name;

    //Constructors (public)
    public Cleric(String name, int baseAttack, int defense, int agility, int hitPoints) {
        super(name, baseAttack, defense, agility, hitPoints);

        clericPic = new ImageIcon(this.getClass().getResource("/Images/Cleric.jpg"))
    }


}
