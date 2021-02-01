//Peter Boldyrev // CSS 142 // HW Loops

// Storing for myself resources that I used...
//https://courses.cs.washington.edu/courses/cse143/13wi/exploration/DNAAlignment.java
//https://introcs.cs.princeton.edu/java/assignments/sequence.html
//https://codereview.stackexchange.com/questions/160915/multiple-sequence-alignment-in-java
//https://canvas.uw.edu/courses/1444442/assignments/5874014

import java.util.*;

public class HW_Loops {
    public static void main(String[] args){
       
        overall();
        
        //end of main method
    }

    //main ask overall
    public static void overall(){
        String userInput = firstAsk();
        String userInput2 = firstAsk();
       
        System.out.println();

        System.out.println("Sequence1: " +
        userInput.toUpperCase());
        occurenceC(userInput);
        fractionCG(userInput);
        compliment(userInput);
        System.out.println();
        
       
        System.out.println("Sequence2: " +
        userInput2.toUpperCase());
        occurenceC(userInput2);
        fractionCG(userInput2);
        compliment(userInput2);
        System.out.println();
         
         pairwise(userInput, userInput2);
        

        //end of overall
    }



    //first ask
    public static String firstAsk(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a single DNA sequence."+
        " Allowed bases are adenine (A). guanine (G), cytosine (C), thymine (T)."+
        " Please enter A,C,G,T and press return  >");
        String userInput = keyboard.next();
        userInput = sanityCheck(userInput);
        return userInput;
        //end first ask
    }


    

    public static String sanityCheck(String userInput){
        Scanner keyboard = new Scanner(System.in);
        while(!(validCheck(userInput))){
            System.out.println("Please enter valid letters. Allowed are A,C,G,T");
            userInput = keyboard.next();
        }
        System.out.println("Thank you for adding the following valid string: "+userInput.toUpperCase());
        
        return userInput.toUpperCase();
        // if(validCheck(userInput)){
        //     System.out.println("Thank you for adding the following valid string: "+userInput.toUpperCase());
 
        // }
        // else{
        //     System.out.println("Seems that not all characters are G,A,T or C. Here is what you entered: "
        //     +userInput.toUpperCase()+". Please try again or enter exit to stop");
        //     userInput = keyboard.next();
        //     if(userInput.equals("exit")){
        //         System.out.println("Goodbye!");
        //     }
        //     else{
        //         // System.out.println("I am else ");
        //       sanityCheck(userInput);

        //     }
        // }
        //end of sanity check
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



     //exercise #1 - count number of C occurences. >> occurenceC(userInput);
            //I have done it via concat of strings just to not use counter second time 
            //but it can also be solved via counter 
    public static int occurenceC(String userInput){
        String cOccurence = "";
        for(int i=0;i<userInput.toUpperCase().length();i++){
            if(userInput.toUpperCase().charAt(i)=='C'){
                cOccurence = cOccurence+"C";
            }
        }
        int numberOfC = cOccurence.length();
        System.out.println("C-count: "+ numberOfC);
        return numberOfC;
        //end of C occurence
    }
    

       //exercise #2 Determine the fraction of cytosine >>fractionCG(userInput);
            //  and guanine nucleotides. For example, if half of the 
            //  nucleotides in the sequence are either "C" or "G", the fraction should be 
            //  0.5.  If a sequence was "CGAATTTT", the fraction should be 0.25 (25% are C or G)
            
    public static double fractionCG(String userInput){
        double counter = 0;
        for(int i=0;i<userInput.toUpperCase().length();i++){
            if(userInput.toUpperCase().charAt(i)=='C' ||
            userInput.toUpperCase().charAt(i)=='G' ){
                counter++;
            }
        }
        double cgFraction = (counter/userInput.toUpperCase().length());
        // System.out.print("There were "+counter +" Cs and Gs our of "+userInput.toUpperCase().length()+" So fraction is ");
        System.out.print("CG-ratio: ");
        System.out.printf("%.2f",cgFraction);
        // System.out.print(". Here is the percentage that C and G take of total: ");
        // System.out.printf("%.2f",cgFraction*100);
        // System.out.print("%");
        System.out.println();
        return cgFraction;
    }

 // exercise #3  >>compliment(userInput);
            //A DNA strand is actually made up of pairs of bases — 
            // in effect, two strands that are cross-linked together. 
            // These two strands are complementary: if you know one,
            //  you can always determine the other, 
            // or complement, because each nucleotide only pairs up with one other. 
            // In particular, "A" and "T" are complements, as are "C" and "G". 
            // So, for example, the complement of the sequence "AAGGTCT" would be "TTCCAGA". 
            // Compute the complement of the input sequence.
            
    public static String compliment(String userInput){
        String compl = "";
        for(int i=0;i<userInput.toUpperCase().length();i++){
            if(userInput.toUpperCase().charAt(i)=='A'){
                compl=compl+"T";
            }
            else if(userInput.toUpperCase().charAt(i)=='T'){
                compl=compl+"A";
            }
            
            else if(userInput.toUpperCase().charAt(i)=='C'){
                compl=compl+"G";
            }
            else if(userInput.toUpperCase().charAt(i)=='G'){
                compl=compl+"C";
            }
        }
        System.out.println("Compliment "+compl);
        return compl;

        //end of compliment method
    }

        public static void pairwise(String userInput, String userInput2){
            int counterSameLength=0;

            if(inputsEqual(userInput,userInput2)){
                counterSameLength=checkChars(userInput, userInput2);
                System.out.println("Best alignment score is "+ counterSameLength);
                System.out.println(userInput);
                System.out.println(userInput2);
            }
                
            else if(userInput.length() > userInput2.length()){

                firstMoreThanSecond(userInput,userInput2);

                    //end if userInput.length() > userInput2.length()
            }
            
            else if(userInput.length() < userInput2.length()){
                
                firstLessThanSecond(userInput, userInput2);
                    //end if userInput.length() > userInput2.length()
            }

           //end of pairwise method
        }

        public static void firstMoreThanSecond(String userInput, String userInput2){
            int alignmentScore1 = 0;
            int counterAlignLeft1=0, counterAlignRight1 = 0, counterAlignCenter1=0;
            String userInput2Left ="", userInput2Right="", userInput2Center="";

            userInput2Left=alignLeft(userInput2, userInput.length());
            counterAlignLeft1 = checkChars(userInput, userInput2Left);

            userInput2Right=alignRight(userInput2, userInput.length());
            counterAlignRight1 = checkChars(userInput, userInput2Right);

            userInput2Center=alignCenter(userInput2, userInput.length());
            counterAlignCenter1 = checkChars(userInput, userInput2Center);

            alignmentScore1=Math.max(counterAlignLeft1,Math.max(counterAlignRight1,counterAlignCenter1));

            System.out.println("Best alignment score is "+ alignmentScore1);



                if(alignmentScore1 == counterAlignLeft1){
                    System.out.println(userInput.toUpperCase());
                    System.out.println(userInput2Left);
                }
                else if(alignmentScore1 == counterAlignRight1){
                    System.out.println(userInput.toUpperCase());
                    System.out.println(userInput2Right);
                }
                else if(alignmentScore1 == counterAlignCenter1){
                    System.out.println(userInput.toUpperCase());
                    System.out.println(userInput2Center);
                }
    
                else{
                    System.out.println("This is else");
                }

            //end first more than second method inside pairwise method
        }

        public static void firstLessThanSecond(String userInput, String userInput2){
            int alignmentScore2 = 0;
            int counterAlignLeft2=0, counterAlignRight2 = 0, counterAlignCenter2=0;
            String userInputLeft= "", userInputRight = "", userInputCenter="";

            userInputLeft=alignLeft(userInput, userInput2.length());
                counterAlignLeft2 = checkChars(userInputLeft, userInput2);

                userInputRight=alignRight(userInput, userInput2.length());
                counterAlignRight2 = checkChars(userInputRight, userInput2);

                userInputCenter=alignCenter(userInput, userInput.length());
                counterAlignCenter2 = checkChars(userInputCenter, userInput2);

                alignmentScore2=Math.max(counterAlignLeft2,Math.max(counterAlignRight2,counterAlignCenter2));

                System.out.println("Best alignment score is "+ alignmentScore2);


                if(alignmentScore2 == counterAlignLeft2){
                    System.out.println(userInputLeft);
                    System.out.println(userInput2.toUpperCase());
                }
                else if(alignmentScore2 == counterAlignRight2){
                    System.out.println(userInputRight);
                    System.out.println(userInput2.toUpperCase());
                }
                else if(alignmentScore2 == counterAlignCenter2){
                    System.out.println(userInputCenter);
                    System.out.println(userInput2.toUpperCase());
                }
    
                else{
                    System.out.println("This is else");
                }

                //end first less than second method inside pairwise method
        }


        // ``````````````````````````````````HELPER METHODS BELOW ````````````````````````````````````````

        public static int checkChars(String userInput, String userInput2){
            int counter=0;
            for (int i=0;i<userInput.length();i++){
                  
                if(userInput.toUpperCase().charAt(i)==userInput2.toUpperCase().charAt(i)){
                    counter++;
    
                }
                
            }
            return counter;
            //end of checkChars
        }

        //alignment methods below

        public static String alignLeft(String s, int length){
            String oneSpace=" ";
            while(s.length()!=length){
                s=oneSpace+s;
            }
            
            return s.toUpperCase();
        }

        public static String alignRight(String s, int length){
            String oneSpace=" ";
            while(s.length()!=length){
                s=s+oneSpace;
            }
            
            return s.toUpperCase();
        }

        public static String alignCenter(String s, int length){
            String oneSpace= " ";
            while(s.length()!=length){
                s = oneSpace+ s+ oneSpace;
            }
            return s.toUpperCase();
         
        }
        //end of alignment methods

        public static boolean inputsEqual(String userInput, String userInput2){
            if(userInput.length()==userInput2.length()){
                return true;
            }
            else{
                return false;
            }
            //end of inputs equal
        }

        

    //end of class HW_Loops
}
