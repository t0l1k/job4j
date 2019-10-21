package ru.job4j.list;

import java.util.ArrayList;
import java.util.HashMap;

public class UserConvert {
    public HashMap<Integer, User> process(ArrayList<User> users) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User u : users) {
            map.put(u.getId(), u);
        }
        return map;
    }
}
