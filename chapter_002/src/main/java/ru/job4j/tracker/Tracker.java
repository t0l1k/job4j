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
        for (int i = 0; i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                item.setId(findById(id).getId());
                this.items[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (int i = 0; i < position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = null;
                System.arraycopy(items, i + 1, items, i, position);
                position--;
                return true;
            }
        }
        return false;
    }

    public Item[] getAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] arr = new Item[position];
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
                return items[i];
            }
        }
        return null;
    }

    private String generateId() {
        int r = new Random().nextInt();
        return String.valueOf(r);
    }
}
