package ru.job4j.start;

import ru.job4j.tracker.MenuTracker;
import ru.job4j.tracker.Tracker;

public class StartUi {
    private Tracker tracker;
    private Input input;
    private boolean running;

    public StartUi(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    public static void main(String[] args) {
        new StartUi(new ConsoleInput(), new Tracker()).init();
    }

    public void quit() {
        running = false;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions(this);
        running = true;
        do {
            menu.show();
            menu.select(Integer.valueOf(input.ask("select:")));
        } while (running);
    }
}