// Lab1b.java
  // This is a practice lab to output a few verses of
  //"99 bottles of beer on the wall"
  // Authors: Carol Zander, Clark Olson, you

  public class Lab1b {

     public static void main (String[] args) {
        int numBottles; // number of bottles currently on the wall

        // display first verse
        numBottles = 5;
        mainText();
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles--;
        System.out.print(numBottles);
        onWall();
        System.out.println();  // display blank line between verses

        // display second verse
        // [this is where you take over]
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles--;
        System.out.print(numBottles);
        onWall();
        System.out.println();  // display blank line between verses

        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles--;
        System.out.print(numBottles);
        onWall();
        System.out.println();  // display blank line between verses

        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        numBottles--;
        System.out.print(numBottles);
        onWall();
        System.out.println();  // display blank line between verses

        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        noMoreBeer();
     }

     public static void mainText() {
      System.out.println(" bottles of beer on the wall");
   }
     public static void onWall() {
        System.out.println(" bottles of beer on the wall");
     }

     public static void botBeer() {
        System.out.println(" bottles of beer");
     }
     public static void takeOneDown() {
      System.out.println(" Take one down and pass it around");
   }
   public static void noMoreBeer() {
      System.out.println(" No more bottles of root beer on the wall");
   }

  }