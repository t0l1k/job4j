package ru.job4j.tracker;

import ru.job4j.start.Input;

public class EditItem implements UserAction {
    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Enter item id:");
        String name = input.ask("Enter item name:");
        String desc = input.ask("Enter item description:");
        Item item = new Item(name, desc);
        if (tracker.replace(id, item)) {
            System.out.println("Item replace sucess.");
        } else {
            System.out.println("Item replace failed.");
        }
    }

    @Override
    public String info() {
        return "2: Edit Item";
    }
}
