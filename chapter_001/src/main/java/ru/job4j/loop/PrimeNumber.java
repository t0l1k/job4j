package ru.job4j.loop;

public class PrimeNumber {

    boolean isPrime(int n) {
        if (n > 1) {
            if (n == 2) return true;
            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
        return false;
    }

    public int calc(int finish) {
        int count = 0;
        for (int i = 1; i <= finish; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}