package Classes;

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


    public String getWeaponInformString() {

        return null;
    }

    public String getCharacterInformString(){
        return "Wizards are wise men who can perform magic spells. They have higher hit points but low in defense.";
    }
}
