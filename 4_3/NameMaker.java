import java.util.*;;

public class NameMaker {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = sc.nextLine();
        System.out.println("What is your middle name");
        String middleName = sc.nextLine();
        System.out.println("What is your last name");
        String lastName = sc.nextLine();
        String fullName = firstName + middleName + lastName;
        System.out.println(fullName);
        sc.close();

        
    }
    
}
