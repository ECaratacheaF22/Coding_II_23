import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String color ;

System.out.println("enter a number from 380 to 750");

double num = sc.nextDouble();

if( num <= 449 & num >= 380){
    color = "violet";
} else if( num <= 494 & num >= 450){
    color = "blue";
} else if( num <= 569 & num >= 495){
    color = "green";
} else if( num <= 589 & num >= 570){
    color = "yellow";
} else if( num <= 619 & num >= 590){
    color = "orange";
} else if( num <= 750 & num >= 620){
    color = "red";
} else {
    color = "invalid";
}

System.out.println(color);

sc.close();

    }
}
