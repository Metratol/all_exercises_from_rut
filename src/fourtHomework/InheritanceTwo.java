package fourtHomework;

import java.util.Scanner;

public class InheritanceTwo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String [] firstEnter = scanner.nextLine().split(" ");
        String [] secondEnter = scanner.nextLine().split(" ");



        try {
            Student student = new Student(firstEnter[0],firstEnter[1],firstEnter[2]);
            Worker worker = new Worker(secondEnter[0],secondEnter[1],Double.parseDouble(secondEnter[2]),Double.parseDouble(secondEnter[3]));
            double hourSalary = Double.parseDouble(secondEnter[2]) / Double.parseDouble(secondEnter[3]) / 7;
            System.out.println("First Name: " + firstEnter[0] +"\nLast Name: " + firstEnter[1] + "\nFaculty Number: " + firstEnter[2] +
                    "\nFirst Name: " + secondEnter[0] + "\nLast Name: " + secondEnter[1] + "\nWeek Salary: " + Double.parseDouble(secondEnter[2]) + "\nHours per Day: " +
                    Double.parseDouble(secondEnter[3]) + "\nSalary per Hour " + (String.format("%.2f",hourSalary)) );
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }



    }
}
