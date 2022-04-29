package Exercise3;

public class IllegalDateException extends RuntimeException {
    public IllegalDateException(String msg)
    {
        super("Wrong date " + msg);
    }
}
