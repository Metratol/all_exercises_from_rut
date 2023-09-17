package com.company;

import java.util.Scanner;
/*
public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] arrive = new int[count];
        int sum = 0;
        for(int i = 0; i < count; i++){
            int passengers = Integer.parseInt(scanner.nextLine());
            sum += passengers;
            arrive[i] = passengers;
        }
        for( int i = 0; i < arrive.length; i++){
            if (i == arrive.length - 1)
                System.out.println(arrive[i]);
            else
                System.out.print(arrive[i] + " ");
        }
        System.out.print(sum);
    }
}*/


public class TaskOne{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        String[] ms = scanner.nextLine().split(" ");
        int[][] array = new int[n][m];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                array[i][j] = Integer.parseInt(ms[i*m + j]);
                if (array[i][j] < min)
                    min = array[i][j];
            }
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (j == array[i].length - 1)
                    System.out.print(array[i][j]);
                else
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(min);
    }
}