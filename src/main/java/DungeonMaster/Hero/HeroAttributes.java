package DungeonMaster.Hero;

public class HeroAttributes {
    private int strength;
    private int dexterity;
    private int intelligence;

    public  HeroAttributes(int dexterity, int strength, int intelligence){
        this.dexterity = dexterity;
        this.strength = strength;
        this.intelligence = intelligence;
    }
    //assertEquals wont work - need to override- generate "equalsandHashcode"

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public HeroAttributes add(HeroAttributes other) {
        return new HeroAttributes(strength += other.strength, dexterity += other.dexterity, intelligence += other.intelligence);
    }



    /* public int calculateTotal() {
        return strength + dexterity + intelligence;
    } */
}


