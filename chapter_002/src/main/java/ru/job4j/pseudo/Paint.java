package ru.job4j.pseudo;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }


    public static void main(String[] args) {
        Triangle t = new Triangle();
        Square s = new Square();
        Paint p = new Paint();
        p.draw(t);
        p.draw(s);
    }
}