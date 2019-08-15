package ru.job4j.tracker;

import ru.job4j.start.Input;
import ru.job4j.start.StartUi;

public class Quit implements UserAction {
    private StartUi startUI;

    public Quit(StartUi startUI) {
        this.startUI = startUI;
    }

    @Override
    public int key() {
        return 6;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        startUI.quit();
    }

    @Override
    public String info() {
        return "6: Exit tracker";
    }
}
