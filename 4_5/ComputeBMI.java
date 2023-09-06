
import java.util.Scanner;


public class ComputeBMI {

public static void main(String[] args){
    
    Scanner numberScanner = new Scanner(System.in);
    
    System.out.print("Enter Your Weight: ");
    double userW = numberScanner.nextDouble();
    
    System.out.print("Enter Your Height: ");
    double userH = numberScanner.nextDouble();

    double BMI = (userW/(userH * userH)) * 703 ;
    System.out.println("Your BMI is " + Math.round(BMI));


    numberScanner.close();
        
    }
}
