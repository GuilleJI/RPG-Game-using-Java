package Classes;

public abstract class Weapon {

    //Private Constructors:
    private int attack;
    private int weight;
    private int agility;
    private int hitPoints;

    //Public Constructors:
    public Weapon(int attack, int weight){
        this.attack = attack;
        this.weight = weight;
    }

    //Getter and Setter Generated
    public int getAttack() {

        return attack;
    }

    public void setAttack(int attack) {

        this.attack = attack;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getAgility() {

        return agility;
    }

    public void setAgility(int agility) {

        this.agility = agility;
    }

    public int getHitPoints() {

        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {

        this.hitPoints = hitPoints;
    }

    public String getWeaponInformString() {
        return "Attack " + attack + ", Weight: " + weight + ", Agility: " + agility + ", Hit Points: " + hitPoints;
    }

    public abstract String getCharacterInformString();
}
