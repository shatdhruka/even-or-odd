# even-or-odd
import java.util.Scanner;
public class OddOrEven
{
   public static void main(String args[])
   {
      int z;
     
      Scanner in = new Scanner(System.in);
      z = in.nextInt();
      if ( z % 2 == 0 )
         System.out.println("Even");
      else
         System.out.println("Odd");
   }
}
