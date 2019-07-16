package ru.job4j.calculate;

public class Fit {
    double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        Fit f = new Fit();
        System.out.printf("man height 180 = %.2f",f.manWeight(180));
        System.out.printf("woman height 170 = %.2f",f.womanWeight(170));
    }
}
