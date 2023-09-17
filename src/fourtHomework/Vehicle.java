package fourtHomework;

public class Vehicle {
    protected int passengers;

    public Vehicle(int passengers) {
        this.passengers = passengers;
    }

    public void setPassengers(int passengers) throws Exception {
        if(passengers < 0) throw new Exception("Invalid horsepower count");
        else if(passengers < 1) throw new Exception("Need passengers to drive");
        else this.passengers = passengers;
    }
}
