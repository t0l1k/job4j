package ru.job4j.tracker;

import ru.job4j.start.Input;

class EditItem extends BaseAction {
    public EditItem(int key, String name) {
        super(key, name);
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
}
