package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    ArrayList<int[]> list = new ArrayList<>();

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

    public void add(int[] list) {
        this.list.add(list);
    }

    public List<Integer> convert() {
        List<Integer> result = new ArrayList<>();
        for (int[] l : this.list) {
            for (int ll : l) {
                result.add(ll);
            }
        }
        return result;
    }
}