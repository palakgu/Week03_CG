package circular_linkedlist.task_schedular;

public class TaskSchedulerDemo {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskAtBeginning(new Task(1, "Task 1", 1, "2025-01-30"));
        scheduler.addTaskAtEnd(new Task(2, "Task 2", 2, "2025-02-05"));
        scheduler.addTaskAtPosition(new Task(3, "Task 3", 1, "2025-02-01"), 2);

        scheduler.displayAllTasks();

        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        scheduler.searchTaskByPriority(1);

        scheduler.removeTask(2);
        scheduler.displayAllTasks();
    }
}
