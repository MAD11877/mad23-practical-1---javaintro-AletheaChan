import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    // Prompt for integer
    //System.out.print("Input integer to multiply: ");
    int toMultiply=in.nextInt();
    // Multiplication of integer
    int multiplied=toMultiply*toMultiply;
    //System.out.println("The multiplied result is "+multiplied);
    System.out.println(multiplied);
  }
}
