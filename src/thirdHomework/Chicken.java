package thirdHomework;

public class Chicken {
    private int age;
    private String name;

    public void setAge(int age) throws Exception {
            if(age > 15 | age < 0) throw new Exception("Age should be between 0 and 15.");
            else this.age = age;
        }


    public void setName(String name) throws Exception {
            if (name.equals("") | name.equals("null")) throw new Exception("Name cannot be empty");
            else this.name = name;

            }

    public Chicken(String name, int age) throws Exception {
      setAge(age);
      setName(name);
    }

    private double calculateProductPerDay(int age){
        if (age >= 0 & age < 6){
            return 2;
        }
        else if (age >= 6 & age < 12){
            return 1;
        }
        else{
            return 0.75;
        }

    }

    public double productPerDay(){
       return calculateProductPerDay(this.age);
    }

}