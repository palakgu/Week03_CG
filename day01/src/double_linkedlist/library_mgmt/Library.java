package double_linkedlist.library_mgmt;

class Library {
    Book head;
    Book tail;

    // Add a new book at the beginning
    public void addBookAtBeginning(Book book) {
        if (head == null) {
            head = tail = book;
        } else {
            book.next = head;
            head.prev = book;
            head = book;
        }
    }

    // Add a new book at the end
    public void addBookAtEnd(Book book) {
        if (tail == null) {
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
    }

    // Add a new book at a specific position (1-based index)
    public void addBookAtPosition(Book book, int position) {
        if (position == 1) {
            addBookAtBeginning(book);
            return;
        }
        Book current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            addBookAtEnd(book);
        } else {
            book.next = current.next;
            book.prev = current;
            if (current.next != null) {
                current.next.prev = book;
            }
            current.next = book;
            if (book.next == null) {
                tail = book;
            }
        }
    }

    // Remove a book by Book ID
    public void removeBook(int bookID) {
        Book current = head;
        while (current != null && current.bookID != bookID) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Book not found.");
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        System.out.println("Book removed.");
    }

    // Search for a book by Book Title or Author
    public void searchBook(String keyword) {
        Book current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(keyword) || current.author.equalsIgnoreCase(keyword)) {
                System.out.println("Book found: " + current.title + " by " + current.author);
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found.");
    }

    // Update a book’s Availability Status
    public void updateBookStatus(int bookID, boolean isAvailable) {
        Book current = head;
        while (current != null && current.bookID != bookID) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Book not found.");
            return;
        }
        current.isAvailable = isAvailable;
        System.out.println("Availability status updated.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        Book current = head;
        while (current != null) {
            System.out.println(current.title + " by " + current.author + " - " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        Book current = tail;
        while (current != null) {
            System.out.println(current.title + " by " + current.author + " - " + (current.isAvailable ? "Available" : "Not Available"));
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public int countBooks() {
        int count = 0;
        Book current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
