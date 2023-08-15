package DungeonMaster.Hero.Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.ArmorType;

public class Barbarian extends Hero {

    public Barbarian(String name) {
        super(name);
    }

    @Override
    protected void validEquipmentTypes() {
        validWeapons.add(WeaponType.Hatchets);
        validWeapons.add(WeaponType.Maces);
        validWeapons.add(WeaponType.Swords);
        validArmor.add(ArmorType.Mail);
        validArmor.add(ArmorType.Plate);
    }

    @Override
    protected HeroAttributes getInitialAttributes(){
        return new HeroAttributes(2,5,1);
    }
    @Override
    protected HeroAttributes getAttributeGain() {
        return new HeroAttributes(2, 3, 1);
    }

    @Override
    protected int getDamagingAttribute() {
        return totalAttributes().getStrength();
    }
}





