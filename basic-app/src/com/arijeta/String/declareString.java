package com.arijeta.String;
import java.io.*;
import java.lang.*;
public class declareString {
    public static void main(String[] args) {
        // Declare String without using new operator
        String s="Geeksforgeeks";

        //Print the String
        System.out.println("String s=" + s);

        // Declare String using new operator
        String s1 = new String("GeeksforGeeks");

        // Prints the String.
        System.out.println("String s1 = " + s1);
    }
}
