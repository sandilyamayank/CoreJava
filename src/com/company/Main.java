package com.company;

//IMP -> There exist a default package which automatically gets imported in any java file - java.lang;
import java.util.Scanner;

//Packages --> folder -->Only contains collection of java classes
class Main{
    public static void main(String[] args){
        //How to display messages
        System.out.print("New World ");
        System.out.println("Hello World");

        /*
        Primitive Data types- Byte(-128 - +127) ; short(-32766 - +32767); int, char, boolean, float, double, long
        Take user's custom input
        a . Create an object for Scanner class
        Research work, how to take input as a character and String. and ASCII value.
        char - one single character, 'a','q','w','e'.
        String - combination of characters - 'hello';
        */
        Scanner sc = new Scanner(System.in);

        char c1= 'a';// char is declared using single quote
        //double quote is used for String in Java
        byte var1 = sc.nextByte();
        short var2 = sc.nextShort();
        int var3 = sc.nextInt();


    }
}