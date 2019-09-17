package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

public class TrackerSingleTest {

    @Test
    public void whenCreateSecondInstanceHasOneInstanceVar1() {
        TrackerSingle1 first = TrackerSingle1.INSTANCE;
        TrackerSingle1 second = TrackerSingle1.INSTANCE;
        Assert.assertTrue(first.INSTANCE == second.INSTANCE);
    }

    @Test
    public void whenCreateSecondInstanceHasOneInstanceVar2() {
        TrackerSingle2 first = TrackerSingle2.getInstance();
        TrackerSingle2 second = TrackerSingle2.getInstance();
        Assert.assertTrue(first.getInstance() == second.getInstance());
    }

    @Test
    public void whenCreateSecondInstanceHasOneInstanceVar3() {
        TrackerSingle3 first = TrackerSingle3.getInstance();
        TrackerSingle3 second = TrackerSingle3.getInstance();
        Assert.assertTrue(first.getInstance() == second.getInstance());
    }

    @Test
    public void whenCreateSecondInstanceHasOneInstanceVar4() {
        TrackerSingle4 first = TrackerSingle4.getInstance();
        TrackerSingle4 second = TrackerSingle4.getInstance();
        Assert.assertTrue(first.getInstance() == second.getInstance());
    }
}
