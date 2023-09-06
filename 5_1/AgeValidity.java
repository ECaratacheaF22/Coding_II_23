import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("What is your age ");
                int age = sc.nextInt();
                Boolean drivingUnderAge = age <= 18;
                System.out.println(drivingUnderAge);
                sc.close();
        
                
            }
       
    }
