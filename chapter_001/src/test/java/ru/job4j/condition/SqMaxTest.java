package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2, 3);
        assertThat(result, is(4));
        assertThat(check.max(4, 2, 1, 3), is(4));
        assertThat(check.max(3, 1, 4, 2), is(4));
        assertThat(check.max(3, 1, 2, 4), is(4));
    }
}
