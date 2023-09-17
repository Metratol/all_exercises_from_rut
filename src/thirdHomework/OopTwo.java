package thirdHomework;

import com.sun.tools.javac.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.*;

/*public class OopTwo {
    private static int compare(Person firstPerson, Person secondPerson){
        int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
        if(sComp != 0)
            return sComp;
        else
            return  Integer.compare(firstPerson.getAge(),secondPerson.getAge());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();



        for(int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));


        }

    }
}*/


public class OopTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        while (true) {
            String[] enter = scanner.nextLine().split(" ");

            if (enter[0].equals("Create")) {
                accounts.add(new BankAccount());
                System.out.println("Account ID" + BankAccount.getBankAccountCount() +" created.");
                }

            else if (enter[0].equals("Deposit")) {
                if (Integer.parseInt(enter[1]) <= BankAccount.getBankAccountCount()) {
                    int money = Integer.parseInt(enter[2]);
                    accounts.get(Integer.parseInt(enter[1]) - 1).deposit(money);

                    System.out.println("Deposited " + enter[2] + " to ID" + enter[1]);
                }
                else
                    System.out.println("Account doesnt exist");


            }

            else if (enter[0].equals("GetInterest")){
                if (Integer.parseInt(enter[1]) <= BankAccount.getBankAccountCount()){
                    int years = Integer.parseInt(enter[2]);
                    System.out.println( accounts.get(Integer.parseInt(enter[1]) - 1).getInterest(years));
                }
                else
                    System.out.println("Account doesnt exist");
                }

            else if (enter[0].equals("SetInterest")){
                BankAccount.setInterestRate(Integer.parseInt(enter[1]));


            }
            else{
                break;
            }




            }
        }
    }
