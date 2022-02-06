package com.rabbit;


// This link contains the video explanation:--  https://youtu.be/r0SewFmbCUI


import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class Important_points {
    public static void main(String[] args) {
// the return type si void so it won't return any value


        /*
        Scope of a variable:--
                It is the part of the program where the variable can be used
                example:- A variable initiated in a for loop can only be used inside the for loop
                          so the scope of the variable is the body of the for loop

                          a variable created in the main body of the code can be used for that point
                          to the end of the body so that is the scope of that variable.

                Also, a variable defined inside a method is called a local variable

                The scope of a local variable starts for its declaration and continue to the end of the bock
                that CONTAINS the variable

                A local variable must be declared and assigned a value before it can be used

                Parameters are also local variables whose scope it the whole method


         */




        /*
          Just watch the video from the link https://youtu.be/r0SewFmbCUI



         */


        //Example
     //   System.out.println(sum(7,9));// the argument is 7,9 that are the actual values given to the parameters
        //System.out.println(condition(7,9));
        System.out.println(sayhi());
        System.out.println(sayhi("shashank"));
    }

    public static int sum(int x , int y)// the bracket is called the parameter
     {
        return x+y;
    }

    public static boolean condition(int x, int y) {
        // we use the variable x,y again as the scope of the varible in the previous method ended
        if (x>y)return (true);
        else return (false);

    }

    public static String sayhi() {
        return   ("hi");

    }

    public static String sayhi(String a) {
        return ("hi " + a);

    }
}
