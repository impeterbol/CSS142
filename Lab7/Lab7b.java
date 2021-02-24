//Peter Boldyrev / CSSSKL 142 // Feb 23

import java.util.Random;//generate random number - note to self - found how to generate random number with Random class here https://mkyong.com/java/java-generate-random-integers-in-a-range/
import java.util.Scanner;

import com.apple.eawt.event.RotationEvent;

import java.util.Arrays; // this helps printing an array

public class Lab7b {
    public static void main(String[] args){

        //testing array
        int [][] someArr= {{7, 6, 5, 6, 7}, {4, 1, 1, 7, 3}, {6, 5, 7, 1, 7}, {5, 2, 3, 6, 1}, {3, 5, 2, 5, 6}};
        int[][] allneg = { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} };
        int[][] nonsquare ={ {1,2,3}, {4,5}, {6,7,8,9} };
        int[][] latin = { {1,2,3}, {2,3,1}, {3,1,2} };
        int[][] notlatin = { {2,1,3}, {2,3,1}, {3,1,2} };
        int [] test1 = {2,1,3};
        int [] test2 = {2,2,3};
        //PART B
        
        //1
        System.out.println(Arrays.deepToString(random(5, 1, 7)));
        
        //2
        System.out.println(rowSum(someArr, 0));

        //3
        System.out.println(colSum(someArr, 0));

        //4
        System.out.println(isSquare(someArr));

        //5
        // note to self - another way of solving https://stackoverflow.com/questions/36608689/in-java-i-have-to-check-if-a-given-matrix-is-a-latin-square-or-not
        System.out.println(isLatin(latin)); 

     
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


    //5

    public static boolean isLatin(int [][] a){
        int counter = 0;

       for(int i=0;i<a.length-1;i++){
       
           if(!(arrayEqual(rotatedLeft(a[i]), a[i+1]))){
            counter++;
           }
       }

       if(counter==0){
           return true;
       }
       else{
           return false;
       }
       
       
        //end of isLatin
    }


    public static int[] rotatedLeft(int [] arr){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
     
        return arr;
    }

    public static boolean arrayEqual(int [] arr1, int[] arr2){
        // System.out.println(Arrays.toString(arr1));
        
        // System.out.println(Arrays.toString(arr2));
        boolean theyEqual = true;
        int counter=0;
        
        for(int i=0;i<arr1.length;i++){
            
                if(arr1[i]!=arr2[i]){
                    // System.out.println(arr1[i]);
                    // System.out.println(arr2[i]);
                    counter++;
                }
          
        }

        if(counter!=0 ||arr1.length!=arr2.length ){
            theyEqual=false;
        }
        else{
            theyEqual =true;
        }
        // System.out.println(theyEqual);
        return theyEqual;
    }
    //end of class




}
