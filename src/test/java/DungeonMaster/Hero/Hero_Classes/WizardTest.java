package DungeonMaster.Hero.Hero_Classes;

import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.Armor.ArmorType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {


    @Test
    void getInitialAttributes_Hero_shouldReturnClassInitialAttributes() {
        Wizard wizard = new Wizard("Gandalf");
        assertEquals(new HeroAttributes(1, 1, 8), wizard.getInitialAttributes());

    }

    @Test
    void getAttributeGain_Hero_levelUpShouldIncreaseAttributesByCorrectAmount() {
        Wizard wizard = new Wizard("Gandalf");
        wizard.levelUp();
        assertEquals(new HeroAttributes(1, 1, 5), wizard.getAttributeGain());
    }

    @Test
    void getDamagingAttribute_Hero_DamagingAttributeShouldBeEqualToCurrentDexterity() {
        Wizard wizard = new Wizard("Gandalf");
        assertEquals(8, wizard.getDamagingAttribute());
    }
}