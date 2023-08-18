package DungeonMaster.Hero.Hero_Classes;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.ArmorType;
import static DungeonMaster.ConsoleColors.YELLOW;



public class Swashbuckler extends Hero {

    public Swashbuckler(String name) {
        super(name);
    }

    @Override
    public void validEquipmentTypes() {
        validWeapons.add(WeaponType.Daggers);
        validWeapons.add(WeaponType.Swords);
        validArmor.add(ArmorType.Leather);
        validArmor.add(ArmorType.Mail);
    }

    @Override
    public HeroAttributes getInitialAttributes(){
        return new HeroAttributes(2,6,1);
    }

    @Override
    public HeroAttributes getAttributeGain() {
        return new HeroAttributes(1, 4, 1);
    }

    @Override
    public int getDamagingAttribute() {
        return totalAttributes().getDexterity();
    }

    @Override
    public String getThemeColor() {
        return YELLOW;
    }
}