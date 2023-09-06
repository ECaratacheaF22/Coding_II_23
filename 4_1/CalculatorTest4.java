public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();

        double total = 0;
        //Name your friends
        total += calc.findTotal(10, "tim");
        total += calc.findTotal(12, "jim");
        total += calc.findTotal(9,  "kim");
        total += calc.findTotal(8,  "jimothy");
        total += calc.findTotal(7,  "sim");
        total += calc.findTotal(15, "Alex");
        total += calc.findTotal(11, "timothy");
        total += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       System.out.println(total);
    } 
}
