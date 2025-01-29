package circular_linkedlist.round_robin;

class RoundRobinScheduler {
    Process head;
    Process tail;
    Process current;
    int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add a new process at the end of the circular list
    public void addProcess(Process process) {
        if (head == null) {
            head = tail = process;
            tail.next = head; // Circular link
        } else {
            tail.next = process;
            tail = process;
            tail.next = head; // Update circular link
        }
    }

    // Remove a process by Process ID after its execution
    public void removeProcess(int processID) {
        if (head == null) {
            return;
        }

        // Special case for removing the head process
        if (head.processID == processID) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // General case for removing any other process
        Process prev = head;
        Process curr = head.next;
        while (curr != head && curr.processID != processID) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.processID == processID) {
            prev.next = curr.next;
            if (curr == tail) {
                tail = prev;
            }
        }
    }

    // Simulate the scheduling of processes in a round-robin manner
    public void scheduleProcesses() {
        if (head == null) {
            return;
        }

        int currentTime = 0;
        current = head;

        while (true) {
            boolean allProcessed = true;
            Process start = current;

            do {
                allProcessed = allProcessed && current.burstTime <= 0;

                if (current.burstTime > 0) {
                    allProcessed = false;
                    int timeSpent = Math.min(current.burstTime, timeQuantum);
                    current.burstTime -= timeSpent;
                    currentTime += timeSpent;

                    if (current.burstTime == 0) {
                        current.turnAroundTime = currentTime;
                    }
                }

                current = current.next;
            } while (current != start);

            if (allProcessed) {
                break;
            }
        }
    }

    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            return;
        }

        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processID +
                    ", Burst Time: " + temp.burstTime +
                    ", Priority: " + temp.priority +
                    ", Waiting Time: " + temp.waitingTime +
                    ", Turn-Around Time: " + temp.turnAroundTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Calculate and display the average waiting time and turn-around time
    public void calculateAndDisplayAverageTimes() {
        if (head == null) {
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int count = 0;

        Process temp = head;
        do {
            totalWaitingTime += temp.waitingTime;
            totalTurnAroundTime += temp.turnAroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        double avgWaitingTime = (double) totalWaitingTime / count;
        double avgTurnAroundTime = (double) totalTurnAroundTime / count;

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }
}
