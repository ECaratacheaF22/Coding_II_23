

public class League {
    
    public static void main(String[] args){

        //Teams
        Team Green = new Team("Green", 0, 0, 0, 0, 0);

        System.out.println(Green.getName());
        Green.display();
        
        //Scheduler
        Scheduler Schedule = new Scheduler();

        Schedule.Temperature();
        System.out.println();


    }
}
