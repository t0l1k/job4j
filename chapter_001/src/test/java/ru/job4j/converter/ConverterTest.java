package ru.job4j.converter;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConverterTest {
    @Test
    public void testConvertEurToRur() {
        assertEquals(new Converter().convertEurToRur(2), 140, 0.1);
    }

    @Test
    public void testConvertUsdToRur() {
        assertEquals(new Converter().convertUsdToRur(2), 120, 0.1);
    }

    @Test
    public void testConvertRurToEur() {
        assertEquals(new Converter().convertRurToEur(140), 2, 0.1);
    }

    @Test
    public void testConvertRurToUsd() {
        assertEquals(new Converter().convertRurToUsd(120), 2, 0.1);
    }
}
