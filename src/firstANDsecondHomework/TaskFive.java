package com.company;

import java.util.Scanner;
/*public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ввод целочисленного массива в строку
        String enter = scanner.nextLine();
        int check = Integer.parseInt(scanner.nextLine());
        String[] numbers = enter.split(" ");
        String output = "";
        int k = 0;
        int[] arrive = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            arrive[i] = Integer.parseInt(numbers[i]);


        for (int i = 0; i < arrive.length; i++) {
            output = "";
            int a = 0;

            for (int y = 0; y <= i; y++) {
                if (arrive[y] + arrive[i] == check) {
                    output = arrive[y] + " " + arrive[i];
                    System.out.println(output);
                }
            }

        }

    }
}*/



import java.util.Scanner;


public class TaskFive {

    public static int a = 0;
    public static void func(int[][] arr) {
        int number;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0)
                    number = arr[i][j];
                else
                    number = -arr[i][j];
                int[][] new_array = new int[arr.length - 1][arr.length - 1];
                for (int k = 0; k < arr.length; k++) {
                    for (int m = 0; m < arr.length; m++) {
                        if (k == 0)
                            continue;
                        else if (m == j)
                            continue;
                        else if (m > j)
                            new_array[k - 1][m - 1] = arr[k][m];
                        else
                            new_array[k - 1][m] = arr[k][m];

                    }
                }

                if (new_array.length == 2)
                    a += (number * func2(new_array));
                else
                    func(new_array);
            }
        }


    }

    public static int func2(int[][] new_arr) {
        return new_arr[0][0] * new_arr[1][1] - new_arr[0][1] * new_arr[1][0];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] enter = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(enter[j]);

            }
        }
        if (n > 2) {
            func(matrix);
            System.out.println(a);
        }
        else{
            func2(matrix);
            System.out.println(a);
        }
        }

}