package DungeonMaster.Hero;

import DungeonMaster.Hero.Hero_Classes.Archer;
import DungeonMaster.Hero.Hero_Classes.Barbarian;
import DungeonMaster.Hero.Hero_Classes.Swashbuckler;
import DungeonMaster.Hero.Hero_Classes.Wizard;
import DungeonMaster.Items.Armor.Armor;
import DungeonMaster.Items.Armor.ArmorType;
import DungeonMaster.Items.Armor.InvalidArmorException;
import DungeonMaster.Items.ItemSlot;
import DungeonMaster.Items.Weapons.InvalidWeaponException;
import DungeonMaster.Items.Weapons.Weapon;
import DungeonMaster.Items.Weapons.WeaponType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    private Archer archer;
    private Barbarian barbarian;
    private Swashbuckler swashbuckler;
    private Wizard wizard;


    @BeforeEach
    void init() {
        //Initialize archer
        archer = new Archer("Legolas");

        //Initialize barbarian
        barbarian = new Barbarian("Gimli");

        //Initialize swashbuckler
        swashbuckler = new Swashbuckler("Aragorn");


        //Initialize wizard with appropriate equipment
        wizard = new Wizard("Gandalf");

    }

    @Test
    public void getName_hero_shouldReturnHeroName() {
        String name = wizard.getName();
        assertEquals("Gandalf", name);
        assertEquals("Aragorn", swashbuckler.getName());
    }

    @Test
    void getLevel_hero_shouldReturnLevel() {
        assertEquals(1, wizard.getLevel());
        wizard.levelUp();
        assertEquals(2, wizard.getLevel());
    }

    @Test
    public void levelUp_hero_shouldIncreaseLevel() {
        wizard.levelUp();
        int level = wizard.getLevel();
        assertEquals(2, level);
    }

    @Test
    void equipped_weapon_shouldReturnTrue() throws InvalidWeaponException {
        Weapon weapon = new Weapon("Walking stick", 1, WeaponType.Staffs, 10);
        assertFalse(wizard.getEquipmentMap().containsKey(ItemSlot.Weapon));
        wizard.equip(weapon);
        assertTrue(wizard.getEquipmentMap().containsKey(ItemSlot.Weapon));
    }

    @Test
    void equipped_armor_shouldReturnTrue() throws InvalidArmorException {
        Armor wizardRobes = new Armor("White robes", 1, ItemSlot.Body, ArmorType.Cloth, new HeroAttributes(2, 1, 100));
        wizard.equip(wizardRobes);
        assertTrue(wizard.getEquipmentMap().containsKey(ItemSlot.Body));
    }

    @Test
    void equipped_armor_shouldReturnFalse() throws InvalidArmorException {
        Armor wizardRobes = new Armor("White robes", 1, ItemSlot.Head, ArmorType.Cloth, new HeroAttributes(2, 1, 100));
        wizard.equip(wizardRobes);
        assertFalse(wizard.getEquipmentMap().containsKey(ItemSlot.Body));
    }

    @Test
    void getWeaponDamage_weapon_shouldReturnWeaponDamage() throws InvalidWeaponException {
        Weapon sword = new Weapon("Andúril", 1, WeaponType.Swords, 70);
        swashbuckler.equip(sword);
        assertEquals(70, swashbuckler.getWeaponDamage());
    }

    @Test
    void damage_hero_shouldReturnTotalDamageWithoutWeaponEquipped() throws InvalidWeaponException {
        assertEquals((1 * (1 + 8 / 100.00)), wizard.damage());
    }

    @Test
    void damage_hero_shouldReturnTotalDamageWithWeaponEquipped() throws InvalidWeaponException {
        Weapon weapon = new Weapon("Walking stick", 1, WeaponType.Staffs, 10);

        wizard.equip(weapon);
        assertEquals((10 * (1 + 8 / 100.00)), wizard.damage());
    }
    @Test
    void damage_hero_shouldReturnTotalDamageWithIncreasedDamagingAttribute() {
        //levelUp increases damagingAttribute, Intelligence, to 13
        wizard.levelUp();
        assertEquals((1 * (1 + 13 / 100.00)), wizard.damage());
    }

    @Test
    void totalAttributes_HeroAttributes_shouldIncreaseWithEquippedArmorAndLevel() throws InvalidArmorException {
        Armor armor = new Armor("Robes", 1, ItemSlot.Body, ArmorType.Cloth, new HeroAttributes(3, 3, 3));
        assertEquals(new HeroAttributes(1, 1, 8), wizard.totalAttributes());
        wizard.levelUp();
        assertEquals(new HeroAttributes(2, 2, 13), wizard.totalAttributes());
        wizard.equip(armor);
        assertEquals(new HeroAttributes(5, 5, 16), wizard.totalAttributes());
    }
}

