

public class AccountTest {
    
    public static void main(String[] args){
        CheckingAccount account = new CheckingAccount();
        SavingsBond bond = new SavingsBond();
        account.Balance = 1000;
        account.Name = "bob";

        bond.Savings(22,1234.5);


    }
}
