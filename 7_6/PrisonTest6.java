//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest6 {
    public static void main(String[] args){
        Cell6 cellA1 = new Cell6("A1", false, 1234);
        Cell6 cellB1 = new Cell6("B1", false, 1234);
        Cell6 cellC1 = new Cell6("C1", false, 1234);
        Cell6 cellD1 = new Cell6("D1", false, 1234);

        System.out.println(Prisoner6.getPrisonerCount());
        
        Prisoner6 bubba = new Prisoner6("Bubba", 2.08, 4, cellA1);
        Prisoner6 twitch = new Prisoner6("Twitch", 1.62, 3, cellB1);
        Prisoner6 hook = new Prisoner6("Hook", 1.78, 2, cellC1);
        Prisoner6 crayfish = new Prisoner6("Crayfish", 1.95, 5, cellD1);

        System.out.println(Prisoner6.getPrisonerCount());
        System.out.println(twitch.getHeight());
    }
}
