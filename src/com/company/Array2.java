package com.company;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {};

        // quiz1
        if (arr1 == arr2) {
            String result = "참";
            System.out.println(result);
        } else {
            String result = "거짓";
            System.out.println(result);
        }
        // int quiz2 = arr1[5];
        // quiz3
        // arr1[5] = 10;

        int[] testArray1 = {1, 2, 3, 4, 5};
        int total1 = testArray1[0];
        total1 = total1 + testArray1[1];
        total1 = total1 + testArray1[2];
        total1 += testArray1[3];
        total1 += testArray1[4];
        int multiply1 = testArray1[0] * testArray1[1] * testArray1[4];

    }
}
