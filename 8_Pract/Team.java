public class Team {
    //Feilds
    private String Name;
    private int Win;
    private int Loss;
    private int Tie;
    private int goalScore;
    private int goalAllow;

    //Constructor
    public Team(String Name, int Win, int Loss, int Tie, int goalScore, int goalAllow){
        this.Name = Name;
        this.Win = Win;
        this.Loss = Loss;
        this.Tie = Tie;
        this.goalScore = goalScore;
       }

       //Getters
    public String getName(){
        return Name;
    }
    public int getWin(){
        return Win;
    }
    public int getLoss(){
        return Loss;
    }
    public int getTie(){
        return Tie;
    }
    public int getScore(){
        return goalScore;
    }
    public int getAllow(){
        return goalAllow;
    }

    //Setters
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setWin(int Win) {
        this.Win = Win;
    }
    public void setLoss(int Loss) {
        this.Loss = Loss;
    }
    public void setName(int Tie) {
        this.Tie = Tie;
    }
    public void setGoalAllow(int getAllow) {
        this.goalAllow = getAllow;
    }
    public void setGoalScore(int goalScore) {
        this.goalScore = goalScore;
    }

    //Arrays
    public static void main(String[] args){
        int[] teams = {};
    }


    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("win: " +getWin() +" Wins");
        System.out.println("loss: " + getLoss() +" Losses");
        System.out.println("Ties: " + getTie());
        System.out.println("Score: " +getScore() +" goals");
        System.out.println("Allowed: " + getAllow() +" Allowed");
    }




}
