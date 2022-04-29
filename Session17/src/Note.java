public class Note {
    private String message;
    private boolean highPriority;

    public Note(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public boolean isHighPriority()
    {
        if (highPriority)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public void setToHighPriority()
    {
        highPriority = true;
    }
    public void setToLowPriority()
    {
        highPriority = false;
    }

    public Note copy()
    {
        Note n = new Note (message);
        if (isHighPriority())
        {
          n.setToHighPriority();
        }
        return n;
    }

    public String toString()
    {
        return "Message: " + message + " || Priority: " + highPriority;
    }
}
