package ru.job4j.condition;

public class Triangle {
    Point first;
    Point second;
    Point thirh;

    public Triangle(Point first, Point second, Point thirh) {
        this.first = first;
        this.second = second;
        this.thirh = thirh;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * Формула.
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полуперимента.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double c, double b) {
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * Формула.
     * √ p *(p - a) * (p - b) * (p - c)
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = second.distance(thirh);
        double c = first.distance(thirh);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}