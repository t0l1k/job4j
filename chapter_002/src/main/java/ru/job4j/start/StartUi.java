package ru.job4j.start;

import ru.job4j.tracker.MenuTracker;
import ru.job4j.tracker.Tracker;

public class StartUi {
    private Tracker tracker;
    private Input input;

    public StartUi(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    public static void main(String[] args) {
        new StartUi(new ConsoleInput(), new Tracker()).init();
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(Integer.valueOf(input.ask("select:")));
        } while (!"y".equals(this.input.ask("Exit?(y):")));
    }
}