package fourtHomework;

public class Car extends Vehicle {
    private int horsePower;
    private String model;

    public Car(int passengers, int horsePower, String model) throws Exception {
        super(passengers);
        setHorsePower(horsePower);
        setModel(model);
    }

    public void setHorsePower(int horsePower) throws Exception {
        if(horsePower < 1) throw new Exception("Invalid negative number");
        else this.horsePower = horsePower;
    }

    public void setModel(String model) throws Exception {
        if (model.length() < 2) throw new Exception("Invalid short value ");
        else this.model = model;

    }
}