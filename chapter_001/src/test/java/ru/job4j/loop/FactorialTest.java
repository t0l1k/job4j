package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        assertEquals(120,new Factorial().calc(5));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        assertEquals(1,new Factorial().calc(0));
    }
}

