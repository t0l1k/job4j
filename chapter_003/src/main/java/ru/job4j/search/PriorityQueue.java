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
        int index = 0;
        switch (task.getPriority()) {
            case 1:
                index = 0;
                break;
            case 3:
                index = 1;
                break;
            case 5:
                index = 5;
                break;
        }
        if (tasks.size() > index) {
            tasks.add(index, task);
        } else {
            tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
