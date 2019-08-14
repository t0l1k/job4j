package ru.job4j.tracker;

import ru.job4j.start.Input;

public class AddItem implements UserAction {
    @Override
    public int key() {
        return 0;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Enter name:");
        String desc = input.ask("Enter Description:");
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        System.out.println("Added Item:" + item);
    }

    @Override
    public String info() {
        return "0: Add new Item";
    }
}
