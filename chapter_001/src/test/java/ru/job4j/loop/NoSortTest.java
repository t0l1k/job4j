/**
 * Объединить два массива [#124482]
 * Администратор,  24.03.19 13:12
 * <p>
 * Даны два отсортированных массива.
 * <p>
 * Вам нужно написать метод, который берет элементы этих массивов и добавляет в третий массив.
 * <p>
 * int[] merge(int[] left, int[] right)
 * <p>
 * Третий массив должен получится тоже отсортированный.
 * <p>
 * Например:
 * <p>
 * Массив 1                    int[] a = new int[] {1, 3};
 * <p>
 * Массив 2                    int[] b = new int[] {2, 4};
 * <p>
 * <p>
 * <p>
 * Массив результат, который появится после слияния.
 * <p>
 * int[] result = new int[] {1, 2, 3, 4};
 * <p>
 * В задаче нельзя использовать сортировку.
 */

package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class NoSortTest {

    @Test
    public void noSortTest2x2() {
        NoSort ns = new NoSort();
        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4};
        int[] got = ns.merge(arr1, arr2);
        int[] want = {1, 2, 3, 4};
        assertThat(got, is(want));
    }

    @Test
    public void noSortTest3x3() {
        NoSort ns = new NoSort();
        int[] arr1 = {1, 3, 8};
        int[] arr2 = {2, 4, 7};
        int[] got = ns.merge(arr1, arr2);
        int[] want = {1, 2, 3, 4, 7, 8};
        assertThat(got, is(want));
    }

    @Test
    public void noSortTest2x3() {
        NoSort ns = new NoSort();
        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4, 5};
        int[] got = ns.merge(arr1, arr2);
        int[] want = {1, 2, 3, 4, 5};
        assertThat(got, is(want));
    }

    @Test
    public void noSortTest2x3Again() {
        NoSort ns = new NoSort();
        int[] arr1 = {1, 5};
        int[] arr2 = {2, 3, 4};
        int[] got = ns.merge(arr1, arr2);
        int[] want = {1, 2, 3, 4, 5};
        assertThat(got, is(want));
    }
}
