package sixthHomework;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileThree {
    public static void main(String[] args) throws FileNotFoundException {
        int sum = 0;
        String path = "src\\example1.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
        sum += scanner.nextLine().replace(" ","").length();
        }
        scanner.close();
        System.out.println(sum);
    }
}
