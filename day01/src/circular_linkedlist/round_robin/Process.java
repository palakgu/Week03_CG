package circular_linkedlist.round_robin;

class Process {
    int processID;
    int burstTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnAroundTime = 0;
        this.next = null;
    }
}
