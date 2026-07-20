package com.activity;

import java.util.Arrays;
import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        System.out.println("URK23CS1241");

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        System.out.println("Enter 10 elements:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array after removing duplicates:");

        System.out.print(arr[0] + " ");

        for (int i = 1; i < 10; i++) {

            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
