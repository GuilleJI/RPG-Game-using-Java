package Classes;

public abstract class PlayerCharacter {

    //Constructors (private)
    private String name;
    private Weapon weapon;

    private int baseAttack;
    private int defense;
    private int agility;
    private int hitPoints;

    //Constructors (public)

    public PlayerCharacter(String name, int attack, int weight, int agility, int hitPoints){
        this.name = name;
        this.baseAttack = stats[0];
        this.defense = stats[1];
        this.agility = stats[2];
        this.hitPoints = stats[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }


}
