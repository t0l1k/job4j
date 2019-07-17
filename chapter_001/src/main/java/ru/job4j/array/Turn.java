package ru.job4j.array;

public class Turn {

    public int[] back(int[] input) {
        for (int i = 0; i < input.length / 2; i++) {
            int tmp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = tmp;
        }
        return input;
    }
}
