package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPoint {
    @Test
    public void whenZeroAndTenThenTen() {
        Point p = new Point();
        double result = p.distance(0, 0, 0, 10);
        assertEquals(result, 10, 0.1);
    }
}
