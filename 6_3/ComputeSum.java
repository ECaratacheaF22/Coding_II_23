import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    System.out.println("Please enter 10 numbers");
    System.out.println("Enter 0 to exit");
    int number = sc.nextInt();
    for (int i = 10; i > 0; i--) {
        a = a += number; 
        number = sc.nextInt();
       }

    System.out.println(a);
    


    sc.close();
    }
}
