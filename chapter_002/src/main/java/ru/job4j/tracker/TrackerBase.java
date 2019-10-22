package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrackerBase {
    private final List<Item> items = new ArrayList<Item>();

    public List<Item> getItems() {
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
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                item.setId(id);
                items.remove(i);
                items.add(item);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Item> getAll() {
        List<Item> it = new ArrayList<Item>();
        for (Item value : items) {
            it.add(value);
        }
        return it;
    }

    public List<Item> findByName(String key) {
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
