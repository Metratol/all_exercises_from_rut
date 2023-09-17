package fifthHomework;
import fifthHomework.Person;

public abstract class BasePerson implements Person {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract public String sayHello();
}
