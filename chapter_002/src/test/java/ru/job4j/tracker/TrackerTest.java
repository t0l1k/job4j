package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewItemThenReplaceItemById() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        tracker.replace(tracker.findByName("test1")[0].getId(), new Item("test2", "testDescription2", created));
        Item result = tracker.findByName("test2")[0];
        assertThat(result.getName(), is("test2"));
    }

    @Test
    public void whenAddNewItemThenDeleteSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        tracker.delete(item.getId());
        assertThat(tracker.getAll().length, is(0));
    }

    @Test
    public void whenAdd4NewItemThenDeleteOneItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "test1Description", created);
        tracker.add(item);
        item = new Item("test2", "test2Description", created);
        tracker.add(item);
        item = new Item("test3", "test3Description", created);
        tracker.add(item);
        item = new Item("test4", "test4Description", created);
        tracker.add(item);
        tracker.delete(tracker.findByName("test2")[0].getId());
        assertThat(tracker.getAll().length, is(3));
    }
}