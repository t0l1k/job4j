package ru.job4j.tracker;

import ru.job4j.start.Input;

public class Quit implements UserAction {
    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.exit(0);
    }

    @Override
    public String info() {
        return "6: Exit tracker";
    }
}
