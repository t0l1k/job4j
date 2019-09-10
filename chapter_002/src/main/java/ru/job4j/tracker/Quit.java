package ru.job4j.tracker;

import ru.job4j.start.Input;
import ru.job4j.start.StartUi;

class Quit extends BaseAction {
    private StartUi startUI;

    public Quit(int key, String name, StartUi startUI) {
        super(key, name);
        this.startUI = startUI;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        startUI.quit();
    }
}
