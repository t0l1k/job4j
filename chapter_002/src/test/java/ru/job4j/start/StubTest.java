package ru.job4j.start;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StubTest {
    Tracker tracker;

    @Before
    public void setup() {
        tracker = new Tracker();
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameNameAndShowItems() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1", "6"});
        new StartUi(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("test name"));
    }


    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUi(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("test name"));
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Item item = tracker.add(new Item("test name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUi(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteThenTrackerHasDeletedValue() {
        Item item = tracker.add(new Item("test name", "desc"));
        tracker.add(new Item("test name2", "desc2"));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUi(input, tracker).init();
        assertThat(tracker.getAll().length, is(1));
    }

    @Test
    public void whenFindByIdThenTrackerReturnItem() {
        Item item = tracker.add(new Item("test name", "desc"));
        tracker.add(new Item("test name2", "desc2"));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUi(input, tracker).init();
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }

    @Test
    public void whenFindByIdNullThenTrackerReturnNull() {
        Item item = tracker.add(new Item("test name", "desc"));
        tracker.add(new Item("test name2", "desc2"));
        Input input = new StubInput(new String[]{"4", "0", "6"});
        new StartUi(input, tracker).init();
        Item result = tracker.findById("0");
        Assert.assertNull(result);
    }

    @Test
    public void whenFindByNameThenTrackerReturnItemsWithSameName() {
        Item item = tracker.add(new Item("test name", "desc"));
        tracker.add(new Item("test name", "desc2"));
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        new StartUi(input, tracker).init();
        Item[] result = tracker.findByName(item.getName());
        assertThat(result[0].getName(), is(item.getName()));
    }
}
