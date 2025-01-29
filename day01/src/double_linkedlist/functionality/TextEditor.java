package double_linkedlist.functionality;

class TextEditor {
    TextState head;
    TextState tail;
    TextState current;
    int size;
    final int MAX_SIZE = 10;

    // Add a new text state at the end of the list
    public void addTextState(String content) {
        TextState newState = new TextState(content);
        if (current == null) {
            head = tail = current = newState;
        } else {
            current.next = newState;
            newState.prev = current;
            current = newState;
            tail = newState;
        }
        size++;
        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Implement undo functionality (revert to the previous state)
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // Implement redo functionality (revert back to the next state after undo)
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current state: " + current.content);
        } else {
            System.out.println("No content available.");
        }
    }
}
