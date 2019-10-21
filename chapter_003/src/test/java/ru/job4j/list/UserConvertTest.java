package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void testConvertMap() {
        UserConvert uconv = new UserConvert();
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User(1, "Ivan", "Moskva"));
        users.add(new User(2, "Anton", "Riga"));
        users.add(new User(3, "Elena", "Kiev"));
        HashMap<Integer, User> got = uconv.process(users);
        HashMap<Integer, User> want = new HashMap<Integer, User>();
        want.put(1, users.get(0));
        want.put(2, users.get(1));
        want.put(3, users.get(2));
        assertThat(got, is(want));
    }
}
