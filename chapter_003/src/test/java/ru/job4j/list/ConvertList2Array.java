package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = rows;
        int[][] array = new int[rows][cells];
        int idx = 0;
        for (Integer value : list) {
            array[idx / rows][idx % cells] = value;
            idx++;
        }
        return array;
    }
}