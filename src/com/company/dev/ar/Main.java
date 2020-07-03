package com.company.dev.ar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[8];

        System.out.println("enter 8 elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("enter next elements ");
        }
        int[] myArray = sort(array);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i + " index and number of elements " + array[i]);
        }

        System.out.println(sort(array));


    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

}


