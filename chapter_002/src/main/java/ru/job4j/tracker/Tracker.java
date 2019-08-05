package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        this.items[this.position++] = item;
        item.setId(this.generateId());
        return item;
    }

    public boolean replace(String id, Item item) {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                item.setId(findById(id).getId());
                this.items[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = null;
                for (int j = i; j < items.length; j++) {
                    if (items[j] != null) {
                        items[i] = items[j];
                        items[j] = null;
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Item[] getAll() {
        Item[] arr = new Item[100];
        int pos = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                arr[pos++] = items[i];
            }
        }
        return Arrays.copyOf(arr, pos);
    }

    public Item[] findByName(String key) {
        Item[] arr = new Item[100];
        int pos = 0;
        for (int i = 0; i < items.length; i++) {
            if (this.items[i] != null && this.items[i].getName().equals(key)) {
                arr[pos++] = items[i];
            }
        }
        return Arrays.copyOf(arr, pos);
    }

    public Item findById(String id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                Item item = new Item(items[i].getName(), items[i].getDecs(), items[i].getTime());
                return item;
            }
        }
        return null;
    }

    private String generateId() {
        int r = new Random().nextInt();
        return String.valueOf(r);
    }
}
