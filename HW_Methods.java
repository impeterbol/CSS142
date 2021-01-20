//Peter Boldyrev // CSS 142 //1/18/2021 || HW: Methods (Mario boards)

import java.util.Scanner;
public class HW_Methods{
   public static void main(String[] args) {
       runProgramA();
       runProgramB();
    // end of main method   
    }

    //runProgramA
    public static void runProgramA(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~Mario Board 1 "
        +"~~~~~~~~~~~~~~~~~~~~~~~~");
        segment1();
        segment2();
        segment2();
        segment1();
        segment3();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~Mario Board 2 "
        +"~~~~~~~~~~~~~~~~~~~~~~~~");
        segment3();
        segment2();
        segment2();
        segment1();
        segment3();
        segment1();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~END OF LEVEL " 
        + "~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

    }

    //runProgramB
    public static void runProgramB(){
        String mario = marioMethod();
        String coin = coinMethod();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~Here is Your level ... "
        +"Look for Mario and coins!~~~~~~~~~~~~~~~~~~~~~~~~"); 
        System.out.println();
        segment3();
        segment2();
        segment5(mario);
        segment1();
        segment3();
        segment4(coin);

        
    }

    //method to draw the segment1
    public static void segment1(){
        System.out.println("||" + "\n" + "||" + "\n" + "||" + "\n" + "||"
         + "\n" + "||" + "\n"+ "||" + "\n");
    }

    //method to draw the segment2
    public static void segment2(){
        System.out.println("||" + "\n" + "||   |?|" + "\n" + "||" + "\n" 
        + "||" + "\n" + "||   |?|" + "\n"+ "||" + "\n");
    }

    //method to draw the segment3
    public static void segment3(){
        System.out.println("||" + "\n" + "||||" + "\n" + "||||||" + "\n" 
        + "||||||||" + "\n" + "||||||||||" + "\n"+ "||||||||||||" + "\n"
        +"||" + "\n" +"||              ^" + "\n" +"|----------------");
    }

    //method to draw a segment4 placing coins
    public static void segment4(String coin){
        System.out.println("||" + "\n" + "||||" + "\n" + "||||||"+coin+ "\n" 
        + "||||||||" + "\n" + "||||||||||"+coin + "\n"+ "||||||||||||" + "\n"
        +"||" + "\n" +"||              ^" + "\n" +"|----------------");

        return;
    }

    //method to draw a segment5 placing Mario
    public static void segment5(String mario){
        System.out.println("||" + "\n" + "||   |?|" + "\n" + "||" + "\n" + "||" 
        +mario + "\n" + "||   |?|" + "\n"+ "||" + "\n");

        return;
    }
    //method to get Mario icon
    public static String marioMethod(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What does Mario look like? > ");
        String userMario = keyboard.next();

        return userMario;
    }
//method to get Coin icon
    public static String coinMethod(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What does a Coin look like? > ");
        String userCoin = keyboard.next();
        
        return userCoin;
    }
}