public class Golf {
    public static void main(String[] args) {
        //a
        int array[] = {3, 5, 1, 3, 3, 2, 4, 2, 3};
        //b
        int total = 0;
        int holeInOne = 0;
        double average;

        for (int i = 0; i < array.length; i++)
        {
            total += array[i];
            if (array[i] == 1)
            {
                holeInOne++;
            }
        }
        //c
        average = (double)total/ array.length;

        System.out.println("The total number of hits: " + total);
        System.out.println("The average of hits: " + average);
        System.out.println("The number of Hole-In-Ones: " + holeInOne);

    }
}
