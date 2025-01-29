package double_linkedlist.functionality;

public class TextEditorDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addTextState("Hello");
        editor.addTextState("Hello, World!");
        editor.addTextState("Hello, World! This is a test.");

        editor.displayCurrentState(); // Output: Hello, World! This is a test.

        editor.undo();
        editor.displayCurrentState(); // Output: Hello, World!

        editor.redo();
        editor.displayCurrentState(); // Output: Hello, World! This is a test.

        // Adding more states to test the fixed size limit
        for (int i = 1; i <= 8; i++) {
            editor.addTextState("State " + i);
        }

        editor.displayCurrentState(); // Output: State 8
    }
}
