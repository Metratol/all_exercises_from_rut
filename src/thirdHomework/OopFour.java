package thirdHomework;

import java.util.Scanner;

public class OopFour {
    public static void main(String[] args) {

        Box box = new Box();
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        box.setLength(length);
        box.setHeight(height);
        box.setWidth(width);
        if((height <= 0) || (width <= 0) || (length <= 0)) {
            System.out.println();
        }
        else{
            System.out.println("Surface Area - " + String.format("%.2f", box.calculateSurfaceArea()));
            System.out.println("Lateral Surface Area - " + String.format("%.2f",box.calculateLateralSurfaceArea()));
            System.out.println("Volume - " + String.format("%.2f",box.calculateVolume()));
        }



    }
}