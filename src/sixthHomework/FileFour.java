package sixthHomework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileFour {
    public static void main(String[] args) throws IOException {
        int output = 0;
        String path = "src\\example2.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String question = "";
        question = String.valueOf(scanner.nextLine());
        String member = question;
        int c;
        if(question.contains("-")){
            String[] a = question.split("-");
            output = Integer.parseInt(a[0]) - Integer.parseInt(a[1]);
        }
        else if(question.contains("/")){
            String[] a = question.split("/");
            output = Integer.parseInt(a[0]) / Integer.parseInt(a[1]);
        }
        else if(question.contains("+")){
            String[] a = question.split("\\+");
            output = Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
        }
        else{
            String[] a = question.split("\\*");
            output = Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
        }
        FileWriter writer = new FileWriter(path,false);
        String end = member + " = "  + String.valueOf(output);
        writer.write(end);
        System.out.println(member + " = "  + String.valueOf(output));
        scanner.close();
        writer.flush();
        writer.close();

    }
}
