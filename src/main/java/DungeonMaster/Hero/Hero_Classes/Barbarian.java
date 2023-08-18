package DungeonMaster.Hero.Hero_Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.ArmorType;
import static DungeonMaster.ConsoleColors.RED;

public class Barbarian extends Hero {

    public Barbarian(String name) {
        super(name);
    }

    @Override
    public void validEquipmentTypes() {
        validWeapons.add(WeaponType.Hatchets);
        validWeapons.add(WeaponType.Maces);
        validWeapons.add(WeaponType.Swords);
        validArmor.add(ArmorType.Mail);
        validArmor.add(ArmorType.Plate);
    }

    @Override
    public HeroAttributes getInitialAttributes(){
        return new HeroAttributes(5,2,1);
    }

    @Override
    public HeroAttributes getAttributeGain() {
        return new HeroAttributes(3, 2, 1);
    }

    @Override
    public int getDamagingAttribute() {
        return totalAttributes().getStrength();
    }

    @Override
    public String getThemeColor() {
        return RED;
    }
}





