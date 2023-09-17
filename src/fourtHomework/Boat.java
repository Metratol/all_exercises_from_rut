package fourtHomework;

public class Boat extends Vehicle {
    private int oarsCount;


    public Boat(int passengers, int oarsCount) throws Exception {
        super(passengers);
        setOarsCount(oarsCount);

    }


    public void setOarsCount(int oarsCount) throws Exception {
        if(oarsCount < 0) throw new Exception("Invalid negative number");
        else if(oarsCount > this.passengers*2) throw new Exception("One too many oars");
        else if(oarsCount < 1) throw  new Exception("Need oars to swim");
        else this.oarsCount = oarsCount;
    }
}
