package singl_linkedlist.student_record;

public class StudentManager {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Adding students
        list.addAtBeginning(1, "Alice", 20, "A");
        list.addAtEnd(2, "Bob", 21, "B");
        list.addAtPosition(1, 3, "Charlie", 22, "C");

        // Display all students
        list.displayAllStudents();

        // Search for a student
        Student student = list.searchByRollNumber(2);
        if (student != null) {
            System.out.println("Found Student: " + student.name);
        } else {
            System.out.println("Student not found");
        }

        // Update student grade
        list.updateGradeByRollNumber(2, "A+");

        // Delete a student
        list.deleteByRollNumber(1);

        // Display all students again
        list.displayAllStudents();
    }
}
