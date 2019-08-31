package ru.job4j.start;

import ru.job4j.tracker.MenuTracker;
import ru.job4j.tracker.Tracker;

import java.util.ArrayList;

public class StartUi {
    private Tracker tracker;
    private Input input;
    private boolean running;

    public StartUi(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    public static void main(String[] args) {
        new StartUi(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }

    public void quit() {
        running = false;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions(this);
        ArrayList<Integer> keys = menu.getKeys();
        running = true;
        do {
            menu.show();
            menu.select(Integer.valueOf(input.ask("select:", keys)));
        } while (running);
    }
}