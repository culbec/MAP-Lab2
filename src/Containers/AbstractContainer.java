package Containers;

import Tasks.Task;

public class AbstractContainer {
    protected Task[] tasks;
    protected int size;

    private static final int INIT_SIZE = 10;

    public AbstractContainer() {
        this.tasks = new Task[INIT_SIZE];
        this.size = 0;
    }

    protected void resize() {
        Task[] newTasks = new Task[this.size * 2];
        System.arraycopy(this.tasks, 0, newTasks, 0, this.size);
        this.tasks = newTasks;
    }
}
