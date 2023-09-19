

public class PrisonTest {
    public static void main(String[] args){
        Prisoner bubba = new Prisoner();
        bubba.Name = "Bubba";
        bubba.Height = "6'10";
        bubba.Sentence = "4";

        Prisoner twitch = new Prisoner();
        twitch.Name = new String("Bubba");
        twitch.Height = "5'8";
        twitch.Sentence = "3";

        //Prisoner twitch = bubba; 
        System.out.println(bubba.Name == twitch.Name);

        

        
    }

    
}
