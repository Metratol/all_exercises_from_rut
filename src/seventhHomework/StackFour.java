package seventhHomework;

import java.util.Scanner;
import java.util.Stack;

public class StackFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> line = new Stack<>();
        int k = 0;
        Stack<String> line2 = new Stack<>();
        while(true){
            String input = scanner.nextLine();
            if(input.equals("print")){
                if(!line2.isEmpty()) {
                    for (int i = 0; i < k; i++) {
                        line.push(line2.pop());
                    }
                    break;
                }
                else break;
            }
            else if(input.equals("cancel")){
                for(int i = 0; i < k;i++){
                    line2.push(line.pop());
                }
                if(line2.empty()) System.out.println("Printer is on standby");
                else {
                    System.out.println("Canceled " + line2.peek());
                    k --;
                    line2.pop();
                }
            }

            else{
                k++;
                line.push(input);

            }

        }
        for(int y = 0; y < k;y++){
            line2.push(line.pop());
        }
        for(int y = 0; y < k;y++){
            System.out.println(line2.pop());
        }

    }
}
