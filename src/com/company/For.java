package com.company;

public class For {
    public static void main(String[] args) {
        for (int index6 = 1; index6 <= 10; index6 += 1) {
            if (index6 % 2 == 1) {
                System.out.println(index6 + "은 홀수 입니다.");
            } else {
                System.out.println(index6 + "은 짝수 입니다.");
            }
            String oddEven = index6 % 2 == 1 ? "홀수" : "짝수";
            System.out.println(index6 + "은 "+ oddEven +" 입니다.");
        }

    }
}
