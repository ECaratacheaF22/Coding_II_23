//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        Cell6 Cell = new Cell6("a1",false,1234);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, Cell);
        bubba.display(true);
        Cell.setDoorOpen(1234);
    }
}
