import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: ");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();
   while (number < 0) {
    System.out.print("invalid, try again");
    number = console.nextInt();
   }
   System.out.print(Math.sqrt(number));
    }
    
}
