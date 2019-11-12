package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[]{0, -1, -5, 2, 10, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("положительное");
                break;
            } else {
                if (arr[i] < 0) {
                    System.out.println("отрицательное");
                    break;
                }

            }
        }
    }
}
