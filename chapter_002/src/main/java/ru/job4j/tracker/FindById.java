package ru.job4j.tracker;

import ru.job4j.start.Input;

public class FindById implements UserAction {
    @Override
    public int key() {
        return 4;
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

    @Override
    public String info() {
        return "4: Find Item by Id";
    }
}
