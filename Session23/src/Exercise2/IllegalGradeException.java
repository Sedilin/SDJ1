package Exercise2;

public class IllegalGradeException extends RuntimeException{
    public IllegalGradeException()
    {
        super("Wrong Grade!");
    }
}
