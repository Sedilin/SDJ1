public class TestScore
{
  private double score1, score2, score3, average;

  public TestScore(double score1, double score2, double score3)
  {
    this.score1 = score1;
    this.score2 = score2;
    this.score3 = score3;
  }

  public void average()
  {
   average = (score1 + score2 + score3)/3;
  }

  public String toString()
  {
    return "The average of those three scores is: " + average;
  }
}
