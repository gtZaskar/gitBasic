package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 15, -8, 78, 500, 0, 15, 36};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            } else {
                if (arr[i] == 0) {
                    break;
                }
            }
        }
    }
}
