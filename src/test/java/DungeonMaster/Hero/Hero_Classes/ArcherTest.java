package DungeonMaster.Hero.Hero_Classes;


import DungeonMaster.Hero.HeroAttributes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class ArcherTest {


    @Test
    void getInitialAttributes_Hero_shouldReturnClassInitialAttributes() {
        Archer archer = new Archer("Legolas");
        assertEquals(new HeroAttributes(1, 7, 1), archer.getInitialAttributes());
    }

    @Test
    void getAttributeGain_Hero_levelUpShouldIncreaseAttributesByCorrectAmount() {
        Archer archer = new Archer("Legolas");
        archer.levelUp();
        assertEquals(new HeroAttributes(1, 5, 1), archer.getAttributeGain());
    }

    @Test
    void getDamagingAttribute_Hero_DamagingAttributeShouldBeEqualToCurrentDexterity() {
        Archer archer = new Archer("Legolas");
        assertEquals(7, archer.getDamagingAttribute());
    }
}
