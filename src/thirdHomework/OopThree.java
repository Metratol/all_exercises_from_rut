package thirdHomework;

import javax.naming.directory.SchemaViolationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OopThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<thirdHomework.Person> guys = new ArrayList<>();
            int count = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < count; i++) {
                String[] enter = scanner.nextLine().split(" ");
                if (Integer.parseInt(enter[1]) > 30) {
                    thirdHomework.Person person = new thirdHomework.Person();
                    person.setAge(Integer.parseInt(enter[1]));
                    person.setName(enter[0]);
                    guys.add(person);

                }
            }
           Comparator<thirdHomework.Person> comparator = Comparator.comparing(obj -> obj.getName());
            Collections.sort(guys, comparator);
            for (int y = 0; y < guys.size(); y++) {
                System.out.println(guys.get(y).getInfo());
            }
        }
}