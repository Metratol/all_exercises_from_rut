package com.company;

import java.util.Scanner;

/*public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String[] mas = st.split(" ");
        st = scanner.nextLine();
        String[] mas_two = st.split(" ");
        String result = "";

        for( int i = 0; i < mas_two.length; i++){
            for(int y = 0; y < mas.length; y++){
                if (mas_two[i].equals(mas[y]))
                    result += (mas_two[i] + " ");

            }
        }
        System.out.println(result.stripTrailing());
    }
}*/
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int lng = 3;
        int[][] train = new int[count][lng];
        int passengers = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        int k = 0;
        for(int i = 0; i < count; i++) {
            String[] enter = scanner.nextLine().split(" ");
            for (int j = 0; j < lng; j++) {
                  train[i][j] = Integer.parseInt(enter[j]);;
            }
        }

        int number = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < count; i++){
                first = train[i][0];
                second = train[i][1];
                third= train[i][2];
                if(first == number)
                    passengers += third;
                else
                    k = 1;
        }

        if(k == 1)
           System.out.println("Error") ;
        else
            System.out.println(passengers);
    }
}