package seventhHomework;

import java.util.Scanner;
import java.util.Stack;

public class StackTwo {
    public static void main(String[] args) {
        String output = "";
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Stack<Character> line = new Stack<Character>();
        while(number != 0) {
            output += String.valueOf(number % 2);

            number = number / 2;
        }

        for(int i = output.length() - 1; i >= 0; i--){
            line.push(output.charAt(i));
            System.out.print(output.charAt(i));
        }

    }
}
