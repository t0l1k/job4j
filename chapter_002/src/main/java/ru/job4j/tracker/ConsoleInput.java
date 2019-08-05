package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput {
    Scanner reader = new Scanner(System.in);

    public String ask() {
        return reader.next();
    }

    public void close() {
        reader.close();
    }
}
