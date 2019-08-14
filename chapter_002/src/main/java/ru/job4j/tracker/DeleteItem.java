package ru.job4j.tracker;

import ru.job4j.start.Input;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return 3;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        if (tracker.delete(input.ask("Enter item id to delete:"))) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Item not found");
        }
    }

    @Override
    public String info() {
        return "3: Delete Item";
    }
}
