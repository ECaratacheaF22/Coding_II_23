

public class SavingsBond {
    public int term;
    public double interestRate;
    public double purchasePrice;
    public double totalAmount;
    public void Savings(int userTerm,double price){
        term = userTerm;
        purchasePrice = price;
        if (0 <= term && term <= 11){
            interestRate = 0.005;
    } else if ( 12 <= term && term <= 23){
            interestRate = 0.010;
    } else if ( 24 <= term && term <= 35){
            interestRate = 0.015;
    }  else if ( 36 <= term && term <= 47){
             interestRate = 0.020;
    } else if ( 48 <= term && term <= 60){
             interestRate = 0.025;
    } else {
        System.out.println("Interest Rate Ceiling reached");
    }
    totalAmount = (purchasePrice * (1 + interestRate));
    System.out.println(totalAmount);
    System.out.println(interestRate);
    System.out.println(purchasePrice);
    System.out.println(term);
} 
}