package com.rabbit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {





            /*
            Break and Continue statement in loops


            The 'break' terminates the loop once a certain condition has been met.
            The 'continue' resets the loop without executing the code under it until the condition for the 'continue'
            is ture

             */

        //example of continue
        for (int i = 1; i<=10; i++){
            if (i%2==0)
                continue;//Here the 'continue' statement resets the loop to star with the without executing the
            // sout thing until its true.
            //System.out.println(i);
        }








            /*

            //for loop
            /*
            Syntax -
                    for(variable; condition; change) **( The variable can be initialised outside the loop and the
                                                         syntax will look like this    /for ( ; condition; change)/
                    {
                    code
                    }

             */
        int a= 1;
        int b = 0;
        for(;a<=10;a++)
        {
            b = b +a;
        }
        System.out.println(b);

        //OR

        int c = 0;
        for(int i=1;i<=10;i++)//the variable is initiated inside the loop
        {
            c = c +i;
        }
        System.out.println(b);








        // While loop
        int i = 1;// The condition
        while (i<=2) {//the condition are put on i as till the while statement is true the body of the while
            // function will be excitctied
            System.out.println("hello ");
            i++;// i is increased by one every time the cycle is completed
            //In while loop the variable is initiated outside the loop so, we can use it outside
        }








        //Do while loop
        int I = 1;// the variable is initiated
        do{// do the following command
            System.out.println("hello");//   This command
            I++;// The change has been assigned
        }while(I<=2);// while this condition is ture
        //In do while loop the variable is initiated outside the loop so, we can use it outside


    }
}



