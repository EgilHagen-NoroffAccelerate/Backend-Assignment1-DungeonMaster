package DungeonMaster.Hero.Hero_Classes;

import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Armor.ArmorType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarbarianTest {


    @Test
    void getInitialAttributes_Hero_shouldReturnClassInitialAttributes() {
        Barbarian barbarian = new Barbarian("Gimli");
        assertEquals(new HeroAttributes(5, 2, 1), barbarian.getInitialAttributes());
    }

    @Test
    void getAttributeGain_Hero_levelUpShouldIncreaseAttributesByCorrectAmount() {
        Barbarian barbarian = new Barbarian("Gimli");
        barbarian.levelUp();
        assertEquals(new HeroAttributes(3, 2, 1),barbarian.getAttributeGain());
    }

    @Test
    void getDamagingAttribute_Hero_DamagingAttributeShouldBeEqualToCurrentDexterity() {
        Barbarian barbarian = new Barbarian("Gimli");
        assertEquals(5, barbarian.getDamagingAttribute());
    }
}