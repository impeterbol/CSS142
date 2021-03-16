//Peter Boldyrev CSSSKL 142 // Lab 10
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args){
        overall();
        //end of main
    }

    public static void overall(){
        Deck testDeck = new Deck();
       System.out.println("TESTING SHUFFLE"); 
       System.out.println("FIRST ELEMENT BEFORE"); 
       System.out.println(testDeck.toString());

       System.out.println(" SHUFFLE"); 
       
       testDeck.shuffle();

       System.out.println("FIRST ELEMENT AFTER"); 
       System.out.println(testDeck.toString());

       Card [] player1 = testDeck.deal(13);
       Card [] player2 = testDeck.deal(13);
       Card [] player3 = testDeck.deal(13);
       Card [] player4 = testDeck.deal(13);
        //since I am using removeFromDeck method every card will be unique
       System.out.println(" PLAYER 1"); 

       for(int i=0;i<player1.length;i++){
           System.out.println(player1[i].toString());
       }

       System.out.println(" PLAYER 2"); 

       for(int i=0;i<player2.length;i++){
           System.out.println(player2[i].toString());
       }

       System.out.println(" PLAYER 3"); 

       for(int i=0;i<player3.length;i++){
           System.out.println(player3[i].toString());
       }

       System.out.println(" PLAYER 4"); 

       for(int i=0;i<player4.length;i++){
           System.out.println(player4[i].toString());
       }

        //end of overall
    }

    //end of class
}
