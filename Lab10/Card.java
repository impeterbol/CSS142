//Peter Boldyrev CSSSKL 142 // Lab 10

public class Card {
  private String name; // "2" - "10", "J", "Q", "K", "A"
  private String suit; // "Club", "Diamond", "Heart", "Spade"

  // Constructor by arguments
  Card( String argName, String argSuit ) {
    setName( argName );
    setSuit( argSuit );
  }

  public int value( ) {
    //write your function
    int retInt=0;
    if(this.name.equals("2") || this.name.equals("3") ||
    this.name.equals("4") || this.name.equals("5") ||
    this.name.equals("6") || this.name.equals("7") ||
    this.name.equals("8") || this.name.equals("9") ||this.name.equals("10")){
      retInt = Integer.parseInt(this.name);
    } 

    else if(this.name.toUpperCase().equals("J")){
      retInt = 11;
    }
    else if(this.name.toUpperCase().equals("Q")){
      retInt = 12;
    }
    
    else if(this.name.toUpperCase().equals("K")){
      retInt = 13;
    }
    
    else if(this.name.toUpperCase().equals("A")){
      retInt = 1;
    }
    
    return retInt;
  }

  public String toString() {
   
    return name + " " + suit;
  }

  // Getter/Setters
  public String getName() {
    return this.name;
  }
  public String getSuit() {
    return this.suit;
  }
  public void setName( String argName ) {
    this.name = argName;
  }
  public void setSuit( String argSuit ) {
    this.suit = argSuit;
  }

  public int compareTo(Card otherCard){
    if(this.value()<otherCard.value()){
      return -1;
    }
    else if(this.value()>otherCard.value()){
      return 1;
    }
    else{
      return 0;
    }
  }

  public static void main(String [] args){
    Card testCard1 = new Card("3","Club");
    Card testCard2 = new Card("5","Heart");
    System.out.println(testCard1.compareTo(testCard2));
    System.out.println(testCard1.toString());
    
  }
//end of class
}
