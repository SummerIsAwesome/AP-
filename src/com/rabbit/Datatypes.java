package com.rabbit;

public class Datatypes {
    public static void main(String[] args) {


//        Integer data type

        byte NUmber = 5;
//          The byte fnction stores the integer value of in the range(-128,127)
//          The memory allocated is 1 bites (One bite is equal to 8 bits)
        System.out.println(NUmber + 10);

        short NUMber = 5;
//        The short function stores the value in the range (-32768,32768)
//        The memory allocated is 2 bites (One bite is equal to 8 bits)
        System.out.println(NUMber + 10);

        int Number = 5;
//        The int function stores the integer value of in a long range
//        The memory allocated is 4 bites (One bite is equal to 8 bits)
        System.out.println(Number + 10);

        long NUMBer = 5L;
//            The long function storest the integer value in a very large range (9*10^19) we
//            use L to tell the compiler that the input is a long
//            The memory allocated is 8 bites (One bite is equal to 8 bits)
        System.out.println(NUMBer + 10);


//        byte < short < int < long
//        we can store all the short value in a longer function ex- 5 can be stored in the long the 5 will be
//        converted in byte

//                        Calculating the range of a variable
//                Formula is    [- 2^(No. of Bits -1) , 2^(No. of Bits -1) -1  ]


//        Float data Type


        double digit = 5.0;
        System.out.println(digit);
//        Size of double is 8 byte
//        range is (-1.7979.....*10^308 , 1.797....*10^308
//        smallest double is 4.9* 10%^-324   (It's very presize


        Float Digit = 10.0F;
        System.out.println(Digit);
//        Since double is larger than float every float is a double, so we need to type F at the end to make it float
//        We can store a integer in a float as every integer is a float, though it will be be the int.0
//        Float take 4 bites in memory




//        Char data type
        char c1 = 65;
        System.out.println(c1);
//        char show the










//        Boolean data type
        boolean b1 = 3 > 2;
        System.out.println(b1);
//        boolean show wether a statement is ture or false
        if (b1)
            System.out.println("You are good");
        else
            System.out.println("you are wrong");
//











        //We can print a 'int' or a 'double' or a 'float' or a 'char' be  using :-
        // System.out.printf( "To include a 'int' use %d or %f for float or %c for char or %s for string")
        // System.out.format( "To include a 'int' use %d or %f for float or %c for char or %s for string")


//        String data type
//        The string name.something are the string methods and they are like modifiers to the string
        String a = "helloh";
        //The string is inmutable ie if we use something like tolowercase the string 'a' won't change

        //To do operation on string
        int b = a.length();// gives the length of the string
        a.toLowerCase();//converts all the upper cases to lowercase
        a.toUpperCase();//converts all the lower cases to uppercase
        a.trim();// returns the string after removing all the leading and trailing zeros
        a.substring(5,7);//returns all the characters between the character of the given index. like in "shashak"
        //substring(5,7) will return ak
        a.repeat(5);// repeats the string the given number of times
        a.replace('h','f');// swaps the two characters (we can replace on character with multiple as well
        a.startsWith("h");// if the string starts with the given character gives true else false
        a.endsWith("h");// if the string end with the given character gives true else false
        a.charAt(4);// gives the character at the given index
        a.indexOf("h");  ;// gives the first index of the given character
        a.indexOf("h",4);  ;// gives the first index of the given character after the given index
        a.equals("helloh");//gives true if the given string matches with the 'a' string
        a.equalsIgnoreCase("HElloH");// gives true if the given string matches with the 'a' string
        //ignores cases
        System.out.println(a.hashCode());



        // Escape sequence character
        /* These commands helps to write code withing a string like inside "" they are started with a '\'
        \n inserts a new line
        \t inserts a tab space
        \'inserts a '
        \\inserts a \
        \b inserts a backspace in the text



          */

    }

}



















































