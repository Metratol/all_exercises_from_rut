package thirdHomework;



import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OopOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] enter = scanner.nextLine().split(" ");
            Car car1 = new Car();
            car1.setModel(enter[1]);
            car1.setMake(enter[0]);
            car1.setHorsepower(Integer.parseInt(enter[2]));
            cars.add(car1);
            }

        for(int y = 0; y < count; y++){
            System.out.println(cars.get(y).getInfo());


        }

    }
}
