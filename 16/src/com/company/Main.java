package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{255, 552, 557, 755, 324, 423, 756, 657};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");

            } else {
                if (arr[i] % 2 != 0) {
                }
                System.out.println(arr[i]+" ");

            }
        }
    }
}