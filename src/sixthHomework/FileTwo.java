package sixthHomework;

import java.io.*;
import java.util.Scanner;

public class FileTwo {
    public static void main(String[] args) throws IOException {
        int output = 0;
        String path = "src\\example1.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String numberOnly = scanner.nextLine().replaceAll("[^0-9]", "");
        String [] a = numberOnly.split("");
        for(int i = 0; i < numberOnly.length();i++){
            output += Integer.parseInt(a[i]);

        }
        System.out.println(output);
        scanner.close();



    }
}
