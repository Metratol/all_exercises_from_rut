package com.company;

import java.util.Scanner;

/*public class TaskFour {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // ввод целочисленного массива в строку
    String enter = scanner.nextLine();
    String[] numbers = enter.split(" ");
    int[] arrive = new int[numbers.length];
    String output = "";
    for (int i = 0; i < numbers.length; i++)
        arrive[i] = Integer.parseInt(numbers[i]);



    for (int i = 0; i < arrive.length; i++) {
        int k = 0;
        for (int y = 0; y < arrive.length; y++) {
            if ((arrive[i]) > arrive[y])
                k += 1;
            if (k == arrive.length - y)
                output += numbers[i] + " ";
            k = 0;
        }
    }
    output += numbers[numbers.length - 1];
    System.out.println(output.stripTrailing());
  }
}*/


public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        int triangle = 0;
        for (int i = 0; i < 2; i++) {
            String[] enter = scanner.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = Integer.parseInt(enter[j]);
                triangle = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            }
        }
    System.out.println(triangle);
    }
}