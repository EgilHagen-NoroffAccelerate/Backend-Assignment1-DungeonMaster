package DungeonMaster.Hero.Hero_Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.ArmorType;
import static DungeonMaster.ConsoleColors.GREEN;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void validEquipmentTypes() {
        validWeapons.add(WeaponType.Bows);
        validArmor.add(ArmorType.Leather);
        validArmor.add(ArmorType.Mail);
    }

    @Override
    public HeroAttributes getInitialAttributes() {
        return new HeroAttributes(1, 7, 1);
    }

    @Override
    public HeroAttributes getAttributeGain(){
        return new HeroAttributes(1, 5, 1);
    }

    @Override
    public int getDamagingAttribute() {
        return totalAttributes().getDexterity();
    }

    @Override
    public String getThemeColor() {
        return GREEN;
    }
}
