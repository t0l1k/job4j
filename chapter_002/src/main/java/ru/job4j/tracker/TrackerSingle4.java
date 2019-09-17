package ru.job4j.tracker;

public class TrackerSingle4 {
    private TrackerSingle4() {
    }

    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        public static final TrackerSingle4 INSTANCE = new TrackerSingle4();
    }
}
