package com.rabbit;

import java.util.Locale;

public class string {
    public static void main(String[] args) {
        //We can print a 'int' or a 'double' or a 'float' or a 'char' be the using
        // System.out.printf( "To include a int use %d or %f for float or %c for char or %s for string")
        // System.out.format( "To include a int use %d or %f for float or %c for char or %s for string")
        String a = "helloh";
        //The string is inmutable ie if we use something like tolowercase the string 'a' won't change

        //To do operation on string
        a.length();// gives the length of the string
        a.toLowerCase();//converts all the upper cases to lowercase
        a.toUpperCase();//converts all the lower cases to uppercase
        a.trim();// returns the string after removing all the leading and trailing zeros
        a.substring(5,7);//returns all the characters between the character of the given index. like in "shashak"
                       //substring(5,7) will return ak
        a.replace('h','f');// swaps the two characters (we can replace on character with multiple as well
        a.startsWith("h");// if the string starts with the given character gives true else false
        a.endsWith("h");// if the string end with the given character gives true else false
        a.charAt(4);// gives the character at the given index
        a.indexOf("h");  ;// gives the first index of the given character
        a.indexOf("h",4);  ;// gives the first index of the given character after the given index
        a.equals("helloh");//gives true if the given string matches with the 'a' string
        a.equalsIgnoreCase("HElloH");// gives true if the given string matches with the 'a' string
                                                 // ignores cases



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
