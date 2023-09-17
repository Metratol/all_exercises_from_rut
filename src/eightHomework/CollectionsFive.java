package eightHomework;

import java.util.*;

public class CollectionsFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,String>> map = new TreeMap<>();
        String member = "";
        while(true) {
            String[] input = scanner.nextLine().split(", ");
            if (input[0].equals("Revision") && input.length == 1) {
                break;
            }
            member += input[1] + " ";
            if(map.containsKey(input[0])) map.get(input[0]).put(input[1],input[2]);
            else {
                map.put(input[0], new TreeMap<>());
                map.get(input[0]).put(input[1],input[2]);
            }
        }
            String[] brain = member.split(" ");
        for(int i = 0;i < brain.length; i++);
           for(String k: map.keySet()){
               System.out.println(k + " ->");
               for(int i = 0;i < brain.length; i++){
                   if(map.get(k).get(brain[i]) != null) {
                       double cost = Double.parseDouble(map.get(k).get(brain[i]));
                       System.out.println("Product: " + brain[i] + ", Price: " + String.format("%.1f",cost).replace(",","."));
                   }
                   }
           }

    }
}
