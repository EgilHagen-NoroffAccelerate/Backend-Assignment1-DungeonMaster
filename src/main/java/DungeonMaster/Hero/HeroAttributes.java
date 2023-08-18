package DungeonMaster.Hero;

import java.util.Objects;

public class HeroAttributes {
    private int strength;
    private int dexterity;
    private int intelligence;

    public  HeroAttributes(int strength, int dexterity, int intelligence){
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void add(HeroAttributes addedValues) {
        strength += addedValues.getStrength();
        dexterity += addedValues.getDexterity();
        intelligence += addedValues.getIntelligence();
    }


    @Override
    public boolean equals(Object other) {
        HeroAttributes otherAttributes = (HeroAttributes) other;
        return strength == otherAttributes.strength && dexterity == otherAttributes.dexterity && intelligence == otherAttributes.intelligence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, dexterity, intelligence);
    }
}


