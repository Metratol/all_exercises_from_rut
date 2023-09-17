package thirdHomework;

public class Person {
    private String name;
    private int age;
    private String info;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return String.format("%s - %s", getName(),getAge());
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Person() {
        this("name",1);
    }
    public Person(String name) {
        this(name,1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



}
