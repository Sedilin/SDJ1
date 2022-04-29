public class ChessBoard
{
  public static void main(String[] args)
  {
    double grain = 1;
    int square = 1;
    double totalOfGrains = 1;

    for(int i = 1; i < 64; i++)
    {
      System.out.println(square + " square has: " + grain + " amount of grains.");
      grain=grain*2;
      totalOfGrains = grain+totalOfGrains;
      square++;
    }
    System.out.println(square + " square has: " + grain + " amount of grains.");
    System.out.println("The total of grains is equal to: " + totalOfGrains);
  }
}
