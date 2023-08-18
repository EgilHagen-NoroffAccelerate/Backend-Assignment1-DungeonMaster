package DungeonMaster.Hero;


import DungeonMaster.Items.Item;
import DungeonMaster.Items.ItemSlot;

import DungeonMaster.Items.Armor.Armor;
import DungeonMaster.Items.Armor.ArmorType;

import DungeonMaster.Items.Weapons.InvalidWeaponException;
import DungeonMaster.Items.Armor.InvalidArmorException;
import DungeonMaster.Items.Weapons.Weapon;
import DungeonMaster.Items.Weapons.WeaponType;

import java.util.*;

import static DungeonMaster.ConsoleColors.RESET;


public abstract class Hero {
    private final String name;
    private int level;
    private HeroAttributes levelAttributes;
    private Map<ItemSlot, Item> equipmentMap;
    protected List<WeaponType> validWeapons = new ArrayList<>();
    protected List<ArmorType> validArmor = new ArrayList<>();


    public Hero(String name){
        this.name = name;
        this.level = 1;
        this.equipmentMap = new HashMap<>();
        this.levelAttributes = getInitialAttributes();
        validEquipmentTypes();
    }

    public String getName() {
        return name;
    }

    public int getLevel(){
        return level;
    }

    public Map<ItemSlot, Item> getEquipmentMap() {
        return equipmentMap;
    }

    public void levelUp(){
        level++;
        levelAttributes.add(getAttributeGain());
    }

    public void equip(Weapon weapon) throws InvalidWeaponException {
        if (!validWeapons.contains(weapon.getWeaponType())) {
            throw new InvalidWeaponException("ILLEGAL ACTION: This hero doesn't know how to wield this type of weapon");
        }
        if (weapon.getRequiredLevel() > level) {
            throw new InvalidWeaponException("ILLEGAL ACTION: Weapon's required level is too high for this hero.");
        }
        equipmentMap.put(ItemSlot.Weapon, weapon);
    }


    public void equip(Armor armor) throws InvalidArmorException {
        if (!validArmor.contains(armor.getArmorType())) {
            throw new InvalidArmorException("ILLEGAL ACTION: Invalid armor type for this hero.");
        }
        if (armor.getRequiredLevel() > this.level) {
            throw new InvalidArmorException("ILLEGAL ACTION: Armor's required level is too high for this hero.");
        }
        equipmentMap.put(armor.getSlot(), armor);
    }

    protected int getWeaponDamage() {
        Item equippedWeapon = equipmentMap.get(ItemSlot.Weapon);
        if (equippedWeapon instanceof Weapon) {
            return ((Weapon) equippedWeapon).getWeaponDamage();
        }
        return 1;
    }

    public double damage() {
        int damagingAttribute = getDamagingAttribute();
        int weaponDamage = getWeaponDamage();
        return (weaponDamage * (1 + damagingAttribute / 100.0));
    }

    public HeroAttributes totalAttributes() {
        HeroAttributes totalAttributes = new HeroAttributes(levelAttributes.getStrength(), levelAttributes.getDexterity(), levelAttributes.getIntelligence());

        for (Item item : equipmentMap.values()) {
            if (item instanceof Armor) {
                totalAttributes.add(((Armor) item).getArmorAttributes());
            }
        }
        return totalAttributes;
    }

    public void display() {
        System.out.println(getThemeColor());
        System.out.println("HERO NAME: " + getName());
        System.out.println("HERO CLASS: " + getClass().getSimpleName());
        System.out.println("HERO LEVEL: " + getLevel());
        System.out.println("HERO STRENGTH: " + totalAttributes().getStrength());
        System.out.println("HERO DEXTERITY: " + totalAttributes().getDexterity());
        System.out.println("HERO INTELLIGENCE: " + totalAttributes().getIntelligence());
        if (equipmentMap.containsKey(ItemSlot.Weapon)) {
            System.out.println("HERO WEAPON: " + equipmentMap.get(ItemSlot.Weapon).getName());
        }
        System.out.println("HERO DAMAGE OUTPUT: " + damage());
        System.out.println(RESET);
    }

    public abstract void validEquipmentTypes();

    public abstract HeroAttributes getInitialAttributes();

    public abstract HeroAttributes getAttributeGain();

    public abstract int getDamagingAttribute();

    public abstract String getThemeColor();

}
