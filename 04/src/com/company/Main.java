package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{-5, 0, 5, -5, 25, 89,98};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("down");
            } else {
                if (arr[i] < arr[i+1] ){
                    System.out.println("up");
                }

            }
        }
    }
}
