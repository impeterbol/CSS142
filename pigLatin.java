public class pigLatin {
    public static void main(String[] args){
    
        System.out.println(pigLatinized("Peter"));
    }
    public static String pigLatinized(String word){
        String userWord = word;
        String beginning = userWord.substring(0,2);
        String ending = userWord.substring(2,word.length());
        String newWord = ending+beginning+"ay";
        
        return newWord;
    
    }
}
