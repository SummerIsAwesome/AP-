package com.rabbit;

import java.util.Arrays;

public class array {
    public static void printarray(int[] numbers) {
        for (int i = 0 ; i< numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
    }


    // variable length argument list
    public static int sum(int... numbers) //here the (int...) initialised a variable array sort of thing
                                          //that is stored inside the array named 'nubmers'
    /*
       1. only one variable length argument list can be passed in one method
       2. the variable argument list must be the last parameter any other parameter must be before it
       3. we can pass an array or a variable number to the of the argument of the method to a variable length
          argument
       4. when we invoke a method with variable argument, java creates an array and passes the argument in
          it
     */
    {
        int sum = 0;
        for (int i= 0; i< numbers.length;i++){
            sum = sum + numbers[i];
        }
        return sum;

    }


    public static void main(String[] args) {
        // An array stores a collection of same data types

//        System.out.println(sum(1,4,32,43,55,7));// here we used variable numbers there
//        System.out.println(sum(new int [] {1,4,25,35,}));// we can pass any type of array as well
        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        System.out.println(a[0]);
        char b [] ={'a','c','s',};
       // printarray(a);

         // Anonymous arrays when the array is created right then and there
        // ie an array without a variable referencing it
        System.out.println(new int[] {5,3,3}   );













        // Array class
        // we will create an array to take the example
        char string [] = {'a','s','d','g','r'};
        String []strings  = {"dfa","ste","dge","sge","rge"};
        int numbers []  ={ 1,2,4,2,5,46,4,};
         int length = numbers.length;// gives the length of array

        //sorting a array
        Arrays.sort(numbers); // this sorts the numbers in the array in increasing order
                              // we can pass the starting and the end point from where we want to sort the array
        Arrays.sort(numbers, 3 ,4);
        Arrays.sort(string);// sorts the alphabets (uses the unicode encoding values to sort )
        Arrays.sort(strings);// sorts the

            //binary search
        //for it to work the array must be sorted first
        Arrays.binarySearch(numbers,5);// return the index of the array if exists
                                           // else returns the expected place of the -(array + 1)
        System.out.println( Arrays.binarySearch(numbers,9));

            // comparing to arrays
        Arrays.equals(a,numbers);// if all the elements of the both arrays are same then true else false
                                 // it works with all data types like string, int, point, char e
 //     System.out.println(a.equals(numbers)); comparres if a is = to numbers



        //fill array method
        Arrays.fill(a,2,5,4);// fill the value(val) in all the index from 2 to 5
     //   printarray(a);

        //printing an array
        // we can use toString method
        System.out.println(Arrays.toString(numbers));// to print the values stored inside an array


         }
}
