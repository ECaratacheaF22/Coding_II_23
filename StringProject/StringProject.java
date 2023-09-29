public class StringProject {

    
    private String myString;
   
    // JUST PRINTING IT OUT

    public StringProject (String str) {
        myString = str;
    }
    public String toString() {
        return myString;
    }

    //Reverse Case

    public String reverseCase(){
        String str = myString;
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                newString += Character.toLowerCase(str.charAt(i));
            } else if(Character.isLowerCase(str.charAt(i))){
                newString += Character.toUpperCase(str.charAt(i));
            } else{
                newString += str.charAt(i);
            }
        }
        return newString;
    } 


    public int characterCount(char str){
        
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == str){
                count++;
            }
        }
        return count;
    }


    public String reverseString(){
        String newString = "";
        for(int i = myString.length() - 1; i >= 0; i-- ){
            newString += myString.charAt(i)
        }
        return newString;
    }

    // eachword on the line
    // wordcount

    public int characterCount(){
        return myString.replaceAll(regex:" ", replacement:" ").lenght();
    }
    public double avgWordLength(){
        return characterCount() / (double) wordcount();
    }

    //public int vowelCount(){
    //    int count = 0
    //}

    //public int substrCount(String str){
      //  int count = 0;
        //int currentIdx = 0;
        //while (currentIdx != -1)

    public boolean isPalindrome(){
        String str = "";
        for (int i = 0; i < myString.length(); i++){
            if (Character.isLetter(myString.charAt(i))){
                str += Character.toLowerCase(characterCount();
            }
        }
    }
    }
}

