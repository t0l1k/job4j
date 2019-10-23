package ru.job4j.sort;

import java.util.*;

public class SortUser {
    public Set<User> sort(List<User> list) {
        Set<User> users = new TreeSet<>();
        for (User us : list) {
            users.add(us);
        }
        return users;
    }

    public List<User> sortByAllFields(List<User> list) {
        Comparator<User> comp = new UserNameComparator().thenComparing(new UserAgeComparator());
        Collections.sort(list, comp);
        return list;
    }

    public List<User> sortNameLength(ArrayList<User> list) {
        Comparator<User> comp = new UserNameLenghtComparator();
        Collections.sort(list, comp);
        return list;
    }
}
