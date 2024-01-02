package Classes;


import javax.swing.*;

public class Sword extends Weapon{

    //Constructor (private)
    private ImageIcon swordPic;

    //Constructor (public)
    public Sword (int attack, int weight) {
        super(attack, weight);

        //Set image for its shape
        swordPic = new ImageIcon(this.getClass().getResource("/Image/Sword.jpg"));
    }

    public ImageIcon getSwordPic() {
        return swordPic;
    }

    public void setSwordPic(ImageIcon swordPic){
        this.swordPic = swordPic;
    }

    public String getWeaponInformString() {
        return "A sword is a versatile good all-round weapon. " +
                "It is not bulky nor heavy, but inflicts a lot of damage.";

    }

    public String getCharacterInformString() {

        return null;
    }


}
