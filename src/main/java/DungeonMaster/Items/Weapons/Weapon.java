package DungeonMaster.Items.Weapons;

import DungeonMaster.Items.Item;
import DungeonMaster.Items.ItemSlot;

public class Weapon extends Item {
    private WeaponType weaponType;
    private int weaponDamage;

    public Weapon(String name, int requiredLevel, WeaponType weaponType, int weaponDamage) {
        super(name, requiredLevel, ItemSlot.Weapon);
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
    }

        public WeaponType getWeaponType() {
            return weaponType;
        }

        public int getWeaponDamage() {
            return weaponDamage;
        }
}

