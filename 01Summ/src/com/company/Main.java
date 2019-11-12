package com.company;

public class Main {

    public static void main(String[] args) {
        int mass[] = new int[]{1, 12, 3, 36, 5, 10, 20};
        int divider = 2;
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % divider == 0) {
                sum = sum + mass[i];
            } else {
                sum = sum + 0;
            }

        }
        System.out.println(sum);
    }

}
