import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 5660;
        System.out.println("Enter your pin");
        int input = sc.nextInt();
        while (input != pin ){
            System.out.println("Invalid, try again");
            input = sc.nextInt();
        }

        System.out.println(input + " is valid");
        sc.close();
    }
}
