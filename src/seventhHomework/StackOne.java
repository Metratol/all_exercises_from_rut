package seventhHomework;

import java.util.Scanner;
import java.util.Stack;

public class StackOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Stack<Character> line = new Stack<Character>();
        for (int i = 0; i < word.length(); i++) {
            line.push(word.charAt(i));
        }
        String out = "";
        while (line.size() != 0) {
            out += line.pop();


        }
        System.out.println(out);
    }
}