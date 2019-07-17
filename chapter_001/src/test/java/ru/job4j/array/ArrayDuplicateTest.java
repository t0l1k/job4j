package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] str = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] got = ad.remove(str);
        String[] want = new String[]{"Привет", "Мир", "Супер"};
        assertThat(want, is(got));
    }
}