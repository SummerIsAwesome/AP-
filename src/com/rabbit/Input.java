package com.rabbit;

import java.util.Scanner;
// The java.util.Scanner is a library that help's to take input

public class Input {
    public static void main(String[] args) {
/*        Instantiating an object
 Format is          ClassName objectName = new ClassName(parameters);


 Here the Scanner is a class and we hava assigned input the object name which we will call when needed
 when sc is called a new object is created which take the input as parameter ( That's why there is a system.in)

 A very common example is a string though we don't use new with string as it is very much use we can use a new there as well


 The "new" key word is used to create or instantiate object of classes
 The "new" key word allows us to create a separate object that references a separate value\

 The "System.in" is just like "System.out" difference being in "in" we take input from user
*/


        Scanner input = new Scanner(System.in);


        int a = input.nextShort(); //This reads an integer given by the user
        String b = input.next(); //This only reads the first string given ex- alex
        String d = input.nextLine();//This reads the whole line given by the user
        boolean c = input.hasNextInt();
////        The has.NextInt() tells wethere the user input is a integer or not

        System.out.println(c);


    }
}







