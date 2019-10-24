package ru.job4j.comparator;

public class ListCompare {
    public int compare(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (Integer.compare((int) a.charAt(i), (int) b.charAt(i)) == -1) {
                return -1;
            } else if (Integer.compare((int) a.charAt(i), (int) b.charAt(i)) == 1) {
                return 1;
            }
        }
        if (a.length() < b.length()) {
            return -1;
        }
        return 0;
    }
}
