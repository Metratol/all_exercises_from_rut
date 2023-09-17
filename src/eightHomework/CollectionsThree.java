package eightHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String[] input = scanner.nextLine().split(", ");
            if(input[0].equals("END")) break;
            else if(input[0].equals("IN")) {
                if(list.contains(input[1])) continue;
                else list.add(input[1]);
            }
            else if(input[0].equals("OUT")) list.remove(input[1]);

        }
        if(list.size() > 0){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
        else System.out.println("Parking Lot is Empty");
    }
}
