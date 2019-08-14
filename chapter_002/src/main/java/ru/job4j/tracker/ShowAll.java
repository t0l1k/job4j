package ru.job4j.tracker;

import ru.job4j.start.Input;

public class ShowAll implements UserAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item item : tracker.getAll()) {
            System.out.println(item);
        }
    }

    @Override
    public String info() {
        return "1: Show all Items";
    }
}
