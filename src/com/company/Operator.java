package com.company;

public class Operator {
    public static void main(String[] args) {
        int int1 = 1;
        int int2 = 2;
        String string1 = "hello";
        String string2 = "hello" + int1;
//        char string2 = 'a';

        int result1 = int1 - int2;
        int result2 = int1 * int2;
        int result3 = int1 / int2;
        int result4 = int1 + int2;

        int salary = 5000000;
        double rate = 3.3;
        double tax = salary * rate / 100;
        double realsalary = salary - tax;

        System.out.println(tax);
        System.out.println(realsalary);

        boolean boolean1 = true;
        boolean boolean2 = true;
//        boolean result6 = boolean1 - boolean2;

        boolean equalBoolean1 = true == true;
        boolean equalBoolean2 = true == false;
        boolean equalInt1 = 1 == 1;
        boolean equalInt2 = 1 == 2;
        boolean equalString1 = "a" == "a";
        boolean equalString2 = "a" == "b";

    }
}
