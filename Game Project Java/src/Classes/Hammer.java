package Classes;

import javax.swing.*;


public class Hammer extends Weapon {

    //Constructor (private)
    private ImageIcon hammerPic;

    //Constructor (public)

    public Hammer(int attack, int weight) {
        super(attack, weight);

        //Set image for this shape
        hammerPic = new ImageIcon(this.getClass().getResource("/Image/Hammer.jpg"));
    }

    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    public void setHammerPic(ImageIcon hammerPic){
        this.hammerPic = hammerPic;
    }


    public String getWeaponInformString() {
        return "The hammer holds a very powerful attack power. " +
                "A single attack can create a high hit point damage. " +
                "However, due to it's heavy weight hammers have a slow attack speed. ";
    }

    public String getCharacterInformString() {

        return null;
    }
}
