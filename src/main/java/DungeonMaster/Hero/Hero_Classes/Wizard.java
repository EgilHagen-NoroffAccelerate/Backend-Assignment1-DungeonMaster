package DungeonMaster.Hero.Hero_Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Armor.ArmorType;
import DungeonMaster.Items.Weapons.WeaponType;
import static DungeonMaster.ConsoleColors.BLUE;

public class Wizard extends Hero {
    public Wizard(String name) {
        super(name);
    }


    @Override
    public void validEquipmentTypes() {
        validWeapons.add(WeaponType.Wands);
        validWeapons.add(WeaponType.Staffs);
        validArmor.add(ArmorType.Cloth);
    }

    @Override
    public HeroAttributes getInitialAttributes(){
        return new HeroAttributes(1,1,8);
    }

    @Override
    public HeroAttributes getAttributeGain() {
        return new HeroAttributes(1, 1, 5);
    }

    @Override
    public int getDamagingAttribute() {
        return totalAttributes().getIntelligence();
    }

    @Override
    public String getThemeColor() {
        return BLUE;
    }
}
