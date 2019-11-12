package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[]{2, 5, 4, 3, 5, 2, 5, 4, 2, 3, 3, 2, 2, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                sum += 1;
            }
        }
        System.out.println(sum + " человек ко второму экзамену не допускается");
    }
}

