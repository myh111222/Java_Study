package com.firstJAVApackage;

import com.sun.source.util.SourcePositions;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Date now = new Date();
        now.getTime();
        String msg = "hahahaha";
        Point point1 = new Point(1, 2) ;
        point1.x = 3;
        int [] numbs = new int[5]; //arrays of 5
        int [] numbs1 = { 100 ,3,45,67,1,9};
        Arrays.sort(numbs1);
        Arrays.toString(numbs1);
        System.out.println("Hello 'World' !" + now +" " +point1.x);
        System.out.println();
        int a =1;
        // Boolean
        int income = 1000;
        boolean state = income > 500;    // return true
        String ClassName = income >500 ?"First_Class":"Economic";   // short way of if statement
        // iteration
        String [] fruits = {"Apple", "Banana", "Cheery", "Durian"};
        for (String fruit:fruits){
            System.out.println(fruit);
        }


//============================================================================================
        ////    Mini Projects :
        ////
        //maths();
        ////    montage calculator
        //mcalculator();
        ////    if/else
        //divisionExercise();


        // write your code here
    }

    public static void maths(){

        int result1 = Math.round(1.1F);
        int result2 = (int)Math.ceil(1.1F);
        int result3 = (int) Math.floor(1.1F);
        int result4 = (int) (Math.random()*100);
        System.out.println(result1 + " " +result2 + " " + result3+ " RAND:"+ result4);
    }

    public static void mcalculator(){
        System.out.println("Welcome to my Mortgage Payments !");
        System.out.print("Your Principal: ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        System.out.print("Your Annual Interest Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Your Period (Years): ");
        int period = scanner.nextInt();

        System.out.println( "Your principal is "+ principal +
                            "\nYour rate is " + rate+
                            "\nYour period is "+ period);
        //double m = ;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Monthly Payment: "+ currency.format(cal(principal,rate,period)) );
    }
    public static double cal(int p, double rate, int period) {
        //montage calculation
        final int MonthInYear = 12;
        final int Percent = 100;
        double r = rate / Percent / MonthInYear;
        int n = period * 12;
        double result = p * r * Math.pow((1.0+r), n) / (Math.pow((1+r),n)-1) ;
        System.out.println(result + "\n");
        return result;
    }

    public static void divisionExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter number, 0 exsit :\n");
        int numb = scanner.nextInt();
        while (numb != 0){
            String prints;
            if (numb % 5 == 0 && numb % 3 == 0 )
                prints ="FizzBuzz";
            else if (numb % 5 == 0)
                prints = "Fizz";
            else if (numb % 3 ==0)
                prints = "Buzz";
            else
                prints = Integer.toString(numb);
            System.out.println(prints);
            numb = scanner.nextInt();
        }


    }
}
