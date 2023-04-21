import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    // Prompt for integer
    System.out.print("Input integer to multiply: ");
    int toMultiply=in.nextInt();
    // Multiplication of integer
    System.out.println("The multiplied result is "+(toMultiply*toMultiply));
  }
}
