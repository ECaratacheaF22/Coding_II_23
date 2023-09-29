

public class Cards {
    private int cardBalance;
    private String cardName;
    private int cardTicket;



    public Cards(String cardName, int cardBalance, int cardTicket){
        this.cardName = cardName;
        this.cardBalance = cardBalance;
        this.cardTicket = cardTicket;

    }




    //Getters
    public String getName(){
        return cardName;
    }
    public int getBalance(){
        return cardBalance;
    }
    public int getTicket(){
        return cardTicket;
    }


    //Setters
    public void setName(String cardName) {
        this.cardName = cardName;
    }
    public void setBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }
    public void setTicket(int cardTicket) {
        this.cardTicket = cardTicket;
    }


        public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Balance: " +getBalance() +" Credits");
        System.out.println("Tickets: " + getTicket() +" Tickets");
    }
}
