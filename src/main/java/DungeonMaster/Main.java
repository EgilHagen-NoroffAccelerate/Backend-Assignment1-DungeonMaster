package DungeonMaster;

import DungeonMaster.Hero.Classes.Archer;
import DungeonMaster.Hero.Classes.Wizard;
import DungeonMaster.Hero.Classes.Swashbuckler;
import DungeonMaster.Hero.Classes.Barbarian;
import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Item;
import DungeonMaster.Items.ItemSlot;
import DungeonMaster.Items.Weapons.Weapon;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.Armor;
import DungeonMaster.Items.Armor.ArmorType;

public class Main {
    public static void main(String[] args) {
        Hero wizard = new Archer("Nils");
        Weapon staff = new Weapon("cool staff", 1, WeaponType.Staffs, 10);
        Armor coat = new Armor("cool jacket", 1, ItemSlot.Body, ArmorType.Leather, new HeroAttributes(1,1,1));
        wizard.equipWeapon(staff);
        wizard.equipArmor(coat);

        System.out.println(wizard.display());
    }

}