package ru.job4j.comparator;

public class ListCompare {
    public int compare(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }
}
