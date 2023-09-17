package thirdHomework;

import java.util.Scanner;

public class Car {
    public String make;
    public String model;
    public int horsepower;
    public String info;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getInfo() {
        return String.format("The car is: %s %s - %s HP.", getMake(), getModel(), getHorsepower());
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Car() {
        this("unkown","unkown",-1);
    }
    public Car(String make) {
        this(make,"unkown", -1);
    }



    public Car(String make, String model, int horsepower) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
    }


    }






