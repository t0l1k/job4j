package ru.job4j.tracker;

import ru.job4j.start.Input;

import java.util.List;

class FindByName extends BaseAction {
    public FindByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Enter item name what to find:");
        List<Item> arr = tracker.findByName(name);
        for (Item value : arr) {
            System.out.println("Found:" + value);
        }
    }
}
