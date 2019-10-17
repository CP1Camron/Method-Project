package com.LickingHeights;

public class Main {

    public static void main(String[] args) {


        printGreetings("Pizza");
        printGreetings("Burgers");
        printGreetings("Cookies");
        printGreetings("Fries");

        printIDontLike("Vegetables");
        printIDontLike("Sitting in a car for hours on end");
        printIDontLike("Being bored");

        int a = 76;
        int b = 12;
        System.out.println(add(a,b));
        int c= add(a,b);
        int d= add(c,a);
        System.out.println(d);
        makeNumber9000(d);
        System.out.println("outside of the method after it is called: "+d);

    }



    public static void printGreetings(String noun){
        System.out.println("I really like " +noun);


    }

    public static int add(int firstNumber, int secondNumber){


        return firstNumber + secondNumber;


    }

    public static int makeNumber9000(int number) {
        System.out.println("before number changes: " + number);
        number = 9000;
        System.out.println("after number changes: " + number);
        return number;
    }

    public static void printIDontLike(String noun){
        System.out.println("I really don't like "+ noun);
    }


}









