

public class CheckingAccount {
    public double Balance;
    public double interestRate;
    public String Name;
    public double Withdrawl;

    public void displayCustomer(){
        System.out.println("Customer: " + Name);
        System.out.println("Balance: " + Balance);
        System.out.println("Rate; " + interestRate);
    }

    public void withdraw(){
        if(Balance <= 100){
            System.out.println("Balance to low! Cannot Withdraw");
        } else if(Withdrawl <= 0){
            System.out.println("Withdrawl amount invalid");
        } else {
            Balance -= Withdrawl;
            System.out.println("Your new balance is " + Balance);
        }
    }
}