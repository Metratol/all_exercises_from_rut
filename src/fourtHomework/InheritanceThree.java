package fourtHomework;

import java.util.Scanner;

public class InheritanceThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int[] arrive = new int[numbers.length];
        try {
            for (int i = 0; i < numbers.length; i++)
                arrive[i] = Integer.parseInt(numbers[i]);
            if (arrive.length == 1) {
                Circle circle = new Circle(arrive);
                System.out.println(circle.getSidesCount());
                System.out.println(circle.getPerimeter());
                System.out.println(circle.getArea());
            }
            else if (arrive.length == 3){
                Triangle triangle = new Triangle(arrive);
                System.out.println(triangle.getSidesCount());
                System.out.println(triangle.getPerimeter());
                System.out.print(triangle.getInRadius());

            }
            else if(arrive.length == 4 && (arrive[1] == arrive[0]) & arrive[2] == arrive[0] & arrive[3] == arrive[0]){
                Rhombus rhombus = new Rhombus(arrive);
                System.out.println("Rhombus " + rhombus.getSidesCount());
                System.out.print(rhombus.getPerimeter());;
            }
            else if(arrive.length == 4 && ((arrive[0] == arrive[1] & arrive[3] == arrive[2]) | (arrive[0] == arrive[2] &
                    arrive[1] == arrive[3]) | (arrive[0] == arrive[3] & arrive[1] == arrive[2]))){
                Parallelogram parallelogram = new Parallelogram(arrive);
                System.out.println("Parallelogram " + parallelogram.getSidesCount());
                System.out.print(parallelogram.getPerimeter());
            }
            else if(arrive.length == 4){
                Quadrilateral quadrilateral = new Quadrilateral(arrive);
                System.out.println("Quadrilateral " + quadrilateral.getSidesCount());
                System.out.println(quadrilateral.getPerimeter());

            }
            else {
                Polygon polygon = new Polygon(arrive);
                System.out.println("Polygon " + polygon.getSidesCount());
                System.out.print(polygon.getPerimeter());

            }

        }catch(Exception e){
            System.out.println(e.getMessage());;
        }


    }

}

