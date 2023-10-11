public class ShoppingCartStuff {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);
        try {
        double divResult = calc.divide(15, 0);
        System.out.println("Division Result: " + divResult);

        
        } catch (Exception e){
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        }
        System.out.println("Still finished the program!");
    }
}
