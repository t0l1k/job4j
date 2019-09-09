package ru.job4j.start;

import java.util.ArrayList;

public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, ArrayList<Integer> range) throws MenuOutException {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println(moe.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println("enter valid data");
            }
        } while (invalid);
        return value;
    }
}
