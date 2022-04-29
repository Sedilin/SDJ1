public class NotebookTest {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(3);
        Note note1 = new Note("Shopping List");

        notebook.addNote(note1);
        note1.setMessage("Homework");
        notebook.addNote(note1);
        note1.setToHighPriority();
        note1.setMessage("Dear Diaray");
        notebook.addNote(note1);

        Note[] note2;

        note2=notebook.getAllNotes();

        for (int i = 0; i < note2.length; i++)
        {
            System.out.println(note2[i]);
        }

    }
}
