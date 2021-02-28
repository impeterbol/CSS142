//Peter Boldyrev CSSSKL 142 // Lab8 

public class TempTester {
    public static void main(String[] args){
        Temperature temp1 = new Temperature( 0.0,'C');
        Temperature temp2 = new Temperature(45, 'F');

       System.out.println(temp1.convertToFarenheit(temp1.temp));

       temp1.temp = -40;
       System.out.println(temp1.convertToCelcius(temp1.temp));
       temp1.temp = 100;
       System.out.println(temp1.compareTemps(temp2.temp));
       System.out.println(new Temperature(98.164555, 'F'));
      

    }
}
