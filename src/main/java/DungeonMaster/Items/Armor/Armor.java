package DungeonMaster.Items.Armor;

import DungeonMaster.Items.Item;
import DungeonMaster.Hero.HeroAttributes;
import DungeonMaster.Items.ItemSlot;

public class Armor extends Item {
    private ArmorType armorType;
    private HeroAttributes armorAttributes;

    public Armor(String name, int requiredLevel, ItemSlot slot, ArmorType armorType, HeroAttributes armorAttributes) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttributes = armorAttributes;
    }
    public ArmorType getArmorType(){
        return armorType;
    }

    public HeroAttributes getArmorAttributes() {
        return armorAttributes;
    }

}
