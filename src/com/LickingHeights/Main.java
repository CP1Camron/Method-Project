package com.LickingHeights;

public class Main {

    public static void main(String[] args) {


        printGreetings("Pizza");
        printGreetings("Burgers");
        printGreetings("Cookies");
        printGreetings("Fries");

        int a = 76;
        int b = 12;
        System.out.println(add(a,b));
        int c= add(a,b);
        int d= add(c,a);
        System.out.println(d);

    }



    public static void printGreetings(String noun){
        System.out.println("I really like " +noun);


    }

    public static int add(int firstNumber, int secondNumber){


        return firstNumber + secondNumber;


    }


}









