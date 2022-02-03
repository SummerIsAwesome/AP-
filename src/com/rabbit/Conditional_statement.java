package com.rabbit;

import java.util.Scanner;

public class Conditional_statement {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int A = input.nextInt();






        /*
        break statement
        Syntax -
               (some conditional statement)
               break;

               what it will do is if the statement is true will break the code there no further code will be executed
         */





        /* If statement
         if (boolean-expression) {
            statement
          }
          Nested If
          We can use multiple 'if' inside one 'if' statement (Make sure to write the statement inside {} and use the correct
          hearchary)

          If - else statement
          if (...) {
          }
          else {
          }
          */

            if (A<10) System.out.println(true);
            else System.out.println(false);

            //  OR

            if (A<10) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }








        /*
        Switch statement

        syntax: switch (Condition){
                    case expression_1 : Statement
                    case expression 2: Statement
                    case expression 3: Statement
                    .
                    .
                    .
                    case expression n: Statement
                    default: statement
                    }

      What it does is, if the case is equal to the switch condition it executes the case and all the
      cases below it
      If non is true the default case will be executed and all the cases below it
      To stop the execution of all the case use break

                  switch (Condition){
                    case expression_1 : Statement
                    break;
                    case expression 2: Statement
                    break;
                    case expression 3: Statement
                    break;
                    .
                    .
                    .
                    case expression n: Statement
                    break;
                    default: statement
                    }







         */


        }

        public static void exercise(String[] args) {
            //Write a program to find wether a given number is even or odd
            Scanner input = new Scanner(System.in);
            int A = input.nextInt();

            switch (A%2){
                case 0:
                    System.out.println("the number is even");
                    break;
                default:
                    System.out.println("the number is odd");
                    break;


            }

        }

    }


