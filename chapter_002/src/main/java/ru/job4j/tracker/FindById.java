package ru.job4j.tracker;

import ru.job4j.start.Input;

class FindById extends BaseAction {
    public FindById(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        Item result = tracker.findById(input.ask("Enter item ID what to find:"));
        if (result != null) {
            System.out.println("Found:" + result);
        } else {
            System.out.println("Item with this id not found");
        }
    }
}
