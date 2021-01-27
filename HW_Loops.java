import java.util.*;

public class HW_Loops {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String userInput = firstAsk();
        // validCheck(userInput);
        
        if(validCheck(userInput)){
            System.out.println("Thank you for adding the following valid string: "+userInput.toUpperCase());
        }
        else{
            System.out.println("Seems that not all characters are G,A,T or C. Here is what you entered: "
            +userInput.toUpperCase()+". Please try again or enter exit to stop");
            String userInput2 = keyboard.next();
            if(userInput2.equals("exit")){
                System.out.println("Goodbye!");
            }
            else{
               firstAsk();
            }
        }

     
        //end of main method
    }

    //first ask
    public static String firstAsk(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a single DNA sequence."+
        " Allowed bases are adenine (A). guanine (G), cytosine (C), thymine (T)."+
        " Please enter A,C,G,T and press return  >");
        String userInput = keyboard.next();
        return userInput;
        //end first ask
    }


    //valid check
    public static boolean validCheck(String userInput){
        int counter=0;
        for(int i=0;i<userInput.toUpperCase().length();i++){
          if(userInput.toUpperCase().charAt(i)=='A' || 
          userInput.toUpperCase().charAt(i)=='C'  || 
          userInput.toUpperCase().charAt(i)=='G' || 
          userInput.toUpperCase().charAt(i)=='T' ){
            counter++;
          }
        }
        if(counter!=userInput.length()){
            return false;  
        }
        else{
            return true;
        }
        //end of valid check
    }


    
    
}
