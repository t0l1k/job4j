package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        Point p = new Point();
        double result = p.distance(0, 0, 0, 10);
        System.out.println(result);
    }

    double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
