import java.util.*;;

public class aPracticeProblem1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String firstName;
        String lastName;
        String fullName;
        int spaceIdx;

        System.out.println("What is your name");
        String fullName = sc.nextLine();
        spaceIdx = fullName.indexOf(" ");
        firstName = fullName.substring(0, 2);

        //spaceIdx = fullName.indexOf(" ");


        System.out.println(firstName);
        sc.close();

        //spaceIdx = custName.indexOf(" ");
        //firstName = custName.substring(0, spaceIdx);
        //System.out.println(firstName);
    }
}