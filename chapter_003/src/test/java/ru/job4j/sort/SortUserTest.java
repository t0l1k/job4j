package ru.job4j.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void sortByAge() {
        SortUser su = new SortUser();
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User("Ivan", 25));
        list.add(new User("Elena", 21));
        list.add(new User("Marina", 19));
        list.add(new User("Viktor", 34));
        TreeSet<User> got = (TreeSet<User>) su.sort(list);
        TreeSet<User> want = new TreeSet<>();
        want.add(new User("Marina", 19));
        want.add(new User("Elena", 21));
        want.add(new User("Ivan", 25));
        want.add(new User("Viktor", 34));
        assertThat(got, is(want));
    }
}
