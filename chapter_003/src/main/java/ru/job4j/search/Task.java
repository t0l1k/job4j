package ru.job4j.search;

public class Task {
    private int priority;
    private String desc;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("Task:Desc:%s,Priority:%d", desc, priority);
    }
}