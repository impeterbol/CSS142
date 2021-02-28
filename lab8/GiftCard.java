//CSSSKL 142D edited by Peter Boldyrev Feb 27

/**
 * GiftCard.java
 * CSS142
 *
 * Skeleton file for a basic giftcard class; useful to set, report, and
 * manage deductions
 */

public class GiftCard {
    //todo: class-level instance variables go here
    private double balance;

    // Constructor
    public GiftCard(double initialBalance) {
        this.balance = (double)initialBalance;
    }
    
    public void setBalance(double newBalance){
        if(newBalance<0){
            System.out.println("Balance should be positive");
        }
        else{
            this.balance = (double)newBalance;
        }
        //end of setBalance
    }

    public void deduct(double amountToDeduct){
        if(amountToDeduct>this.balance){
            System.out.println("Amount to deduct"
            + amountToDeduct+" is > than current balance "+ this.balance);
            System.out.println("Please add amount less than current balance "+this.balance+" and try again. For now balance won't be changed");
        }
        else{
            this.balance = this.balance - amountToDeduct;
        }
        //end of deduct
    }

    public void report(){
       System.out.println(this.balance);
    }
    //todo: write setBalance(), report() and deduct methods.

    //an example method that needs instance data to be declared first
    public void resetToZero() {
        this.balance = 0;
        System.out.println("resetter to zero: " + this.balance);
    }

    public static void main(String[] args) {
        GiftCard card1 = new GiftCard(0);

        card1.setBalance(50);

        System.out.print("card1 value is: ");
        card1.report();

        GiftCard card2 = new GiftCard(0);

        card2.setBalance(100);
        System.out.print("card2 value is: ");
        card2.report();

        card2.deduct(101);
        System.out.print("\nAfter deducting $101, card2's new balance is: ");
        card2.report();

        card1.deduct(12.50);
        System.out.print("\nAfter deducting $12.50, card1's new balance is: ");
        card1.report();

        System.out.println();
        card1.resetToZero();
        card1.report();
        card2.resetToZero();
        card2.report();

        // User defined constructor
        GiftCard card3 = new GiftCard(5000);
        System.out.println("\nSetting the new balance to 7500.99 ");
        card3.setBalance(7500.99);
    }

}
