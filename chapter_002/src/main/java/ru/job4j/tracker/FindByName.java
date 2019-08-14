package ru.job4j.tracker;

import ru.job4j.start.Input;

public class FindByName implements UserAction {
    @Override
    public int key() {
        return 5;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Enter item name what to find:");
        Item[] arr = tracker.findByName(name);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Found:" + arr[i]);
        }
    }

    @Override
    public String info() {
        return "5: Find Item by Name";
    }
}
