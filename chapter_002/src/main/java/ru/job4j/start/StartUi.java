package ru.job4j.start;

import ru.job4j.tracker.ConsoleInput;
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
    private final ConsoleInput input;
    private final Tracker tracker;
    private boolean running;

    public StartUi(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public static void main(String[] args) {
        new StartUi(new ConsoleInput(), new Tracker()).init();
    }

    private void init() {
        running = true;
        while (running) {
            showMainMenu();
            switch (input.ask()) {
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
        input.close();
        System.out.println("quit...");
    }

    private void findByName() {
        System.out.println("Show all name's");
        for (int i = 0; i < tracker.getAll().length; i++) {
            System.out.println(tracker.getAll()[i].getName());
        }
        System.out.print("Enter item name:");
        String name = input.ask();
        Item[] arr = tracker.findByName(name);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private void findById() {
        System.out.println("Show all id's");
        for (int i = 0; i < tracker.getAll().length; i++) {
            System.out.println(tracker.getAll()[i].getId());
        }
        System.out.print("Enter item ID:");
        String id = input.ask();
        System.out.println(tracker.findById(id) + "," + id);
    }

    private void delete() {
        System.out.println("Enter item name to delete:");
        System.out.println("nope...");

    }

    private void edit() {
        System.out.println("nope...");
//        System.out.print("Enter item name for edit:");
//        String name = input.ask();
//        System.out.println(tracker.findByName(name));
    }

    private void show() {
        for (int i = 0; i < tracker.getAll().length; i++) {
            System.out.println(tracker.getAll()[i]);
        }
    }

    private void add() {
        System.out.print("Enter name:");
        String name = input.ask();
        System.out.println();
        System.out.print("Enter Description:");
        String desc = input.ask();
        System.out.println();
        tracker.add(new Item(name, desc, System.currentTimeMillis()));
    }

    private void showMainMenu() {
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find item by name");
        System.out.println("6. Exit");
        System.out.print("Select:");
    }
}
