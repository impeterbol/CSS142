//Peter Boldyrev, CSSSKL 142, Feb 17

import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args){

        //Section 2 
       
        //part 1
        //1
        capitalizeMethod("peter went for a walk");

        //2
        nameInitials("Peter Boldyrev");

        //3 (optional)
        letterCount("Peter is doing every homework!","e");
        //end of main

        //part2 
        //1

        lexLargest("I am the very model of a modern major general");


        //2
        largestBy("I am the very model of a modern major general");

        //3 (optional)
        largestByAction("It is great to do optional tasks", 2);

        //part3
        charsIndex();

        //end of main
    }

    

    //part 1
    //1)
    public static void capitalizeMethod(String newStr){
        String upperCasedStr ="";
        Scanner lineScanner = new Scanner(newStr);

        while(lineScanner.hasNext()){
            String word = lineScanner.next();
            upperCasedStr+=capitalizeFirstLetters(word);
        }
        lineScanner.close();
        System.out.println(upperCasedStr);
    }


    public static String capitalizeFirstLetters(String someString){
        
        String res = "";
        String firstChar = someString.substring(0,1).toUpperCase();
        String restOfString = someString.substring(1)+" ";
        res =firstChar+restOfString;
        return res;
    }
        
     //part 1
    //2) using the other way of solving similar to #1 task

    public static void nameInitials(String s){
        
        String res = "";
        String [] splitted = s.split(" ");
        for (int i=0; i<splitted.length;i++){
            res+=splitted[i].substring(0,1)+".";
            
        }
        System.out.println(res);
        
        
        //end of nameInitials
    }

    //part1
    //3) 
    public static void letterCount(String s, String matchedLetter){
        int counter = 0;
        String [] splitted = s.split("");
        for(int i=0;i<splitted.length;i++){
            if(splitted[i].equals(matchedLetter)){
                counter++;
            }
        }
        System.out.println(counter);

    }

    //part2
    //1
    public static void lexLargest(String s){
       
        String [] splitted = s.split(" ");
        String largestLex="";

        for(int i=0;i<splitted.length;i++){
            if((splitted[i].compareTo(largestLex)>0)){
                largestLex=splitted[i];
            }
            
        }
        System.out.println(largestLex);
    }


    //2 - I can also do below with compareTo method comparing wiht the empty string as it will return length
    //but for the purpose of tackling another way I did it via length method
    public static void largestBy(String s){
                
        String largestByLength = "";
        
        String [] splitted = s.split(" ");


        for (int i=0;i<splitted.length;i++){
            if(splitted[i].length()>largestByLength.length()){
                largestByLength = splitted[i];
            }
        }

        System.out.println(largestByLength);

        //end of largest by method
    }

    //3

    public static void largestByAction(String s, int number){
        if(number==1){
            lexLargest(s);
        }
        if(number==2){
            largestBy(s);
        }
        else{
            System.out.println("I can do either 1 or 2! ");
        }

        //end of largest by action
    }

    //part 3

    public static void charsIndex(){
        String userInput = "The quick brown fox jumps over the lazy dog.";
        System.out.println("a  b  c   d   e   f   g  h  i  j");
        System.out.println("================================");
        System.out.print(
        userInput.indexOf("a")+" "+
        userInput.indexOf("b")+"  "+
        userInput.indexOf("c")+"  "+
        userInput.indexOf("d")+"  "+
        userInput.indexOf("e")+"  "+
        userInput.indexOf("f")+"  "+
        userInput.indexOf("g")+"  "+
        userInput.indexOf("h")+"  "+
        userInput.indexOf("i")+"  "+
        userInput.indexOf("j")
        );
        System.out.println();
        System.out.println();

        System.out.println("k  l  m    n  o   p   q  r    s   t");
        System.out.println("===================================");
        System.out.print(
        userInput.indexOf("k")+" "+
        userInput.indexOf("l")+"  "+
        userInput.indexOf("m")+"  "+
        userInput.indexOf("n")+"  "+
        userInput.indexOf("o")+"  "+
        userInput.indexOf("p")+"  "+
        userInput.indexOf("q")+"  "+
        userInput.indexOf("r")+"  "+
        userInput.indexOf("s")+"  "+
        userInput.indexOf("t")
        );
        System.out.println();
        System.out.println();
        
        System.out.println("u  v  w   x    y   z");
        System.out.println("====================");
        System.out.print(
        userInput.indexOf("u")+" "+
        userInput.indexOf("v")+"  "+
        userInput.indexOf("w")+"  "+
        userInput.indexOf("x")+"  "+
        userInput.indexOf("y")+"  "+
        userInput.indexOf("z")+"  "
        );
        System.out.println();
        System.out.println();

        //end of charsIndex
    }

    //end of class
}
