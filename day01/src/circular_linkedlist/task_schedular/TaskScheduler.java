package circular_linkedlist.task_schedular;

class TaskScheduler {
    Task head;
    Task tail;
    Task current;

    // Add a task at the beginning
    public void addTaskAtBeginning(Task task) {
        if (head == null) {
            head = tail = task;
            tail.next = head; // Circular link
        } else {
            task.next = head;
            head = task;
            tail.next = head; // Update circular link
        }
    }

    // Add a task at the end
    public void addTaskAtEnd(Task task) {
        if (tail == null) {
            head = tail = task;
            tail.next = head; // Circular link
        } else {
            tail.next = task;
            tail = task;
            tail.next = head; // Update circular link
        }
    }

    // Add a task at a specific position (1-based index)
    public void addTaskAtPosition(Task task, int position) {
        if (position == 1) {
            addTaskAtBeginning(task);
            return;
        }
        Task current = head;
        for (int i = 1; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }
        task.next = current.next;
        current.next = task;
        if (task.next == head) {
            tail = task;
        }
    }

    // Remove a task by Task ID
    public void removeTask(int taskID) {
        if (head == null) {
            System.out.println("Task not found.");
            return;
        }
        if (head.taskID == taskID) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Task current = head;
        while (current.next != head && current.next.taskID != taskID) {
            current = current.next;
        }
        if (current.next.taskID == taskID) {
            current.next = current.next.next;
            if (current.next == head) {
                tail = current;
            }
            System.out.println("Task removed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    // View the current task and move to the next task
    public void viewAndMoveToNextTask() {
        if (current == null) {
            current = head;
        } else {
            current = current.next;
        }
        if (current != null) {
            System.out.println("Current Task: " + current.taskName + " (Priority: " + current.priority + ", Due Date: " + current.dueDate + ")");
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks in the list starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task current = head;
        do {
            System.out.println(current.taskName + " (Priority: " + current.priority + ", Due Date: " + current.dueDate + ")");
            current = current.next;
        } while (current != head);
    }

    // Search for a task by Priority
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Found Task: " + current.taskName + " (Due Date: " + current.dueDate + ")");
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tasks with the given priority found.");
        }
    }
}

