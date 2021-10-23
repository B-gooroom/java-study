package com.company;

public class Array {
    public static void main(String[] args) {
        // 배열 Create
        int[] array1 = {};
        int[] array2 = {0, 1, 2};
        int[] array3 = new int[10];

        // 배열 Read
        int a1 = array2[0];
        int a2 = array2[1];
        System.out.println(array2[2]);

        // 배열 Update
        array3[0] = 3;
        array3[1] = array2[1];
        array3[2] = array3[1];

        // 배열 Delete
        if (args.length > 0) {
            System.out.println(args[0]);
        }
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
