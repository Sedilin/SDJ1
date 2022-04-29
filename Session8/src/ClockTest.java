public class ClockTest
{
  public static void main(String[] args)
  {
    Clock clock1 = new Clock(19, 59, 59);
    Clock clock2 = new Clock(12, 56, 12);


    clock1.tic();
    clock2.tic();

    System.out.println(clock1.convertToSeconds());
    System.out.println(clock2.convertToSeconds());

    System.out.println();

    System.out.println(clock1.timeToClock(clock2));
    System.out.println(clock2.timeToClock(clock1));

    System.out.println();

    System.out.println(clock1.isBefore(clock2));

    System.out.println();

    System.out.println(clock1.timeInSecondsTo(clock2));
    System.out.println(clock2.timeInSecondsTo(clock1));

    System.out.println();

    clock1.setTimeFormat24(12);
    clock2.setTimeFormat24(24);

    System.out.println();

    System.out.println(clock1.isTimeFormat());
    System.out.println(clock2.isTimeFormat());

    System.out.println();

    System.out.println(clock1);
    System.out.println(clock2);

  }
}
