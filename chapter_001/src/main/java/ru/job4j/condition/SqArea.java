package ru.job4j.condition;

public class SqArea {
    static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }

    public static void main(String[] args) {
        int result1;
//        int result1 = square(4, 1);
//        System.out.printf(" p=4, k=1, s=1, real=%d\n", result1);
        result1 = square(6, 2);
        System.out.printf(" p=6, k=2, s=2, real=%d", result1);
    }
}
