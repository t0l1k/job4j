package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
    }

    void info() {
        System.out.printf("Point[%s,%s]", this.x, this.y);
    }
}
