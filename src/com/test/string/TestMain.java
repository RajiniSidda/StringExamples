package com.test.string;

/**
 * Created by bhara on 7/23/2018.
 */
public class TestMain {

    public static void main(String[] args) {
        System.out.println("This is a String example");

        String a = new String("Hello");
        String b = "hello";
        String c = new String("hello");

        System.out.println("a eqs b = "+a.equals(b));
        System.out.println("a eqs c = "+a.equals(c));
        System.out.println("b eqs c = "+b.equals(c));

    }
}
