package com.activity;

import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        System.out.println("URK23CS1241");

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[15];

        System.out.println("Enter 15 elements:");

        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 15; i++) {

            if (arr[i] == key) {

                System.out.println("Element found at position " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
