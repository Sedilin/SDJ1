public class CopyArray {
    public static void main(String[] args) {
        int sourceArray[] = {2, 3, 4, 5};
        int destinationArray[] = new int[sourceArray.length * 2];

        for (int i = 0; i < sourceArray.length; i++)
        {
            destinationArray[i] = sourceArray[i];
        }
        for (int i = 0; i < destinationArray.length; i++)
        {
            System.out.println(destinationArray[i]);
        }
    }
}
