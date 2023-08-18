package DungeonMaster.Hero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroAttributesTest {

    @Test
    void add_HeroAttributes_shouldAddNewHeroAttributes() {
        HeroAttributes attributes = new HeroAttributes(5, 10, 15);
        HeroAttributes addedValues = new HeroAttributes(2, 3, 4);

        attributes.add(addedValues);

        assertEquals(7,13,19);
    }

    @Test
    void testEquals_HeroAttributes_equalsToProvidedAttributesShouldBeTrue() {
        HeroAttributes firstAttributes = new HeroAttributes(1,2,3);
        assertTrue(firstAttributes.equals(new HeroAttributes(1,2,3)));
    }
}