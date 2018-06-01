package com.company;


import java.util.Random;

public class Main
{
    public static void main( String[] args )
    {
        //Variable declaration
        int dienumber;
        Random rnd = new Random();
        //generating Random number
         dienumber = rnd.nextInt(6) + 1;

         //Printing random Number
         System.out.println("Your die roll was : " + dienumber);
    }
}