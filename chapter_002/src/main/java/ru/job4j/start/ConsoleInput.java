package ru.job4j.start;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput implements Input {
    Scanner reader = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.print(question);
        return reader.nextLine();
    }

    @Override
    public int ask(String question, ArrayList<Integer> range) throws MenuOutException {
        int key = Integer.valueOf(ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("out of menu range");
        }
        return key;
    }

    public void close() {
        reader.close();
    }
}
