public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double taxTip = 0.20;

        int Person1 = 10;
        int Person2 = 12;
        int Person3 = 9;
        int Person4 = 8;
        int Person5 = 7;
        int Person6 = 15;
        int Person7 = 11;
        int Person8 = 30;

        System.out.println( Person1 * (1 + taxTip));
        System.out.println( Person2 * (1 + taxTip));
        System.out.println( Person3 * (1 + taxTip));
        System.out.println( Person4 * (1 + taxTip));
        System.out.println( Person5 * (1 + taxTip));
        System.out.println( Person6 * (1 + taxTip));
        System.out.println( Person7 * (1 + taxTip));
        System.out.println( Person8 * (1 + taxTip));


        /*This is wha everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
