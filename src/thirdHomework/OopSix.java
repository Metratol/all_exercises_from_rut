package thirdHomework;

import java.util.Scanner;

public class OopSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        name = name.replace(" ", "");
        int age = Integer.parseInt(scanner.nextLine());
        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(String.format("Chicken %s (age %s) can produce %s eggs per day.", name, age, chicken.productPerDay()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
