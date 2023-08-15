package DungeonMaster.Hero.Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.ArmorType;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
        HeroAttributes initialAttributes = new HeroAttributes(1,1,1);
    }

    @Override
    protected void validEquipmentTypes() {
        validWeapons.add(WeaponType.Bows);
        validArmor.add(ArmorType.Leather);
        validArmor.add(ArmorType.Mail);
    }

    @Override
    protected HeroAttributes getInitialAttributes(){
        return new HeroAttributes(7,1,1);
    }

    @Override
    protected HeroAttributes getAttributeGain() {
        return new HeroAttributes(5, 1, 1);
    }

    @Override
    protected int getDamagingAttribute() {
        return totalAttributes().getDexterity();
    }
}
