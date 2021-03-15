import java.util.Random;
import java.util.Arrays; 

public class TwoDArray {

    private int [][] array;
    private int numRows;
    private int numCols;
    private int maxVal;
    private int minVal;

    public TwoDArray(int newMax, int newMin, int newNumRows, int newNumCols){
        this.maxVal = newMax;
        this.minVal = newMin;
        this.numRows = newNumRows;
        this.numCols = newNumCols;
        this.array = new int [this.numRows][this.numCols];
    }

    public void setMaxVal(int newMaxVal){
        this.maxVal = newMaxVal;
        
    }
    public void setMinVal(int newMinVal){
        this.minVal = newMinVal;
    }
    public void setNumRows(int newNumRows){
        this.numRows = newNumRows;
    }
    public void setNumCols(int newNumCols){
        this.numCols = newNumCols;
    }
    public void setArray(){

        this.array = createNewArray();
        // System.out.println(Arrays.deepToString(this.array));
    }   

    public int getMaxVal(){
        return this.maxVal;
    }
    public int getMinVal(){
        return this.minVal ;
    }
    public int getNumRows(){
        return this.numRows ;
    }
    public int getNumCols(){
        return this.numCols ;
    }
    public int[][] getArray(){
        return this.array;
    }   

    public int [][] createNewArray(){
        Random r = new Random();
        int [][] newTwoDArray = new int[this.numRows][this.numCols];
        for(int row = 0;row<newTwoDArray.length;row++){

            for(int col =0; col<newTwoDArray[row].length;col++){
                int someNum = r.nextInt((this.maxVal-this.minVal)+1)+this.minVal;
                newTwoDArray[row][col]= someNum;
            }
        }
        return newTwoDArray;

    }

    public int [][] addAnotherMatrix(TwoDArray anotherArr){
        int [][] sumArr = new int [this.numRows][this.numCols];

        if(this.numRows!=anotherArr.getNumRows() || this.numCols!=anotherArr.getNumCols()){
            System.out.println("Matrix are not of the same size");
        }
        else{

        }
        for(int row = 0;row<this.array.length;row++){
            for(int col = 0;col<this.array[row].length;col++){
                sumArr[row][col]=this.array[row][col]+anotherArr.getArray()[row][col];
            }
        }
        return sumArr;
        //end of addAnotherMatrix
    }

    public int [][] substractAnotherMatrix(TwoDArray anotherArr){
        int [][] subsctArr = new int [this.numRows][this.numCols];

        if(this.numRows!=anotherArr.getNumRows() || this.numCols!=anotherArr.getNumCols()){
            System.out.println("Matrix are not of the same size");
        }
        else{

        }
        for(int row = 0;row<this.array.length;row++){
            for(int col = 0;col<this.array[row].length;col++){
                subsctArr[row][col]=this.array[row][col]-anotherArr.getArray()[row][col];
            }
        }
        return subsctArr;
        //end of addAnotherMatrix
    }

    public int [][] modifyMatrix(char c, TwoDArray anotherArr){
        int [][] res = new int [this.numRows][this.numCols];
        if(c =='+'){
            res = addAnotherMatrix(anotherArr);
        }
        else if(c =='-'){
            res = substractAnotherMatrix(anotherArr);
        }

        return res;
    }

    

    public static void main(String [] args){
        System.out.println("THis is main method");
        TwoDArray test1 = new TwoDArray(9,1,4,7);
        test1.setArray();
        System.out.println("HERE IS FIRST ARRAY");
       System.out.println(Arrays.deepToString(test1.getArray()));
       
       TwoDArray test2 = new TwoDArray(15, 1, 4, 7);
       test2.setArray();
       System.out.println("HERE IS SECOND ARRAY");
       System.out.println(Arrays.deepToString(test2.getArray()));

       System.out.println("TESTING SUM:");
       System.out.println(Arrays.deepToString(test1.addAnotherMatrix(test2)));

       System.out.println("TESTING SUBSCTRACT:");
       System.out.println(Arrays.deepToString(test1.substractAnotherMatrix(test2)));

       System.out.println("TESTING modify with sum :");
       System.out.println(Arrays.deepToString(test1.modifyMatrix('+',test2)));
       
       System.out.println("TESTING modify with substraction:");
       System.out.println(Arrays.deepToString(test1.modifyMatrix('-',test2)));
    }
}
