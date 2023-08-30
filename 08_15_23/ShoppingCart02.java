public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Capt'n";
        String itemDesc = "Fishin' Rods";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 40;
        double tax = 0.05;
        int quantity = 2;
        
        // Declare and assign a calculated totalPrice
        double totalPrice = (quantity * price) * (1 + tax);
        
        // Modify message to include quantity 
        message = custName+" wants to purchase " + quantity + " " + itemDesc;
        System.out.println(message);

        message = "Total cost with tax is " + totalPrice + "$";
        System.out.println(message);
        
        // Print another message with the total cost
        
    }    
}
