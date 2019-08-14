package ru.job4j.tracker;

import ru.job4j.start.Input;

public interface UserAction {
    int key();

    void execute(Input input, Tracker tracker);

    String info();
}
