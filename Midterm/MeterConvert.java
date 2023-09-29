import java.util.Scanner;

public class MeterConvert {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Inches");
        double Inches = sc.nextDouble();
        System.out.println(Inches +" Inch is "+(Inches * 0.0254) + " Meters");
    
        
        

        sc.close();
     }
}
