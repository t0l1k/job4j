package ru.job4j.array;

public class FindLoop {
    public static void main(String[] args) {
        FindLoop f = new FindLoop();
        int[] input = new int[]{3, 4, 1, 2, 5};
        f.sort(input);
    }

    public int indexOf(int[] data, int el) {
        return this.indexOf(data, el, 0, data.length);
    }

    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public int[] sort(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                }
            }
            int idx = indexOf(data, min, i, data.length);
            this.swap(data, i, idx);
            min = Integer.MAX_VALUE;
        }
        return data;
    }

    private int[] swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return arr;
    }
}