package com.rabbit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        if and else statement in java
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        if (a<=10){
            System.out.println("This input is less than or equal to 100");
        }
        else System.out.println("this statement is more than 100");
/*
                   Types of loops
                   for loops
                   while loop
                   do while loop
*/

        // While loop
        int i = 1;// The condition
        while (i<=2) {//the condition are put on i as till the while statement is true the body of the while function will be excitctied
            System.out.println("hello ");
            i++;// i is increased by one every time the cycle is completed
        }



        //Do while loop
        int I = 1;// the condition is started
        do{// do the following command
            System.out.println("hello");//   This command
            I++;
        }while(I<=2);// while this condition is ture


    }
}




