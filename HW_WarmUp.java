import java.util.Scanner;

public class HW_WarmUp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //1
        System.out.println("Enter the number >");
        int number = keyboard.nextInt();
        if(number<0){
            System.out.println("your number "+ number+ " is negative");
        }
        else{
            System.out.println("Your number is positive");
        }
        //2
        System.out.println("Enter the second number >");
        int number2 = keyboard.nextInt();
        if(number2==0){
            System.out.println("The number is zero");
        }
        else{
            System.out.println("your number is not zero");
        }
        //3
        System.out.println("Enter a third number, a double, for the class average >");
        double classAverage = keyboard.nextDouble();
        if(classAverage>60.0){
            System.out.println("A passign grade");
        }
        else if(classAverage<60.0 && classAverage>0.0){
            System.out.println("Not a passing grade");
        }
        else{
            System.out.println("Seems that you entered negative number");
        }
        //4
        System.out.println("Is the answer the user reported true?  Enter a Boolean value. >");
        boolean answer = keyboard.nextBoolean();
        if(answer){
            System.out.println("The answer reported was true");
        }
        //5
        else{
            System.out.println("The value was false");
        }

        //6
        System.out.println("Enter a number to see if it's even or odd");
        int number3 = keyboard.nextInt();
        if(number3%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        //7,8
        System.out.println("Enter a float value that will represent a grade in the range 1 to 100> ");
        float userFloatNum = keyboard.nextFloat();
        if(userFloatNum>=90.1){
            System.out.println("You have A grade "+ userFloatNum+" and it is more or equal to 90.1");
        }
        else if ((userFloatNum>78.3) && (userFloatNum<90.1)){
            System.out.println("You have a B grade.Your grade is more than 78.3 but less than 90.1. Your grade is  "+userFloatNum);
        }
        else{
            System.out.println("Sorry! Your grade is below 78.3, study better!");
        }

        //9
        System.out.println("Please enter the temperature in Farenheit >");
        double userTemp = keyboard.nextDouble();
        if(userTemp>78){
            System.out.println("higher than 78 degrees");
        }
        else if(userTemp<=78){
            System.out.println("less than or equal to 78 degrees");
        }

        //10
        System.out.println("Please enter the temperature in Farenheit >");
        double userTemp2 = keyboard.nextDouble();
        if((userTemp2>0 && userTemp2%2!=0) || (userTemp2==0 && userTemp2%2==0)){
            System.out.println("yes; positive and odd or zero and even");
        }
        else{
            System.out.println("no; not positive and odd or zero and even");
        }

        //11
        System.out.println("Please enter a grade A-B-C-D-E-F >");
        char userGrade = keyboard.next().charAt(0);
        char userGradeLowerCase = Character.toLowerCase(userGrade);
        if(userGradeLowerCase>='a' && userGradeLowerCase<='f'){
            System.out.println("Thank you! You entered grade "+ userGrade);
        }
        else{
            System.out.println("Sorry! It seems that you entered "+userGrade+ " which is a different grade from the A-F grading scale.");
        }

        //12 is below

        //13
        System.out.println("Please enter two numbers (integers) separated by comma >");
        String userString13 = keyboard.next();
        String[] userVector13=userString13.split(",");
        int userFirstNum13 = Integer.parseInt(userVector13[0]);
        int userSecondNum13 = Integer.parseInt(userVector13[1]);
        if(max(userFirstNum13, userSecondNum13)==1){
            System.out.println("First number "+userFirstNum13+ " is greater than second number "+ userSecondNum13);
        }
        else if (max(userFirstNum13, userSecondNum13)==2){
            System.out.println("Second number "+userSecondNum13+ " is greater than first number "+ userFirstNum13);
        }
        else if(max(userFirstNum13, userSecondNum13)==0){
            System.out.println("Both numbers are equal!");
        }
        else{
            System.out.println("May be an error somewhere in the input");
        }

        
        //end of main function
    }
    //12 
    public static int max(int a, int b){
        if(a>b){
            return 1;
        }
        
        else if(b>a){
            return 2;
        }
        else{
            return 0;
        }
    }
    
}
