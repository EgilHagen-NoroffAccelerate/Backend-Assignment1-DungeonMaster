package DungeonMaster.Items.Armor;

import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.ItemSlot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {

    @Test
    void getArmorType_Armor_shouldReturnArmorType() {
        Armor armor = new Armor("OctoCamo", 3, ItemSlot.Body, ArmorType.Leather, new HeroAttributes(2,5,3));
        assertEquals(ArmorType.Leather, armor.getArmorType());
    }

    @Test
    void getArmorAttributes_Armor_shouldReturnAmorAttributes() {
        Armor armor = new Armor("Sick hat", 3, ItemSlot.Head, ArmorType.Cloth, new HeroAttributes(10,10,10));
        assertEquals(new HeroAttributes(10,10,10), armor.getArmorAttributes());
    }
}