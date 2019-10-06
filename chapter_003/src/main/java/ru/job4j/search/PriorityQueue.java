package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        tasks.add(task);
        tasks.sort(new TaskPriorityComparator());
    }

    public Task take() {
        return this.tasks.poll();
    }

    private class TaskPriorityComparator implements java.util.Comparator<Task> {
        @Override
        public int compare(Task a, Task b) {
            int idx = 0;
            if (a.getPriority() > b.getPriority()) {
                idx = 1;
            } else if (a.getPriority() == b.getPriority()) {
                idx = 0;
            } else if (a.getPriority() < b.getPriority()) {
                idx = -1;
            }
            return idx;
        }
    }
}
