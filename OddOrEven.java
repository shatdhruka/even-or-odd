import java.util.Scanner;
public class OddOrEven
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int z = in.nextInt();
      if ( z % 2 == 0 )
         System.out.println("Even");
      else if (z%3==0)
         System.out.println("Odd");
      else
         System.out.println("invalid");
   }
}
