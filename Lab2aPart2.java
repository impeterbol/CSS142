//Peter Boldyrev  - CSSSKL 142D - Lab Week 2 - PART 2 

import java.util.Scanner;

public class Lab2aPart2{
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("please type \"kelvins\" if you want to convert F to K and \"farenheits\" if K to F. Type \"exit\" to stop > ");
            String userChoice = keyboard.next();
            
            if (userChoice.equals("kelvins")){
                System.out.println("enter temp in Farenheit ");
                double f = keyboard.nextDouble();
                double k = kelvins(f);
                temperaturePrinter(f, k);
                main(args);
            }
            else if (userChoice.equals("farenheits")){
                System.out.println("enter temp in Kelvins ");
                double k = keyboard.nextDouble();
                double f = farenheits(k);
                temperaturePrinter(f, k);
                main(args);
            }
            else if (userChoice.equals("exit")) {
                    System.out.println("Alright, have a nice day!");
                
            }
            else {
                System.out.println("Sorry I didn't get you, can you try again? ");
                main(args);
        }
            
            
    }
//     Write a method called kelvins that takes as input (that is, as argument) 
//     a temperature in degrees Fahrenheit (of type double) and returns the temperature 
//     in degrees Kelvin (also a double). Here is the mathematical formula for conversion:
    public static double kelvins(double f) {
            double k= (5/9.0)*(f-32.0)+273.15;
            return k;
    }

    //this is a method to convert to farenheit if user inputs in kelvins:
    // formula https://www.rapidtables.com/convert/temperature/how-kelvin-to-fahrenheit.html
    public static double farenheits(double k){
            double f =(9.0/5.0)*(k-273.15)+32.0;
            return f;
    }
//     Write another method called temperaturePrinter that takes as input 
//     (i.e. as argument) two doubles and prints the following message to the screen:

    public static void temperaturePrinter(double f, double k){
        System.out.print("temperature in Farenheit is ");
        System.out.printf("%.2f",f);
        System.out.println();
        System.out.print("temperature in Kelvin is ");
        System.out.printf("%.2f",k);
        System.out.println();
    }
//     Generate an output of the following temperatures and submit with your codebase:
//     0 degrees Kelvin
//     273.15 Kelvin
//     373.2 Kelvin

  }
