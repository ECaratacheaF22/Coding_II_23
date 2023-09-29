//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell6 PrisonCell;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public Cell6 getPrisonCell() {
        return PrisonCell;
    }

    public void setPrisonCell(Cell6 prisonCell) {
        PrisonCell = prisonCell;
    }

    //Constructor
    public Prisoner(String name, double height, int sentence, Cell6 PrisonCell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.PrisonCell = PrisonCell;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell: " + PrisonCell);
    }

    
}
