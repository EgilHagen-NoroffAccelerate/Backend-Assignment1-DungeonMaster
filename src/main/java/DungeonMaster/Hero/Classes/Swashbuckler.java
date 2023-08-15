package DungeonMaster.Hero.Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.ArmorType;

public class Swashbuckler extends Hero {

    public Swashbuckler(String name) {
        super(name);
    }

    @Override
    protected HeroAttributes getInitialAttributes(){
        return new HeroAttributes(6,2,1);
    }
    @Override
    protected void validEquipmentTypes() {
        validWeapons.add(WeaponType.Daggers);
        validWeapons.add(WeaponType.Swords);
        validArmor.add(ArmorType.Leather);
        validArmor.add(ArmorType.Mail);
    }

    @Override
    protected HeroAttributes getAttributeGain() {
        return new HeroAttributes(4, 1, 1);
    }

    @Override
    protected int getDamagingAttribute() {
        return totalAttributes().getStrength();
    }
}