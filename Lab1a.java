// public class myProgram1{
//     public static void main(String[] args) {
//         System.out.println("Hello, World!"); 
//         int age= 47;
//         System.out.println("my age is "+ age );
//     }
// }


  // Lab1a.java
  // This short class has several bugs for practice.
  // Authors: Carol Zander, Rob Nash, Clark Olson, you
  public class Lab1a {
    public static void main(String[] args) {
      compareNumbers();
      calculateDist();
    }

    public static void compareNumbers() { //space after public
      int firstNum = 5;
      int secondNum = 2; //do we need to define second num? 
      System.out.println( "Sum is: "+ firstNum + secondNum ); //missing parenthesis close after : and secondNum hasn't been initialized above
      System.out.println( "Difference is: " + (firstNum - secondNum));//add ) to complete expression
      System.out.println( "Product is: " + firstNum * secondNum ); //typo nuM
    }

    public static void calculateDist() {//need to shorten name to calculateDist
      int velocity = 10; //miles-per-hour
      int time = 2, //hoursint
      distance = velocity * time;//missing semicolon and from the new line System.out.println
      System.out.println( "Total distance is: " + distance); //typo distAnce and missing +
    }
  }