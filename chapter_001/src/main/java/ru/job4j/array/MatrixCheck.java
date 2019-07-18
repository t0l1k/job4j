package ru.job4j.array;

public class MatrixCheck {
    /**
     * mono Проверить все элементы по диагонали, равны ли первому элементы в углу.
     *
     * @param input
     * @return
     */
    public boolean mono(boolean[][] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i][i] != input[0][0] || input[input.length - i - 1][i] != input[input.length - 1][0]) {
                return false;
            }
        }
        return true;
    }
}
