package ru.job4j.sort;

import java.util.Comparator;

public class User implements Comparable<User> {
    private String name;
    private Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        return age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return String.format("Name:%s, age:%d", name, age);
    }
}

class UserNameLenghtComparator implements Comparator<User> {

    @Override
    public int compare(User a, User b) {
        if (a.getName().length() > b.getName().length()) {
            return 1;
        } else if (a.getName().length() < b.getName().length()) {
            return -1;
        }
        return 0;
    }
}

class UserNameComparator implements Comparator<User> {

    @Override
    public int compare(User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}

class UserAgeComparator implements Comparator<User> {

    @Override
    public int compare(User a, User b) {
        if (a.getAge() > b.getAge()) {
            return 1;
        } else if (a.getAge() < b.getAge()) {
            return -1;
        }
        return 0;
    }
}