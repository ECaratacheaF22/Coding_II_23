import java.util.Scanner;

public class Month {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nameOfMonth ;

System.out.println("What month (number form) ?");

int month = sc.nextInt();
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

System.out.println("Leap year (1 if yes, 2 in no)?");
int Leap = sc.nextInt();

System.out.println("What Year?");
int year = sc.nextInt();


if(nameOfMonth == "january"){
    System.out.println(nameOfMonth+" " + year + " has 31 days");
} else if(nameOfMonth == "march"){
    System.out.println(nameOfMonth+" " + year + " has 31 days");
} else if(nameOfMonth == "may"){
    System.out.println(nameOfMonth+" " + year + " has 31 days");
} else if(nameOfMonth == "july"){
    System.out.println(nameOfMonth+" " + year + " has 31 days");
} else if(nameOfMonth == "august"){
    System.out.println(nameOfMonth+" " + year + " has 31 days");
} else if(nameOfMonth == "october"){
    System.out.println(nameOfMonth+" " + year + " has 31 days");
} else if(nameOfMonth == "december"){
    System.out.println(nameOfMonth+" " + year + " has 31 days");
} else if(nameOfMonth == "april"){
    System.out.println(nameOfMonth+" " + year + " has 30 days");
} else if(nameOfMonth == "june"){
    System.out.println(nameOfMonth+" " + year + " has 30 days");
} else if(nameOfMonth == "september"){
    System.out.println(nameOfMonth+" " + year + " has 30 days");
} else if(nameOfMonth == "november"){
    System.out.println(nameOfMonth+" " + year + " has 30 days");
} else if(nameOfMonth == "febuary"){
    if( Leap == 1){
    System.out.println(nameOfMonth+" " + year + " has 29 days");
    } else if(Leap == 2){
    System.out.println(nameOfMonth+" " + year + " has 28 days");
    } else {
        System.out.println("Error");
    }
}




System.out.println(nameOfMonth);

sc.close();
}
}
