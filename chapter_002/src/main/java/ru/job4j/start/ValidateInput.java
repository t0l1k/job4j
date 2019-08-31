package ru.job4j.start;

import java.util.ArrayList;

public class ValidateInput extends ConsoleInput {
    public int ask(String question, ArrayList<Integer> range) throws MenuOutException {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("enter valid data" + " " + range);
            } catch (NumberFormatException nfe) {
                System.out.println("enter valid data");
            }
        } while (invalid);
        return value;
    }
}
