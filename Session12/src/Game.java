import java.util.Random;
import java.util.Scanner;

public class Game
{
  public static void main(String[] args)
  {
    Player player1 = new Player(50);
    Player player2 = new Player(50);
    Die dice = new Die(6);

    int points1;
    int points2;
    points1 = player1.getPoints();
    points2 = player2.getPoints();


    do
    {
      dice.roll();

      if (player1.getPoints() > dice.getValue())
      {
        points1 -= dice.getValue();
        player1.setPoints(points1);
      }
      else
      {
        points1 += dice.getValue();
        player1.setPoints(points1);
      }
      System.out.print(points1 + " ");

      dice.roll();

      if (player2.getPoints() > dice.getValue())
      {
        points2 -= dice.getValue();
        player2.setPoints(points2);
      }
      else
      {
        points2 += dice.getValue();
        player2.setPoints(points2);
      }
      System.out.println(points2);

      if(player1.getPoints() == 1 && player2.getPoints() == 1)
      {
        System.out.println("Draw");
        break;
      }
      else if (player1.getPoints() == 1)
      {
        System.out.println("Player 1 won!");
        break;
      }
      else if (player2.getPoints() == 1)
      {
        System.out.println("Player 2 won!");
        break;
      }
    } while (player1.getPoints() != 1 && player2.getPoints() != 1);

  }
}
