package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[]=new int[]{0,25,32,9,0,5,0,20,0};
        int sum =0;

        for (int i =0; i<arr.length; i++){
            if (arr[i]==0){
                sum =sum+i;
            }else {
                sum = sum+0;
            }
        }
        System.out.println(sum);

    }
}
