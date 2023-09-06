public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        final double MON =100;
        final double TUE =121;
        final double WED =117;
        double dailyAverage = (MON + TUE + WED)/3;
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;


        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
