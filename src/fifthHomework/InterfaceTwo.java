
import fifthHomework.British;
import fifthHomework.Chinese;
import fifthHomework.Person;
import fifthHomework.Russian;

import java.util.ArrayList;

public class InterfaceTwo {
    public static void main(String[] args) {
        ArrayList <Person> persons = new ArrayList<>();

        persons.add(new Russian("Иван"));
        persons.add(new British("Adam"));
        persons.add(new Chinese("Lee"));

        for(Person person : persons){
            System.out.println(person.sayHello());
        }
    }
}



