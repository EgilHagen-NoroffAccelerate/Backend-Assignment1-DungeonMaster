package DungeonMaster.Items;

import DungeonMaster.Items.Weapons.Weapon;
import DungeonMaster.Items.Weapons.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void getName_Item_shouldReturnItemName() {
        Item item = new Weapon("Master sword", 1, WeaponType.Swords, 5);
        assertEquals("Master sword", item.getName());
    }

    @Test
    void getRequiredLevel_Item_shouldReturnRequiredLevelForItem() {
        Item item = new Weapon("Master sword", 1, WeaponType.Swords, 5);
        assertEquals(1, item.getRequiredLevel());
    }

    @Test
    void getSlot_Item_shouldReturnDesignatedSlotOfItem() {
        Item item = new Weapon("Master sword", 1, WeaponType.Swords, 5);
        assertEquals(ItemSlot.Weapon, item.getSlot());
    }
}