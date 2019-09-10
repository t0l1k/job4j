package ru.job4j.tracker;

import ru.job4j.start.Input;

class FindByName extends BaseAction {
    public FindByName(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Enter item name what to find:");
        Item[] arr = tracker.findByName(name);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Found:" + arr[i]);
        }
    }
}
