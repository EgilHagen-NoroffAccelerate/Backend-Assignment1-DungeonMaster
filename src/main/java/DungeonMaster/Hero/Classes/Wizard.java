package DungeonMaster.Hero.Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Armor.ArmorType;
import DungeonMaster.Items.Weapons.WeaponType;

public class Wizard extends Hero {
    public Wizard(String name) {
        super(name);
    }

    @Override
    protected HeroAttributes getInitialAttributes(){
        return new HeroAttributes(1,1,8);
    }

    @Override
    protected void validEquipmentTypes() {
        validWeapons.add(WeaponType.Wands);
        validWeapons.add(WeaponType.Staffs);
        validArmor.add(ArmorType.Cloth);
    }

    @Override
    protected HeroAttributes getAttributeGain() {
        return new HeroAttributes(1, 1, 5);
    }

    @Override
    protected int getDamagingAttribute() {
        return totalAttributes().getIntelligence();
    }
}
