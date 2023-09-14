import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int var = sc.nextInt();
        for (int num = 0; num < 13; num++){
            System.out.println(var +" * "+ num +" = "+ (var * num));
        }

        System.out.println("done");
        sc.close();

        

        }

    }

