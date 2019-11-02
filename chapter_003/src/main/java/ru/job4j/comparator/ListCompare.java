package ru.job4j.comparator;

public class ListCompare {
    public int compare(String a, String b) {
        int lowLenght = (a.length() > b.length() ? b.length() : a.length());
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        for (int i = 0; i < lowLenght; i++) {
            int cmp = Integer.compare(aArr[i], bArr[i]);
            if (cmp == -1) {
                return -1;
            } else if (cmp == 1) {
                return 1;
            }
        }
        if (lowLenght == a.length() && lowLenght < b.length()) {
            return -1;
        }
        return 0;
    }
}
