import java.util.Random;//generate random number - note to self - found how to generate random number with Random class here https://mkyong.com/java/java-generate-random-integers-in-a-range/
import java.util.Scanner;
import java.util.Arrays; // this helps printing an array

public class Lab7b {
    public static void main(String[] args){

        //testing array
        int [][] someArr= {{7, 6, 5, 6, 7}, {4, 1, 1, 7, 3}, {6, 5, 7, 1, 7}, {5, 2, 3, 6, 1}, {3, 5, 2, 5, 6}};
        
        //PART B
        
        //1
        // System.out.println(Arrays.deepToString(random(5, 1, 7)));
        
        // //2
        // System.out.println(rowSum(someArr, 0));

        // //3
        // System.out.println(colSum(someArr, 0));

        //4
        // System.out.println(isSquare(someArr));

        //5
        System.out.println(isLatin(someArr)); //https://stackoverflow.com/questions/36608689/in-java-i-have-to-check-if-a-given-matrix-is-a-latin-square-or-not


        //end of main
    }

    //1
    public static int[][] random(int n, int start, int end){
        Random randomNum = new Random();
        
        
        int [][] resArr = new int[n][n];

        for(int row = 0;row<resArr.length;row++){
         
            for(int col = 0;col<resArr[row].length;col++){
               
                    int someNum = randomNum.nextInt((end - start) + 1) + start; //generating a random number
                        resArr[row][col]=someNum;
                       
            }
        
    }
     return resArr;

     //end of random
    }

    //2
    public static int rowSum(int[][] a, int i){
        int sum = 0;

        for (int j =0;j<a[i].length;j++){
            sum+=a[i][j];
            // System.out.println(a[i][j]);
        }
        return sum;
        //end of rowSum
    }

    //3
    public static int colSum(int[][] a, int j){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i][j];
            // System.out.println(a[i][j]); 
        }
        return sum;
        //end of colSum
    }

    //4
    public static boolean isSquare(int[][] a){
        int rows = 0;
        int cols = 0;
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a[r].length;c++){
                cols++;
                // System.out.println(a[r][c]+ " ");
            }
            // System.out.println(cols);
            // System.out.println();
            rows++;
        }

       if(rows*rows==cols){
        return true;
       }
        else{
            return false;
        }
        //end of is Square
    }

    public static boolean isLatin(int [][] a){
        

        for(int i = 0; i<a.length;i++){

                //checking rows for duplicates
                for(int row = 0;row<a.length;row++){
                    if(duplicates(row)==false){
                        return false;
                    }
                }

                //checking cols for duplicates
                int [] tempCol = new int[a[i].length];
                for(int col = 0;col<a.length;col++){
                    tempCol[col]=a[col][i];
                }

                if(duplicates(tempCol)){
                    return false;
                }

         }
        
         return true;
        // helper method - checking duplicates in the array (both for rows and cols)
        public static boolean duplicates(int [] arr){
           
            for(int i =0;i<arr.length;i++){
                for(int j=1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        return true;
                    }
                }
            }
            return false;
        
    }

    //end of class




}
