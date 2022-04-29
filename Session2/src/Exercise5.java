import java.util.Scanner;

public class Exercise5
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name: ");
    String name = scanner.nextLine();
    System.out.println("Your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Name of your city: ");
    String city = scanner.nextLine();
    System.out.println("Name of the collage: ");
    String collage = scanner.nextLine();
    System.out.println("Your profession: ");
    String profession = scanner.nextLine();
    System.out.println("Your type of animal: ");
    String animal = scanner.nextLine();
    System.out.println("What is your pets name: ");
    String animalName = scanner.nextLine();

    System.out.println("There once was a person named " + name + " who lived in " +
        city + ". At the age of " + age + ",\n" + name + " went to collage at " + collage + ". " +
        name + " graduated and went to work as a\n" + profession + ". Then, " + name + " adopted a(n) " +
        animal + " named " + animalName + ". They both lived\n" + "happily ever after!");
  }
}
