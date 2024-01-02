package Classes;

import javax.swing.*;

public class Dagger extends Weapon {

    //Constructors (private)
    private ImageIcon daggerPic;

    //Constructors (public)
    public Dagger(int attack, int weight){
        super(attack, weight);

        //Set image for this shape
        daggerPic = new ImageIcon(this.getClass().getResource("/Image/Dagger.jpg"));
    }

    public ImageIcon getDaggerPic() {
        return daggerPic;
    }
    public void setDaggerPic(ImageIcon daggerPic){
        this.daggerPic = daggerPic;
    }

    public String getCharacterInformString() {
        return null;
    }

    public String getWeaponInformString(){
        return "A dagger is a light and fast weapon. " +
                "Classes with high agility are very effective when using this weapon. " +
                "It can maintain fast attack speed, but the increase in additional attack power is not high..";
    }
}
