import java.util.Scanner;

public class Scheduler {

    double Temp;

    public Scheduler(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is gameday's temperature");
        Temp = sc.nextInt();
        System.out.println(Temp);
        sc.close();
    }
}
