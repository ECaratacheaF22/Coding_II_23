

public class Tester {
    
    public static void main(String[] args){
        Cards card1 = new Cards("1A", 10, 25);

        System.out.println(card1.getBalance());
        
        card1.display();
    }
}
