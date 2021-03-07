//Peter Boldyrev

public class Pizza {
    private String size;
    private int meatToppings;
    private int veggieToppings;
    private boolean isVegan;
    private double costOfPizza;

    public Pizza(){
        this.size = "medium";
        this.meatToppings = 0;
        this.veggieToppings = 0;
        this.isVegan = false;
         //end of pizza constructor
    }

    public Pizza(String newSize, int newMeatToppings, int newVeggieToppings, boolean newIsVegan){
        if(!(newSize.toLowerCase().equals("small") ||
        newSize.toLowerCase().equals("medium") || 
        newSize.toLowerCase().equals("large"))){
            System.out.println("Only small / medium / large size accepted"+
            " your pizza size will be defaulted to medium");
            this.size = "medium";
        }
        else{
            this.size = newSize;
        }

        if(newMeatToppings<0){
            System.out.println("Only positive number of toppings is accepted for any toppings, unless you have toppings to give to us!"+
            " Your topping will be defaulted to 0");
            this.meatToppings =0;
        }
        else{
            this.meatToppings = newMeatToppings;
        }

        if(newVeggieToppings<0){
            System.out.println("Only positive number of toppings is accepted, unless you have toppings to give to us!"+
            " Your topping will be defaulted to 0");
            this.veggieToppings =0;
        }
        else{
            this.veggieToppings = newVeggieToppings ;
        }
       
       
        this.isVegan = newIsVegan;

        //end of pizza constructor
    }

    public String getSize(){
        return this.size;
    }

    public int getMeat(){
        return this.meatToppings;
    }

    public int getVeg(){
        return this.veggieToppings;
    }

    public boolean isVegan() {
        return isVegan;
    }
    public String getDescription() {
        return this.size+ " "+this.meatToppings+" "+ this.veggieToppings+" "+ this.isVegan;
    }

    public double calcCost(){
        
        if(this.size.toLowerCase().equals("small")){
            this.costOfPizza = 10;
        }
        else if(this.size.toLowerCase().equals("medium")){
            this.costOfPizza = 12;
        }
        else if(this.size.toLowerCase().equals("large")){
            this.costOfPizza = 14;
        }

        if(this.isVegan){
            this.costOfPizza+=2;
        }

        if(this.meatToppings>0){
            this.costOfPizza=this.costOfPizza+(meatToppings*2);
        }
        
        if(this.veggieToppings>0){
            this.costOfPizza=this.costOfPizza+veggieToppings;
        }

        return this.costOfPizza;
    }

   public double calcTip(double param){
       double tips = 0.0;
       if(param>=0.0 && param <=1.0){
        tips = this.costOfPizza*param;
       }
       else{
           System.out.pritnln("Sorry, we tip up to 100%, try again");
       }
       return tips;
   }

//end of class
}
