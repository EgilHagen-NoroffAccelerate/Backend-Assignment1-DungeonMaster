package DungeonMaster.Hero;

import DungeonMaster.Items.Armor.Armor;
import DungeonMaster.Items.Armor.ArmorType;
import DungeonMaster.Items.Item;
import DungeonMaster.Items.ItemSlot;
import DungeonMaster.Items.Weapons.Weapon;
import DungeonMaster.Items.Weapons.WeaponType;

import java.util.*;


public abstract class Hero {
    private final String name;
    private int level;
    private HeroAttributes levelAttributes;
    private EnumMap<ItemSlot, Item> equipmentMap;
    protected List<WeaponType> validWeapons = new ArrayList<>();
    protected List<ArmorType> validArmor = new ArrayList<>();


    public Hero(String name){
        this.name = name;
        this.level = 1;
        this.levelAttributes = getInitialAttributes();
        validEquipmentTypes();
    }

    public void levelUp(){
        level++;
        levelAttributes = levelAttributes.add(getAttributeGain());
    }

    public void equip(Item item){
        ItemSlot slot = item.getSlot();
        if (equipmentMap.containsKey(slot)){
            equipmentMap.put(slot, item);
        } else {
            throw  new IllegalArgumentException("Not an ItemSlot!");
        }

    }
    public void equipWeapon(Weapon weapon) {
        if (validWeapons.contains(weapon.getWeaponType())) {
            equip(weapon);
        } else {
            throw new IllegalArgumentException(name + " can not carry that weapon");
        }
    }

    public void equipArmor(Armor armor) {
        if (validArmor.contains(armor.getArmorType())) { // Alt: validArmor.contains(((Armor) armor).getArmorType()))
            equip(armor);
        } else {
            throw new IllegalArgumentException(name + " can not wear that armor");
        }
    }

    protected int getEquippedWeaponDamage() {
        Item equippedWeapon = equipmentMap.get(ItemSlot.Weapon);
        if (equippedWeapon instanceof Weapon) {
            return ((Weapon) equippedWeapon).getWeaponDamage();
        }
        return 1; // Default weapon damage if no weapon equipped
    }


    public int damage() {
        int damagingAttribute = getDamagingAttribute();
        int weaponDamage = getEquippedWeaponDamage();
        return (int) (weaponDamage * (1 + damagingAttribute / 100.0));
    }

    public HeroAttributes totalAttributes() {
        HeroAttributes totalAttributes = levelAttributes;
        for (Item item : equipmentMap.values()) {
            if (item instanceof Armor) {
                totalAttributes.add(((Armor) item).getArmorAttributes());
            }
        }
        return totalAttributes;
    }

    public String display() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name; ").append(name);
        return stringBuilder.toString();
    }

    protected abstract void validEquipmentTypes();

    protected abstract HeroAttributes getInitialAttributes();

    protected abstract HeroAttributes getAttributeGain();

    protected abstract int getDamagingAttribute();

}
