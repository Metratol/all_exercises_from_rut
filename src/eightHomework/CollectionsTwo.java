package eightHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionsTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passengers = scanner.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(passengers));
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("End"))
                break;
            else if (input[0].equals("Add"))
                 list.add(list.size(), input[1]);

            else if (input[0].equals("Insert")) {
                if (Integer.parseInt(input[2]) > list.size() || Integer.parseInt(input[1]) <= 0 ) System.out.println("Invalid index");
                else list.add(Integer.parseInt(input[2]),input[1]);
            }
            else if (input[0].equals("Remove")){
                if (Integer.parseInt(input[1]) > list.size() || Integer.parseInt(input[1]) <= 0 ) System.out.println("Invalid index");
                else list.remove(Integer.parseInt(input[1]));
            }
            else if ((input[0] + input[1]).equals("Shiftleft")) {
                for (int i = 0; i < Integer.parseInt(input[2]); i++) {
                    String member = list.get(0);
                    for(int y = 0; y < list.size();y ++){
                    if ( y > 0 && y < list.size()-1) {
                        list.set(y - 1, list.get(y));
                        list.set(y, list.get(y+1));

                    } else {
                        list.set(y, member);

                    }
                    }
                }
            }
            else if ((input[0] + input[1]).equals("Shiftright")) {
                for (int i = 0; i < Integer.parseInt(input[2]); i++) {
                    String member = list.get(list.size() - 1);
                    for(int y = list.size()-1; y >= 0;y --){
                        if (y > 0 && y < list.size()-1) {
                            list.set(y+1, list.get(y));
                            list.set(y, list.get(y - 1));
                        } else {
                            list.set(y, member);

                        }
                    }
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}