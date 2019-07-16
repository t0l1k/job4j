package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        double sum = amount;
        while (sum > 0) {
            sum = amount * (percent / 100) + amount;
            for (int i = 0; i < 12; i++) {
                sum -= monthly;
                if (sum <= 0) {
                    break;
                }
                amount = (int)sum;
            }
            year++;
        }
        return year;
    }
}