public class Notebook {
    private int numberOfNotes;
    private Note[] notes;

    public Notebook(int maxNumberOfNotes)
    {
        notes = new Note[maxNumberOfNotes];
    }

    public int getNumberOfNotes()
    {
        return numberOfNotes;
    }

    public Note getNote(int index)
    {
        return notes[index].copy();
    }

    public String getMessage(int index)
    {
        return notes[index].copy().getMessage();
    }
    public void addNote(Note note)
    {
        for (int i = 0; i<notes.length; i++)
        {
            if (notes[i] == null)
            {
                notes[i] = note.copy();
                numberOfNotes++;
                break;
            }
        }
    }
    public void addNote(String message)
    {
        Note n = new Note(message);
        for (int i = 0; i<notes.length; i++)
        {
            if (notes[i] == null)
            {
                notes[i] = n.copy();
                numberOfNotes++;
                break;
            }
        }
    }

    public void addHighPriorityNote(String message)
    {
        for (int i = 0; i<notes.length; i++)
        {
            if (notes[i] == null)
            {
                Note n = new Note(message);
                n.setToHighPriority();
                notes[i] = n;
                numberOfNotes++;
                break;
            }
        }
    }
    public void removeNote(int index) // improved version of removeNote
    {
        for (int i = index; i < numberOfNotes; i++)
        {
            notes[i] = notes[i+1];
        }
        if (numberOfNotes > 0)
        {
            notes[numberOfNotes - 1] = null;
        }
        numberOfNotes--;
    }

    public Note[] getAllNotes()
    {
        return notes;
    }

    public int getNumberOfHighPriorityNotes()
    {
        int numberOfHighPNotes = 0;
        for (int i = 0; i < notes.length; i++)
        {
            if (notes[i] != null)
            {
                if (notes[i].isHighPriority())
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
        for (int i = 0; i < notes.length; i++)
        {
            if (notes[i].isHighPriority())
            {
                position++;
                n[position] = notes[i].copy();
            }
        }
        return n;
    }

    public String toString()
    {
        String info = "";
        for (int i = 0; i < notes.length; i++)
        {
            if (notes[i] != null)
            {
                info += "The " + (i+1) + " note: " + notes[i] + "\n";
            }
        }
        return info;
    }
}
