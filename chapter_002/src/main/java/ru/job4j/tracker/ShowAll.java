package ru.job4j.tracker;

import ru.job4j.start.Input;

class ShowAll extends BaseAction {
    public ShowAll(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item item : tracker.getAll()) {
            System.out.println(item);
        }
    }
}
