package com.company;

public class Variable {
    public static String a = "1";
    public static void main(String[] args) {
        boolean v1 = true;
        int v2 = 100;
        String v3 = "abc";

        // 변수 Read
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // 변수 Update
        v1 = false;
        v2 = -10;
        v3 = "def";

        // 변수 Read
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // 변수 Delete

        int a = 1 , b = 2 , c = 3;

    }
}
