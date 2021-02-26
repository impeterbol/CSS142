public class DateFirstTry {
    
        
public static String month; 
public static int day;
public static int year; //a four digit number.
    
public static void writeOutput(){
    System.out.println(month + " " + day + ", " + year);
}

public static void makeItNewYears(){
    month="January";
    day=1;
}

public static void yellIfNewYear(){
    if(month.equals("January")&&day==1){
        System.out.println("Hurray!");
    }
    else{
        System.out.println("Not Hurray!");
    }
    
}

}
