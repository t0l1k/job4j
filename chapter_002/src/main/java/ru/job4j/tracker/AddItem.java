package ru.job4j.tracker;

import ru.job4j.start.Input;

class AddItem extends BaseAction {
    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String name = input.ask("Enter name:");
        String desc = input.ask("Enter Description:");
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        System.out.println("Added Item:" + item);
    }
}
