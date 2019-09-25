package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result = new ArrayList<Person>();
        for (Person name : persons) {
            if (name.getName().contains(key) || name.getSurname().contains(key) || name.getPhone().contains(key) || name.getAdress().contains(key)) {
                result.add(name);
            }
        }
        return result;
    }
}
