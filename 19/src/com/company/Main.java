package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("{ ");
        int arr[] = new int[]{8, 18, 87, 63, 14, 78, 69, 14, 89, 87, 78, 98, 55, 87, 36, 14, 52, 68};
        for (int i = 1; i < arr.length; i = i * 2) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }
}

