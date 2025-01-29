package double_linkedlist.library_mgmt;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBookAtBeginning(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1, true));
        library.addBookAtEnd(new Book("1984", "George Orwell", "Dystopian", 2, true));
        library.addBookAtPosition(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 3, false), 2);

        library.displayBooksForward();
        library.displayBooksReverse();
        library.searchBook("1984");
        library.updateBookStatus(2, false);
        library.removeBook(3);
        library.displayBooksForward();
        System.out.println("Total books: " + library.countBooks());
    }
}
