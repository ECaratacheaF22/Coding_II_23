import java.util.Scanner;

public class Rectangle {
    double Width;
    double Lenght;
    
    

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side one");
        double Width = sc.nextDouble();
        System.out.println("Side Two");
        double Lenght = sc.nextDouble();
        System.out.println("Perimeter:" + ((Width * 2) + (Lenght * 2)));
        System.out.println("Area:" + (Width * Lenght));
        

        sc.close();
    }





}
