import java.util.ArrayList;

public class Notebook {
    private int numberOfNotes;
    private ArrayList<Note> notes;

    public Notebook(int maxNumberOfNotes)
    {
        numberOfNotes = maxNumberOfNotes;
        notes = new ArrayList<Note>(maxNumberOfNotes);
    }

    public int getNumberOfNotes()
    {
        return numberOfNotes;
    }

    public Note getNote(int index)
    {
        return notes.get(index).copy();
    }

    public String getMessage(int index)
    {
        return notes.get(index).copy().getMessage();
    }
    public void addNote(Note note)
    {
        if (notes.size() < numberOfNotes)
        {
            notes.add(note.copy());
        }
    }
    public void addNote(String message)
    {
        if (notes.size()<numberOfNotes)
        {
            Note n = new Note(message);
            notes.add(n);
        }

    }

    public void addHighPriorityNote(String message)
    {
        if (notes.size() < numberOfNotes)
        {
            Note n = new Note(message);
            n.setToHighPriority();
            notes.add(n);
        }
    }
    public void removeNote(int index)
    {
        notes.remove(index);
    }

    public Note[] getAllNotes()
    {
        Note[] tempArray = new Note[notes.size()];
        Note[] newArray = notes.toArray(tempArray);
        return newArray;
    }

    public int getNumberOfHighPriorityNotes()
    {
        int numberOfHighPNotes = 0;
        for (int i = 0; i < notes.size(); i++)
        {
            if (notes.get(i) != null)
            {
                if (notes.get(i).isHighPriority())
                {
                    numberOfHighPNotes++;
                }
            }
        }
        return numberOfHighPNotes;
    }
    public Note[] getAllHighPriorityNotes()
    {
        int position = 0;
        Note[] n = new Note[getNumberOfHighPriorityNotes()];
        for (int i = 0; i < notes.size(); i++)
        {
            if (notes.get(i).isHighPriority())
            {
                position++;
                n[position] = notes.get(i).copy();
            }
        }
        return n;
    }

    public String toString()
    {
        String info = "";
        for (int i = 0; i < notes.size(); i++)
        {
            if (notes.get(i) != null)
            {
                info += "The " + (i+1) + " note: " + notes.get(i) + "\n";
            }
        }
        return info;
    }
}
