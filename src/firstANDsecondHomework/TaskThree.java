package com.company;

import java.util.Scanner;

/*public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        String[] arrive = enter.split(" ");
        int step = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < step; i++) {
            String member = arrive[0];
            for (int y = 0; y < arrive.length; y++) {
                if(y > 0 && y < arrive.length - 1){
                    arrive [y - 1] = arrive[y];
                    arrive[y] = arrive[y + 1];
                }
                else
                    arrive[y] = member;

            }
        }
        for (int i = 0; i < arrive.length; i++) {
            if (i == arrive.length - 1)
                System.out.println(arrive[i]);
            else
                System.out.print(arrive[i] + " ");
        }
    }
}*/
public class TaskThree {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    matrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == matrix[i].length - 1) {
                    System.out.print(matrix[i][j]);
                    System.out.println();
                }
                else
                    System.out.print(matrix[i][j] + " ");

            }
        }
    }
}
