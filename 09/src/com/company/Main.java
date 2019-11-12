package com.company;

public class Main {

    public static void main(String[] args) {
        int negative = 0;
        int positive = 0;
        int zero = 0;
        int[] arr = new int[]{-1, 5, 0, 8, 4, -8, 0, -5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {

                negative += 1;
            } else {
                if (arr[i] > 0) {

                    positive += 1;
                } else {
                    if (arr[i] == 0) {

                        zero += 1;
                    }
                }
            }
        }
        System.out.println("negative num = " + negative + "; positive num = " + positive + "; zero num = " + zero);
    }
}
