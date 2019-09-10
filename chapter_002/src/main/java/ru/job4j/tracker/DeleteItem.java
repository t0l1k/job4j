package ru.job4j.tracker;

import ru.job4j.start.Input;

class DeleteItem extends BaseAction {
    public DeleteItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        if (tracker.delete(input.ask("Enter item id to delete:"))) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Item not found");
        }
    }
}
