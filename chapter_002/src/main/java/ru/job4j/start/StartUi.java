package ru.job4j.start;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class StartUi {
    private final static String ADD = "0";
    private final static String SHOW = "1";
    private final static String EDIT = "2";
    private final static String DELETE = "3";
    private final static String FIND_BY_ID = "4";
    private final static String FIND_BY_NAME = "5";
    private final static String EXIT = "6";
    private final Input input;
    private final Tracker tracker;
    private boolean running;

    public StartUi(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public static void main(String[] args) {
        new StartUi(new ConsoleInput(), new Tracker()).init();
    }

    public void init() {
        running = true;
        while (running) {
            switch (input.ask(showMainMenu())) {
                case ADD:
                    add();
                    break;
                case SHOW:
                    show();
                    break;
                case EDIT:
                    edit();
                    break;
                case DELETE:
                    delete();
                    break;
                case FIND_BY_ID:
                    findById();
                    break;
                case FIND_BY_NAME:
                    findByName();
                    break;
                case EXIT:
                    running = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Quit...");
    }

    private void findByName() {
        String name = input.ask("Enter item name what to find:");
        Item[] arr = tracker.findByName(name);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private void findById() {
        String id = input.ask("Enter item ID what to find:");
        System.out.println(tracker.findById(id) + "," + id);
    }

    private void delete() {
        String id = input.ask("Enter item id to delete:");
        tracker.delete(tracker.findById(id).getId());
    }

    private void edit() {
        String id = input.ask("Enter item id:");
        String name = input.ask("Enter item name:");
        String desc = input.ask("Enter item description:");
        Item item = new Item(name, desc);
        System.out.println("id:" + id + " name:" + name + " desc:" + desc + " item:" + item);
        tracker.replace(id, item);
    }

    private void show() {
        for (int i = 0; i < tracker.getAll().length; i++) {
            System.out.println(tracker.getAll()[i]);
        }
    }

    private void add() {
        String name = input.ask("Enter name:");
        String desc = input.ask("Enter Description:");
        tracker.add(new Item(name, desc, System.currentTimeMillis()));
    }

    private String showMainMenu() {
        StringBuilder str = new StringBuilder();
        str.append("\n0. Add new item\n");
        str.append("1. Show all items\n");
        str.append("2. Edit item\n");
        str.append("3. Delete item\n");
        str.append("4. Find item by id\n");
        str.append("5. Find item by name\n");
        str.append("6. Exit\n");
        str.append("Select:");
        return str.toString();
    }
}
