package fifthHomework;

import fifthHomework.Person;
import fifthHomework.BasePerson;

public class Russian extends BasePerson {
    public Russian(String name) {
        this.name = name;
    }
    public String sayHello(){
        return "Привет!";
    }
}

