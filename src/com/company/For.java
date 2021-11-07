package com.company;

public class For {
    public static void main(String[] args) {
        // for (int index6 = 1; index6 <= 10; index6 += 1) {
        //     if (index6 % 2 == 1) {
        //         System.out.println(index6 + "은 홀수 입니다.");
        //     } else {
        //         System.out.println(index6 + "은 짝수 입니다.");
        //     }
        //     String oddEven = index6 % 2 == 1 ? "홀수" : "짝수";
        //     System.out.println(index6 + "은 "+ oddEven +" 입니다.");
        // }

        // int index7 = 0;
        // for (; index7 < 3; index7++) {
        //     final int blockInt = index7;
        //     System.out.println(blockInt);
        // }
        // System.out.println(index7);

        int total1 = 0;
        int index8 = 0;
        for (; index8 < 5; index8++) {
            total1 += index8+1;
        }
        int avg1 = total1 / index8;
        System.out.println(total1);
        System.out.println(avg1);
    }
}
