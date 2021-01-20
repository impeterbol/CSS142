// Your First Program
import java.text.NumberFormat; 
import java.util.Locale;


public class chapter1Tasks {
    public static void main(String[] args) {

        metProgram();
        videoGame();
        nameProgram();
        sodaTask();
        hateLove();
        cycling();
        timeProgram();
        heightProgram();
        coffeeKiller();
    }
    // One way to measure the amount of energy that is expended during exercise
    // is to use metabolic equivalents (MET). Here are some METS for various activities:
    // Running 6 MPH: 10 METS Basketball:
    // Sleeping:
    // 8 METS 1 MET
    // The number of calories burned per minute may be estimated using the following formula:
    // CaloriesjMinute = 0.0175 * MET * Weight in kilograms
    
    public static void metProgram(){
        double poundWeight = 150.0;
        double kgWeight = poundWeight/2.2;
        double metRunning = 10.0;
        double metBasketball = 8.0;
        double metSleeping = 1.0;
        double calPerMinRun = 0.0175*metRunning*kgWeight;
        double calPerMinBasketball=0.0175*metBasketball*kgWeight;
        double calPerMinSleeping=0.0175*metSleeping*kgWeight;

        System.out.println(calPerMinRun);
        System.out.println(calPerMinBasketball);
        System.out.println(calPerMinSleeping);

    }
    // The video game machines at your local arcade output coupons according to how well you play the game. 
    // You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to gumballs. 
    // Write a program that defines a variable initially assigned to the number of coupons you win. 
    // Next,the program should output how many candy bars and gumballs you can get 
    // if you spend all of your coupons on candy bars first, and any remaining coupons on gumballs.
    public static void videoGame(){
        int initialCoupons = 93;
        int candyBar = initialCoupons/10;
        int afterCandyBarCoupons = initialCoupons%10;
        int gumballs = afterCandyBarCoupons/3;
        System.out.println("here is candybars " + candyBar);
        System.out.println("here is left after candybars redeemed " + afterCandyBarCoupons);
        System.out.println("here is gumballs  " + gumballs);

    }

//     Write a program that starts with the string variable first set to your first name and the string variable last set to your last name. 
//     Both names should be all lower-case. Your program should then create a new string that contains your full name in pig latin with 
//     the first letter capitalized for the first and last name. Use only the pig latin rule of moving the first letter to the end of the word and adding “ay.” 
//     Output the pig latin name to the screen. Use the substring and toUpperCase methods to construct the new name.
// For example, given first = "walt"; last = "savitch"; the program should create a new string with the text “Altway Avitchsay” and print it.

    public static void nameProgram(){
        String ay = "ay";
        String first = "peter";
        String firstNew = first.substring(1)+first.charAt(0)+ay;
        String firstNewCap = firstNew.substring(0,1).toUpperCase()+firstNew.substring(1);
        String last = "boldyrev";
        String lastNew = last.substring(1)+last.charAt(0)+ay;
        String lastNewCap = lastNew.substring(0,1).toUpperCase()+lastNew.substring(1);
        String firstLast = firstNewCap+ " " +lastNewCap;
        System.out.println("\""+firstLast+"\"");
    }

    // A government research lab has concluded that an artificial sweetener commonly used in diet soda pop will cause death in laboratory mice. 
    // A friend of yours is desperate to lose weight but cannot give up soda pop. 
    // Your friend wants to know how much diet soda pop it is possible to drink without dying as a result. Write a program to supply the answer. 
    // The program has no input but does have defined constants for the following items: 
    // the amount of artificial sweetener needed to kill a mouse, the weight of the mouse, the starting weight of the dieter, and the desired weight of the dieter. 
    // To ensure the safety of your friend, be sure the program uses the weight at which the dieter will stop dieting, 
    // rather than the dieter’s current weight, to calculate how much soda pop the dieter can safely drink. 
    // You may use any reasonable values for these defined constants. 
    // Assume that diet soda contains 1/10th of 1% artificial sweetener. Use another named constant for this fraction. 
    // You may want to express the percent as the double value 0.001. (If your program turns out not to use a defined constant, you may remove that defined constant from your program.
    public static void sodaTask(){

        double killAMouseSweetener = 10.0;
        double mouseWEightPounds = 20.0;
        double friendDesiredWeight = 150.0;
        double sweetenerInSoda = 0.001;
        double killAFriendSweetener = (friendDesiredWeight*killAMouseSweetener)/mouseWEightPounds;
        double numberOfSodas = killAFriendSweetener/sweetenerInSoda;
        System.out.println(numberOfSodas);
    }

//     Write a program that starts with a line of text and then outputs that line of text 
//     with the first occurrence of "hate" changed to "love". For example, a possible sample output might be
// The line of text to be changed is: I hate you.
// I have rephrased that line to read: I love you.
    public static void hateLove(){
        String hate = "I hate you." ;
        String desiredWord = "hate";
        String newWord = "love";
        // 0 here is the first occurence, if we need second occurence put 1 etc - page 40 in the book
        int position = hate.indexOf(desiredWord,0) ;
        System.out.println("this is position "+ position) ;
        String ending = hate.substring(position+desiredWord.length()) ;
        System.out.println("this is ending "+ ending) ;
        String love = hate.substring(0, position)+newWord+ ending ;
        System.out.println("I have rephrased that line to read: ") ;
        System.out.println(love) ;
        
        
    }

    // Bicyclists can calculate their speed if the gear size and cadence are known. Gear size refers to the effective diameter of the wheel. 
    // Gear size multiplied by pi (3.14) gives the distance travelled with one turn of the pedals. 
    // Cadence refers to the number of pedal revolutions per minute (rpm). 
    // The speed in miles per hour is calculated by the following: Speed 1mph2 =
    // Gear size (inches) * p * 1(ft) 12 (inches) *
    // 1(mile) 5280 (ft)
    // * Cadence (rpm) *
    // 60 (minutes) (hour)
    // This is a program that calculates the speed for a gear size of 100 inches and a cadence of 90 rpm. 
    // This would be considered a high cadence and a maximum gear size for a typical bicycle. 
    // In writing your program, don’t forget that the expression 1/12 will result in 0,
    //  because both 1 and 12 are integers, and when the integer division is performed, the fractional part is discarded.
    
    public static void cycling(){
        double gearSize = 100.0; //in inches, this is max gearSize
        double distanceOnePedalTurn = gearSize*3.14;
        double cadence = 90.0; // high cadence 
        double speed = distanceOnePedalTurn*(1.0/12.0)*(1.0/5280.0)*cadence*60.0;
        System.out.println(speed + " here is the speed");

    }

    // Write a program that outputs the number of hours, minutes, and seconds that corresponds to 50,391 total seconds. 
    // The output should be 13 hours, 59 minutes, and 51 seconds. 
    // Test your program with a different number of total seconds to ensure that it works for other cases.

    public static void timeProgram(){
        int initialSeconds = 50391;
        int hours = initialSeconds/3600;
        int secLeft = initialSeconds%3600;
        int mins = secLeft/60;
        int secLeft2 = secLeft%60;
        
        System.out.println(hours+" hrs, "+ mins+" min, "+ secLeft2+" seconds");
    }

    // The following program will compile and run, but it uses poor programming style. 
    // Modify the program so that it uses the spelling conventions, constant naming conventions, and formatting style 
    // recommended in this book. 
    // public class messy { 
    //     public static void main(String[] args) {
    //     double time , pace ;
    //     public static final double distance = 6.21;
    //     time = 35.5; /* 35 minutes and 30 seconds */ 
    //     pace = time / distance;
    //     System.out.println("This program calculates your pace given a time and distance traveled.");
    //     System.out.println("Your pace is " + pace + " miles per hour."); 
    //     }
    // }
    //  above is formatted by me - Peter
    


    // A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 
    // 5 feet of height and 5 pounds for each additional inch. 
    // Write a program with a variable for the height of a person 
    // in feet and another variable for the additional inches. 
    // Assume the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall 
    // would be represented with a variable that stores the number 6 and another variable that stores the number 3. 
    // Based on these values, calculate and output the ideal body weight.

        public static void heightProgram(){
            int heightFeet = 6;
            int heightInch = 1;
            int perfectWeight = ((((heightFeet-5)*12)+heightInch)*5)+110;
            System.out.println(perfectWeight+" perfect weight");
        }

        // Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose. 
        // Write a program with a variable that holds the number of milli-grams of caffeine 
        // in a drink and outputs how many drinks it takes to kill a person. 
        // A 12-ounce can of cola has approximately 34 mg of caffeine, while a 
        // 16-ounce cup of coffee has approximately 160 mg of caffeine.

        public static void coffeeKiller(){
            int lethalDoseGrams = 10; //grams
            int lethalDoseMiligrams = lethalDoseGrams*1000;
            int numberOfCokesToKill = lethalDoseMiligrams/34;
            int numberOfCoffeesToKill = lethalDoseMiligrams/160;
            System.out.println("number of cokes to kill "+ numberOfCokesToKill);
            System.out.println("number of coffees to kill "+ numberOfCoffeesToKill);

        }
    // =====
}