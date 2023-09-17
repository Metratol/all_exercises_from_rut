package eightHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passengers = scanner.nextLine().split(" ");
        int limit = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>(Arrays.asList(passengers));
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("Add"))
                list.add(input[1]);
            else if (input[0].equals("End"))
                break;
            else {
                for (int i = 0; i < list.size(); i++) {
                    int number = Integer.parseInt(list.get(i)) + Integer.parseInt(input[0]);
                    if (Integer.parseInt(list.get(i)) + Integer.parseInt(input[0]) <= limit) {
                        list.remove(i);
                        list.add(i,String.valueOf(number) );
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}