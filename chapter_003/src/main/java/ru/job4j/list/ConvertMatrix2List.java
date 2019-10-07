package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] input) {
        List<Integer> list = new ArrayList<>();
        for (int[] i : input) {
            for (int j : i) {
                list.add(j);
            }
        }
        return list;
    }

}
