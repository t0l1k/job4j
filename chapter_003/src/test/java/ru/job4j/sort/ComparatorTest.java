package ru.job4j.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ComparatorTest {
    @Test
    public void sortByNameLenght() {
        SortUser su = new SortUser();
        ArrayList<User> list = new ArrayList<User>();
        User u1 = new User("Алексей", 25);
        User u2 = new User("Александр", 30);
        User u3 = new User("Сергей", 20);
        User u4 = new User("Иван", 25);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        List<User> got = su.sortNameLength(list);
        List<User> want = new ArrayList<User>();
        want.add(u4);
        want.add(u3);
        want.add(u1);
        want.add(u2);
        assertThat(got, is(want));
    }

    @Test
    public void sortByNameAndAge() {
        SortUser su = new SortUser();
        ArrayList<User> list = new ArrayList<User>();
        User u1 = new User("Сергей", 25);
        User u2 = new User("Иван", 30);
        User u3 = new User("Сергей", 20);
        User u4 = new User("Иван", 25);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        List<User> got = su.sortByAllFields(list);
        List<User> want = new ArrayList<User>();
        want.add(u4);
        want.add(u2);
        want.add(u3);
        want.add(u1);
        assertThat(got, is(want));
    }
}
