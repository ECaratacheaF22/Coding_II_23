import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String nameOfMonth ;

System.out.println("What month were you born in (number form) ?");

int month = in.nextInt();
switch (month) {
case 1:
nameOfMonth = "january";
break;
case 2:
nameOfMonth = "febuary";
break;
case 3:
nameOfMonth = "march";
break;
case 4:
nameOfMonth = "april";
break;
case 5:
nameOfMonth = "may";
break;
case 6:
nameOfMonth = "june";
break;
case 7:
nameOfMonth = "july";
break;
case 8:
nameOfMonth = "august";
break;
case 9:
nameOfMonth = "september";
break;
case 10:
nameOfMonth = "october";
break;
case 11:
nameOfMonth = "november";
break;
case 12:
nameOfMonth = "december";
break;
default:
nameOfMonth = "Invalid";
}//end

System.out.println(nameOfMonth);

in.close();

    }
}
