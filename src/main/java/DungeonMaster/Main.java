package DungeonMaster;

import DungeonMaster.Hero.Hero_Classes.Archer;
import DungeonMaster.Hero.Hero_Classes.Wizard;
import DungeonMaster.Hero.Hero_Classes.Swashbuckler;
import DungeonMaster.Hero.Hero_Classes.Barbarian;
import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.HeroAttributes;

import DungeonMaster.Items.Armor.InvalidArmorException;
import DungeonMaster.Items.ItemSlot;
import DungeonMaster.Items.Weapons.InvalidWeaponException;
import DungeonMaster.Items.Weapons.Weapon;
import DungeonMaster.Items.Weapons.WeaponType;
import DungeonMaster.Items.Armor.Armor;
import DungeonMaster.Items.Armor.ArmorType;

public class Main {



    public static void main(String[] args) throws InvalidWeaponException, InvalidArmorException {
        Hero archer = new Archer("Legolas");
        Hero archer2 = new Archer("Robin Hood");
        Hero wizard = new Wizard("Gandalf");
        Hero barbarian = new Barbarian("Gimli");
        Hero swashbuckler = new Swashbuckler("Aragorn");

        Weapon archersBow = new Weapon("David Bowie", 1, WeaponType.Bows, 45);
        Weapon archersBow2 = new Weapon("Big bow", 10, WeaponType.Bows, 45);
        Weapon wizardsStaff = new Weapon("Walking Stick", 1, WeaponType.Staffs, 50);
        Weapon barbarianMace = new Weapon("Mace Windu", 4, WeaponType.Maces, 100);
        Weapon saber = new Weapon("Andúril", 4, WeaponType.Swords, 70);

        Armor archersJacket = new Armor("Deer hide", 2, ItemSlot.Body, ArmorType.Leather, new HeroAttributes(2,2,2));
        Armor archersJacket2 = new Armor("Bear rug", 1, ItemSlot.Body, ArmorType.Leather, new HeroAttributes(3,3,3));
        Armor archersHat = new Armor("Bucket hat", 1, ItemSlot.Head, ArmorType.Mail, new HeroAttributes(1,1,1));
        Armor robes = new Armor("Archmage's robes", 1, ItemSlot.Head, ArmorType.Cloth, new HeroAttributes(2,1,100));


        System.out.println("Hero display");
        barbarian.display();
        swashbuckler.display();
        archer.display();
        wizard.display();



        System.out.println("Wizard equips weapon");
        try {
            wizard.equip(wizardsStaff);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        wizard.display();

        System.out.println("Archer equips wrong armor");
        try {
            archer.equip(archersJacket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        archer.display();

        System.out.println("Archer levels up");
        archer.levelUp();
        archer.display();

        System.out.println("Archer tries to equip armor again");
        try {
            archer.equip(archersJacket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        archer.display();

        System.out.println("Archer equips wrong weapon");
        try {
            archer.equip(wizardsStaff);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        archer.display();

        System.out.println("Archer equips correct weapon");
        try {
            archer.equip(archersBow);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        archer.display();

    }
}