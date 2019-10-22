package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

public class TrackerBase {
    private final ArrayList<Item> items = new ArrayList<Item>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public void resetItems() {
        items.clear();
    }

    public Item add(Item item) {
        items.add(item);
        item.setId(this.generateId());
        return item;
    }

    public boolean replace(String id, Item item) {
        for (Item value : items) {
            if (value.getId().equals(id)) {
                item.setId(id);
                items.remove(value);
                items.add(item);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        System.out.println("test");
        for (Item value : items) {
            if (value != null && value.getId().equals(id)) {
                System.out.println("found to delete," + value);
                items.remove(value);
                return true;
            }
            System.out.println(value);
        }
        return false;
    }

    public ArrayList<Item> getAll() {
        ArrayList<Item> it = new ArrayList<Item>();
        for (Item value : items) {
            it.add(value);
        }
        return it;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> it = new ArrayList<Item>();
        int pos = 0;
        for (Item value : items) {
            if (items.get(pos) != null && items.get(pos).getName().equals(key)) {
                it.add(value);
            }
            pos++;
        }
        for (Item item : it) {
            System.out.println(item);
        }
        return it;
    }

    public Item findById(String id) {
        Item[] it = new Item[items.size()];
        int pos = 0;
        for (Item value : items) {
            if (items.get(pos) != null && items.get(pos).getId().equals(id)) {
                return value;
            }
            pos++;
        }
        return null;
    }

    private String generateId() {
        int r = new Random().nextInt();
        return String.valueOf(r);
    }
}
