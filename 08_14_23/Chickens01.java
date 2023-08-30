public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        //Monday
        int chickenCount = 3;
        int totalEggs = 0;
        int eggsPerChicken = 5;
        totalEggs = chickenCount * eggsPerChicken;

        //Tuesday
        totalEggs += ++chickenCount * eggsPerChicken;

        //Wednesday
        totalEggs += chickenCount/ 2 * eggsPerChicken;
        

        System.out.println(totalEggs);
        System.out.println(chickenCount);
    }   
}
