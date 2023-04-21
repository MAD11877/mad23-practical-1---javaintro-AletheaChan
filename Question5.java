import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    // Prompt for a number
    //System.out.print("Input a number: ");
    int numOfInt=in.nextInt();
    int[] arr = new int[numOfInt];

    for (int i=0; i<numOfInt; i++)
    {
      //System.out.print(">");
      int num=in.nextInt();
      // Update the array
      arr[i] = num;
    }

    // Finding the mode
    int maxValue = 0, mode = 0, i, j;
    for (i=0; i<numOfInt; ++i)
    {
      int count=0;
      for (j=0; j<numOfInt; ++j)
      {
        if (arr[j]==arr[i])
        ++count;
      }
      if (count>maxValue)
      {
        maxValue=count;
        mode=arr[i];
      }
    }
    System.out.println(mode);
  }
}
