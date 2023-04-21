import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    // Prompt for user to input height & weight
    //System.out.print("Input your height(m): ");
    double height = in.nextDouble();
    //System.out.print("Input your weight(kg): ");
    int weight=in.nextInt();

    // Calculation of BMI
    double bmi=weight/(height*height);
    //System.out.println("Your BMI is "+bmi);
    System.out.println(bmi);
  }
}
