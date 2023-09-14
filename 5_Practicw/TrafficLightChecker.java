import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
      
        Scanner sc = new Scanner(System.in);
        String color ;
        
        System.out.println("enter a number from 1 to 3");

        int num = sc.nextInt();


        if( num == 1){
            color = "next light is green";
        } else if( num == 2){
            color = "next light is yellow";
        } else if( num == 3){
            color = "next light is red";
    } else {
        color = "Invalid";
    }

    System.out.println(color);

sc.close();

}

}
