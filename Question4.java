import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    // Prompt for integer
    //System.out.print("Input integer for base of triangle: ");
    int triBase=in.nextInt();
    for (int i=1; triBase>=i; i++)
    {
      for (int j=triBase; j>=i; j--)
      {
        //System.out.print("*");
      }
      System.out.println();
    }
  }
}