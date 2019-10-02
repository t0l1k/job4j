package ru.job4j.search;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        List<Person> persons = phones.find("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        List<Person> persons = phones.find("Arsentev");
        assertThat(persons.iterator().next().getName(), is("Petr"));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        List<Person> persons = phones.find("487");
        assertThat(persons.iterator().next().getName(), is("Petr"));
    }

    @Test
    public void whenFindByAdress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        List<Person> persons = phones.find("Bry");
        assertThat(persons.iterator().next().getName(), is("Petr"));
    }
}
