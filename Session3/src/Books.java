public class Books
{
  private String author;
  private String title;
  private double price;
  private int pages;


  public Books()
  {
    author = "No one";
    title = "None";
    price = 10;
    pages = 20;
  }

  public Books (String author, String title, double price, int pages)
  {
    this.author = author;
    this.title = title;
    this.price = price;
    this.pages = pages;
  }

  public String getAuthor(){return author;}
  public String getTitle(){return title;}
  public double getPrice(){return price;}
  public int getPages(){return pages;}


  public void setPrice(double pr){
    price = pr;
  }

  public String toString(){
    return author + " " + title + " " + price + " " + pages;
  }

}
