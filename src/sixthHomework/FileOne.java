package sixthHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class FileOne {
    public static void main(String[] args) throws FileNotFoundException {
        String[] str= ".,?![]()-".split("");
        String path = "src\\example1.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String check = "";
        int output = 0;

        while(scanner.hasNextLine())
            check += scanner.nextLine();
        String [] text = check.split("");


        for(int i = 0; i < text.length;i++){
            for(int y = 0; y < str.length;y++) {
                if (Objects.equals(text[i], str[y]))
                    output++;
            }
        }


        System.out.println(output);
        scanner.close();
    }
}
