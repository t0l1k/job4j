package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[len - 1];
                    len--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(arr, len);
    }
}
