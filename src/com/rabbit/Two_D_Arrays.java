package com.rabbit;

import java.util.Arrays;

public class Two_D_Arrays {
    //when we need to store something like a table we create that
    public static void main(String[] args) {

        int [][] number = new int[2][3];// here we have  initialized an array with 2 row and 3 colum
        number [0][0] = 5;//the number in 0 row and 0 colum is 5
        number[1][0]=2;// the number in first row and 0 colum is 2
        //          the whole upper thing can be written as
        int [][] integers = {{1,2,534,5,3}
                            ,{124,5,34,53,},
                             {1,2,423,7}};// this is a two dimension array with first row element as
                                            //the first part and second row element as the second one and so on


        System.out.println( integers  [2][1]);// gives the element at the third row and second colum.
        System.out.println(Arrays.deepToString(integers));//prints a two dimension array
        int a = integers.length;// gives the number of rows in the 2D array
        int b = integers[0].length;// gives the number of element in the first row (ie. in the number given)






    }

//    public static int print_the_array(int number [][])

}
