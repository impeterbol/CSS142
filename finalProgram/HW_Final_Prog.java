import java.util.Scanner;
import java.util.Arrays;
import java.util.LanguageRange;
import java.util.NoSuchElementException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;


public class HW_Final_Prog {
    public static void main(String[] args){

        overall();


        //end of main
    }

       public static void overall(){
        //remove blank lines from the file TODO

        String line;
        int linesInTheFile = countLinesInTheFile();
        System.out.println(linesInTheFile);
     
      String [] firstName = new String [linesInTheFile];
      String [] lastName = new String [linesInTheFile];
      String [] phoneNumber = new String [linesInTheFile];
      String [] companyData = new String [linesInTheFile];
        
      Contact [] arrOfContacts = new Contact[linesInTheFile];
        
    Scanner inputStream = null;

        try {
            inputStream = new Scanner (new FileInputStream("nameBook.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Here is a filenotfound exception");
            System.exit(0);
        }

        int i = 0;
        while(inputStream.hasNextLine()){
            line = inputStream.nextLine();
            Scanner lineScanner = new Scanner (line);
                while(lineScanner.hasNext()){
                    firstName[i]=lineScanner.next();
                    lastName[i] = lineScanner.next();
                    phoneNumber[i] = lineScanner.next();
                    companyData[i] = lineScanner.next();
                   
                }
                lineScanner.close();
                i++;
       }
       inputStream.close();
       

       for(int j =0, k=0;j<arrOfContacts.length;j++){
        arrOfContacts[k]= new Contact(firstName[j],lastName[j],phoneNumber[j],companyData[j]);
        k++;
      }
      
      ListOfContacts list1 = new ListOfContacts(arrOfContacts);
        //add method handleUserOptions (passing array of contacts )
        handleUserOptions(list1, arrOfContacts);

        

        //end of overall
    }


    public static void handleUserOptions(ListOfContacts list1, Contact [] arrOfContacts){
        
        // ListOfContacts list1 = new ListOfContacts(arrOfContacts);
        PrintWriter outputStream = null;
        Scanner sc = new Scanner(System.in);
        int userChoice = displayMainMenu(sc);

       if(userChoice ==1){
       
        listAllContacts(list1.listAllContact());
        nextStep();
       }

       if(userChoice ==2){
        // Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Please enter first / last / phone number"+
        " / company to get all relevant results >");
        String userInputFirst = sc.next();
        // System.out.println(userInputFirst);
        // keyboard1.close();
        String [] searchRes = searchMethod(arrOfContacts, userInputFirst);

        for(int i=0;i<searchRes.length;i++){
            System.out.println(searchRes[i]);
        }

        nextStep();
        //end of userChoice2
       }

       if(userChoice ==3){

        System.out.println("Please enter first name as one word ");
        String userFistName = sc.next();
        System.out.println("Please enter last name as one word ");
        String userLastName = sc.next();
        System.out.println("Please enter phone number without any chars ");
        String userPhoneNumber = sc.next();
        System.out.println("Please enter comany name as one word ");
        String userCompanyName = sc.next();

        Contact userContact = new Contact(userFistName,userLastName,userPhoneNumber,userCompanyName);
        System.out.println(list1.enterContact(userContact));
        System.out.println(Arrays.toString(list1.listAllContact()));

        try {
            outputStream = new PrintWriter(new FileOutputStream("nameBook.txt",true));
        } catch (FileNotFoundException e) {
            System.out.println("Error creating/accessing the file stats.txt."); 
            System.exit(0);
        }
        System.out.println("Writing to file");
        outputStream.print("\n"+userContact.toString());
        outputStream.close();

        nextStep();
        // arrOfContacts.enterContact(userContact);
        
        //end of option 3
       }

       if(userChoice == 0){
           System.out.println("Thank you! See you later!");
       }
      

    }

    public static int displayMainMenu(Scanner keyboard){
        // Scanner keyboard = new Scanner(System.in);
        int userInput;

        System.out.println("Hello! Welcome to the contacts book. Please select an option to continue:\n"+
        "1: List all contacts\n "+
        "2: Search contact by first OR last OR phone number \n "+
        "3: Add new contact to the list \n "+
        "0: Exit the app \n >>");
       
        userInput = keyboard.nextInt();
        while(userInput!=1 && userInput!=2 && userInput!=3 && userInput!=0){
            
            System.out.println("Please select a valid option 1-3 or 0 to exit");
            
            userInput = keyboard.nextInt();
        }
        System.out.println("Thank you!");
        // keyboard.close();
        return userInput;
        
        //end of displayMainMenu
    }

    public static void nextStep(){
        Scanner scNext = new Scanner(System.in);
        System.out.println("Do you want to return to main menu or exit? 1 to return to main menu, 0 to exit");
        int userChoice = scNext.nextInt();

        if(userChoice == 1){
            overall();
        }
        else{
            System.out.println("Thank you! Goodbye!");
        }
        
    }

    

    public static void listAllContacts(String [] someArr){
        System.out.println("Here are all entered contacts in your file: ");
        for(int i=0;i<someArr.length;i++){
            System.out.println(someArr[i]);
        
        }
        //end of list all contacts
    }

    public static String[] searchMethod(Contact [] arrOfContacts, String userFirst){
        String [] res = new String [arrOfContacts.length];
        for(int i=0, j=0;i<arrOfContacts.length;i++){
            if(userFirst.toLowerCase().equals(arrOfContacts[i].getFirstName().toLowerCase())||
            userFirst.toLowerCase().equals(arrOfContacts[i].getLastName().toLowerCase())||
            userFirst.toLowerCase().equals(arrOfContacts[i].getPhoneNumber().toLowerCase())||
            userFirst.toLowerCase().equals(arrOfContacts[i].getCompanyName().toLowerCase())
            ){
                res[j++]= arrOfContacts[i].toString();
            }
        }

       if(res[0]!=null){
           int counter = 0;
        for(int k=0;k<res.length;k++){
            if(res[k]!=null){
                counter++ ;
            }
        }

        String [] resNotEmpty = new String[counter];
        for(int z=0, a=0;z<res.length;z++){
            if(res[z]!=null){
                resNotEmpty[a++]=res[z];
            }
        }
        return resNotEmpty;
       }
       else {
           String [] resEmpty = new String[1];
           resEmpty[0] = "No such first name found... ";
           return resEmpty;
       }
        
        //end of search method
    }

    public static int countLinesInTheFile(){
        Scanner lineCounter = null;
        int counter=0;

        try {
            lineCounter = new Scanner (new FileInputStream("nameBook.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Here is a filenotfound exception");
            System.exit(0);
        }
        while(lineCounter.hasNextLine()){
            counter++;
            lineCounter.nextLine();
        }
        return counter;
        //end of count lines in the file
    }


    

    //end of class
}
