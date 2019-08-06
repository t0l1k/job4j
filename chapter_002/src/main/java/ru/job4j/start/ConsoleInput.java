package ru.job4j.start;

import java.util.Scanner;

public class ConsoleInput implements Input {
    Scanner reader = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.print(question);
        return reader.nextLine();
    }

    public void close() {
        reader.close();
    }

}
