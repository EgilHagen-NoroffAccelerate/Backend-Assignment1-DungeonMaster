package DungeonMaster.Items.Weapons;

import DungeonMaster.Hero.Hero;
import DungeonMaster.Hero.Hero_Classes.Wizard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    void getWeaponType_Weapon_shouldReturnWeaponType() {
        Weapon weapon = new Weapon("Stick of truth", 1, WeaponType.Wands, 10);
        WeaponType type = weapon.getWeaponType();
        assertEquals(WeaponType.Wands, type);
    }

    @Test
    void getWeaponDamage_Weapon_shouldReturnWeaponDamage() {
        Weapon weapon = new Weapon("Stick of truth", 1, WeaponType.Wands, 10);
        assertEquals(10, weapon.getWeaponDamage());
    }
}