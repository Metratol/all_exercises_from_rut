package fourtHomework;

public class Airplane extends Vehicle {
    private int wingsCount;
    private int enginesNumber;
    private boolean isHydroplane;

    public Airplane(int passengers, int wingsCount, int enginesNumber, boolean isHydroplane) throws Exception {
        super(passengers);
        setEnginesNumber(enginesNumber);
        setWingsCount(wingsCount);
        setHydroplane(isHydroplane);
    }

    public void setWingsCount(int wingsCount) throws Exception {
        if(wingsCount < 0) throw new Exception("Invalid negative number");
        else if(wingsCount == 0) throw new Exception("Need wings to fly");
        else this.wingsCount = wingsCount;
    }

    public void setEnginesNumber(int enginesNumber) throws Exception {
        if(enginesNumber < 0) throw new Exception("Invalid negative number");
        else if((enginesNumber > 8 & enginesNumber < 10) | enginesNumber == 11 | enginesNumber > 12 | enginesNumber < 1) throw new Exception("Invalid engines number");
        else this.enginesNumber = enginesNumber;

    }

    public void setHydroplane(boolean hydroplane) {
        isHydroplane = hydroplane;
    }
}


