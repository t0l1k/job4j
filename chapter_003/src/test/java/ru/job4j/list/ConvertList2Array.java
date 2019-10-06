package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = rows;
        int[][] array = new int[rows][cells];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cells; j++) {
                if (i * rows + j < list.size()) {
                    array[i][j] = list.get(i * rows + j);
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}