package DungeonMaster.Hero.Hero_Classes;

import DungeonMaster.Hero.HeroAttributes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwashbucklerTest {


    @Test
    void getInitialAttributes_Hero_shouldReturnClassInitialAttributes() {
        Swashbuckler swashbuckler = new Swashbuckler("Aragorn");
        assertEquals(new HeroAttributes(2, 6, 1), swashbuckler.getInitialAttributes());
    }

    @Test
    void getAttributeGain_Hero_levelUpShouldIncreaseAttributesByCorrectAmount() {
        Swashbuckler swashbuckler = new Swashbuckler("Aragorn");
        swashbuckler.levelUp();
        assertEquals(new HeroAttributes(1, 4, 1), swashbuckler.getAttributeGain());
    }

    @Test
    void getDamagingAttribute_Hero_DamagingAttributeShouldBeEqualToCurrentDexterity() {
        Swashbuckler swashbuckler= new Swashbuckler("Aragorn");
        assertEquals(6, swashbuckler.getDamagingAttribute());
    }
}