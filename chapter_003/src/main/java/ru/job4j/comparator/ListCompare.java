package ru.job4j.comparator;

public class ListCompare {
    public int compare(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        int i = 0;
        while (true) {
            if (Integer.compare(aArr[i], bArr[i]) == -1 || aArr.length - 1 == i && bArr.length - 1 > i) {
                return -1;
            } else if (Integer.compare(aArr[i], bArr[i]) == 1) {
                return 1;
            } else if (aArr.length == bArr.length && aArr.length - 1 == i) {
                break;
            }
            i++;
        }
        return 0;
    }
}
