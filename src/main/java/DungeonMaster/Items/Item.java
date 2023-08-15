package DungeonMaster.Items;

public abstract class Item {
    private String name;
    private int requiredLevel;
    private ItemSlot slot;

    public Item(String name, int requiredLevel, ItemSlot slot){
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public String getName(){
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public ItemSlot getSlot() {
        return slot;
    }
}
