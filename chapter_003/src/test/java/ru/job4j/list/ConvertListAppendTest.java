package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConvertListAppendTest {
    @Test
    public void whenAdd2ListsThenConvertToOneList() {
        ConvertList2Array list = new ConvertList2Array();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> got = list.convert();
        List<Integer> want = new ArrayList<Integer>();
        want.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6}));
        assertThat(got, is(want));
    }
}
