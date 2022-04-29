package Exercise3;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(13, 4, 2000);
        try{
            myDate1.setMonth(13);
            myDate1.setYear(-200);
            myDate1.setDay(19);
        }
        catch (IllegalDateException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(myDate1);


    }
}
