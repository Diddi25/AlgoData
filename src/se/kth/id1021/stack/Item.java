package se.kth.id1021.stack;

public class Item {
    private ItemType type;
    private int value = 0;

    public ItemType type() {
        return this.type;
    }
    public int value() {return this.value;}

    public static Item Value(int number) {
        Item item = new Item();
        item.type = ItemType.VALUE;
        item.value = number;
        return item;
    }
    public static Item Add() {
        Item item = new Item();
        item.type = ItemType.ADD;
        item.value = 0;
        return item;
    }
    public static Item Sub() {
        Item item = new Item();
        item.type = ItemType.SUB;
        item.value = 0;
        return item;
    }
    public static Item Mul() {
        Item item = new Item();
        item.type = ItemType.MUL;
        item.value = 0;
        return item;
    }
    public static Item Div() {
        Item item = new Item();
        item.type = ItemType.DIV;
        item.value = 0;
        return item;
    }

}
