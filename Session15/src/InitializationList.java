public class InitializationList {
    public static void main(String[] args) {
        int sourceArray[] = {3, 10, 12, 8};
        int destinationArray[] =  new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++)
        {
            destinationArray[i] = sourceArray[i];
        }

        for (int i = 0; i<sourceArray.length; i++)
        {
            System.out.print(destinationArray[i] + " ");
        }

    }
}
