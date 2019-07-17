package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] input) {
        int n = 0;
        boolean valueMinor = input[0][0];
        boolean valueMajor = input[input.length - 1][0];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (i == n && j == n) {
                    if (input[i][j] != valueMinor || input[input.length - i - 1][j] != valueMajor) {
                        return false;
                    }
                }
            }
            n++;
        }
        return true;
    }
}
