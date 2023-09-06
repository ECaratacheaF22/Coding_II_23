import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        int price = sc.nextInt();
        System.out.print("Enter the movie rating \n");    
        int rating = sc.nextInt();
        if(price >= 12 && rating == 5){
            System.out.print("I am interested in watching the movie");
        }
        else {
            System.out.print("i am not interested in watching the movie");
        }
        sc.close();

    }
}
