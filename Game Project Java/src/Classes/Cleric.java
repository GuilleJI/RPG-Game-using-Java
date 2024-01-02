package Classes;

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


    public String getCharacterInformString() {
        return "Clerics are powerful healers due to the large number of healing and curative magics available to them. They have higher defense but low agility.";
    }

    public String getWeaponInformString() {

        return null;
    }





}
