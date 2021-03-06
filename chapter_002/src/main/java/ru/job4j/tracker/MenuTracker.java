package ru.job4j.tracker;

import ru.job4j.start.Input;
import ru.job4j.start.StartUi;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private StartUi startUi;
    private List<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public int getActionsLenght() {
        return this.actions.size();
    }

    public void fillActions(StartUi ui) {
        this.actions.add(new AddItem(0, "Add new item"));
        this.actions.add(new ShowAll(1, "Show all Items"));
        this.actions.add(new EditItem(2, "Edit Item"));
        this.actions.add(new DeleteItem(3, "Delete Item"));
        this.actions.add(new FindById(4, "Find Item by Id"));
        this.actions.add(new FindByName(5, "Find Item by Name"));
        this.actions.add(new Quit(6, "Exit tracker", ui));
    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    public ArrayList<Integer> getKeys() {
        ArrayList<Integer> keys = new ArrayList();
        for (UserAction action : this.actions) {
            keys.add(action.key());
        }
        return keys;
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}
