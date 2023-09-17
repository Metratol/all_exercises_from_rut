package eightHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionsFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();
        int k = 0;
        while (true){
            if(k == 1) break;
            String[] input = scanner.nextLine().split(" -> ");
            if(input.length == 2) map.put(input[0],input[1]);
            else if(input[0].equals("search")){
                while(true){
                    String enter = scanner.nextLine();
                    String number = map.getOrDefault(enter,"0");
                    if(number != "0") System.out.println(enter + " -> " + map.get(enter));
                    else if(enter.equals("stop")) {
                        k += 1;
                        break;
                    }
                    else System.out.println("Contact " + enter + " does not exist.");


            }

        }
    }

    }
}
