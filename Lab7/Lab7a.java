//Peter Boldyrev / CSSSKL 142 // Feb 23

import java.sql.Array;
import java.util.Arrays;

public class Lab7a {
    public static void main(String[] args){

        //test arrays
        double [] someArr = {2.5,6.4,3.5,7.6,3.8,6.7};
        double [] sortedArrTest = {2.5,3.7,5.7,6.8,6.9,7.4};
        int [] testArr1 = {3,8,5,6,5,8,9,2};
        int [] testArr2 = {5,15,4,6,7,3,9,11,9,3,12,13,14,9,5,3,13};
        int [] testArr3 = new int[testArr1.length];
        int [] list = {3,8, 19, 7};
        int [] list2 = {18, 7, 4, 24, 11};
        //Part A
        
        //1
        
        System.out.println(median(someArr));

        //2
        System.out.println(isSorted(sortedArrTest));

        //3
        findCommon(testArr1, testArr2, testArr3);

        //4
        rotateRight(list);

        //5
        System.out.println( count(testArr2,5));

        //6
        System.out.println(Arrays.toString(stretch(list2)));


        //end of main
        

    }


    //PART A
    //1
    public static double median(double [] array){
        double medianNum =0;
        //determine length
        if(array.length%2==0){
            medianNum = (array[array.length/2]+array[(array.length/2)-1])/2;
        }
        else{
            medianNum=array[(array.length-1)/2];

        }
        return medianNum;
        //enf of median
    }


    //2

    public static boolean isSorted(double [] array){
        int counter=0;
        boolean sorted = false;
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                counter++;
            }
        }

        if(counter==array.length-1){
            sorted=true;
        }
        else{
            sorted=false;
        }
        return sorted;
        //end of isSorted
    }

    //3
    // int [] testArr1 = {3,8,5,6,5,8,9,2};
    // int [] testArr2 = {5,15,4,6,7,3,9,11,9,3,12,13,14,9,5,3,13};
    //3 5 6 9 0 0 0 0
    // [3, 0, 5, 6, 5, 0, 9, 0]
    public static void findCommon(int[] arr1, int[] arr2,int[] arr3){
        if(arr1.length<arr2.length){
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                       arr3[i]=arr1[i];
                    }
               
                   
                }
                
            }
        }
        else{
            System.out.println("I was lazy to mirror the method so please enter first array shorter than second :) ");
        }
        
//remove duplicates from array
        for(int i=arr3.length-1;i>=0;i--){
           for(int j=i-1;j>0;j--){
               if(arr3[i]==arr3[j]){
                   arr3[i]=0;
               }
            
            }
           }

       
           //removing zeros:
           for(int i=arr3.length-1;i>=0;i--){
               if(arr3[i]==0){
                   arr3[i]=arr3[arr3.length-1];
               }
           }
        

        //putting zeroes to the end:creating a new array, setting a new index, looping through arr3 and 
        //if element of arr3 is not zero, setting it as element for final array and then raise new index by one
        //since java defaults int array values to zero, everything else will be zero for the length of final array which is = arr3.length

           int [] arrFinal = new int[arr3.length];
           int newInd = 0;

           for(int i=0;i<arrFinal.length;i++){
               if(arr3[i]!=0){
                   arrFinal[newInd]=arr3[i];
                   newInd++;
               }
           }
        System.out.println(Arrays.toString(arrFinal));
        //end of findCommon
    }

    
    //4 catching first element of the array and then adding back at the end
    
    public static void rotateRight(int [] someArr){
      int temp = someArr[0];
        for (int i=someArr.length-1;i>0;i--){
    
               if(i==someArr.length-1){
               
                someArr[0]=someArr[i];
               }
               
               someArr[i]=someArr[i-1];
            
               
                    
                
               System.out.println(someArr[i]);
               
        }
       someArr[1]=temp;
        System.out.println(Arrays.toString(someArr));
    }

    //5
    public static int count(int [] someArr, int occurences){
        int counter = 0;
        for(int i=0;i<someArr.length;i++){
            if(someArr[i]==occurences){
                counter++;
            }
        }
        return counter;

        //end of count
    }

    public static int[] stretch(int[] someArr){
        int [] resArr = new int[(someArr.length)*2];
        int tempA;
        int tempB;

        
            for (int j = 0, i = 0; j<someArr.length;j++,i=i+2){
                if(someArr[j]%2==0){
                    tempA=tempB=(someArr[j]/2);
                    resArr[i]=tempA;
                    resArr[i+1]=tempB;
                }
                else{
                    tempA=someArr[j]/2;
                    tempB = someArr[j]-(tempA);
                    resArr[i]=tempA;
                    resArr[i+1]=tempB;
                }
            }
        

       
        return resArr;
    }

    //end of class
}
