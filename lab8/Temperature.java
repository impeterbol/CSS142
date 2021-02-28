//Peter Boldyrev CSSSKL 142 // Lab8 

public class Temperature {
    
    public double temp;
    public char scale;

    //constructor
    public Temperature(double newTemp, char newScale){
      
       this.temp = newTemp;
          
            this.scale = newScale;
      //end of constructor
    }

    //accessor methods

    public double convertToCelcius(double tempInFarenheit){
        return 5*(tempInFarenheit -32)/9;
    }
    public double convertToFarenheit(double tempInCelcius){
        return (9*(tempInCelcius)/5)+32;
    }

    public void setNewTempValue(double newTempValue){
        this.temp = newTempValue;
    }
    public void setNewScale(char newScale){
        this.scale = newScale;
    }
    public void setNewValueAndScale(double newTempV, char newScaleS){
        this.temp= newTempV;
        this.scale = newScaleS;
    }

    public int compareTemps(double tempToCompare){
        if (this.temp>tempToCompare){
            return 1;
        }
        else if(this.temp == tempToCompare){
            return 0;
        }
        else{
            return -1;
        }

        //end compareTEmps
    }

    public String toString(){
            
        return (Math.round(this.temp * 10.0) / 10.0 + " "+this.scale);
    }




    // end of class
}
