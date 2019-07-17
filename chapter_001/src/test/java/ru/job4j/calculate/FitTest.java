package ru.job4j.calculate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FitTest {

    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertEquals(weight, 92.0, 0.1);
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertEquals(weight, 69.0, 0.1);
    }
}