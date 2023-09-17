package fifthHomework;
public class Audi implements Car{
    private String model;
    private String color;
    private int horsepower;
    private String countryProduced;

    public Audi(String model, String color, int horsepower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.countryProduced = countryProduced;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }
    public String toString(){
        return "This is " + model +" produced in " + countryProduced + " and have " + TIRES + " tires.";

    }
}
