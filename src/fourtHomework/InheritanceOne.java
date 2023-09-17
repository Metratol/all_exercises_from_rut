package fourtHomework;

import java.util.Scanner;

public class InheritanceOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        String[] info = enter.split(" ");
        try{
            if(info[0].equals("Car")){
                Car car = new Car(Integer.parseInt(info[1]),Integer.parseInt(info[2]),info[3]);
                car.setHorsePower(Integer.parseInt(info[2]));
                car.setModel(info[3]);
                car.setPassengers(Integer.parseInt(info[1]));
                System.out.println("In a Car " + info[1] + " passengers\nWith " + info[2] + " horse power on " + info[3]);

            }
            if(info[0].equals("Boat")){
                Boat boat = new Boat(Integer.parseInt(info[1]),Integer.parseInt(info[2]));
                System.out.println("In a Boat "+ info[1] + " passengers\nWith " + info[2] + " oars");
            }
            if(info[0].equals("Airplane")){
                Airplane airplane = new Airplane(Integer.parseInt(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]),Boolean.parseBoolean(info[4]));
                if(Boolean.parseBoolean(info[4]) == true) System.out.println("In an Hydroplane " + info[1] + " passengers\n" +
                        "With " + info[2] + " wings and " + info[3] + " engines");
                else System.out.println("In an Airplane " + info[1] + " passengers\n" +
                        "With " + info[2] + " wings and " + info[3] + " engines");
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());

        }

    }
}
