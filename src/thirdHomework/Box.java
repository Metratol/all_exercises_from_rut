package thirdHomework;

import java.io.IOException;

public class Box {
    private double length;
    private double width;
    private double height;
    private double check ;

    public double calculateSurfaceArea(){
        double surface = 2 * (length * width + length * height + width * height);
        return surface;
    }
    public double calculateLateralSurfaceArea(){
        double surface = 2 *height*(width+length);
        return surface;
    }
    public double calculateVolume() {
            double surface = length * width * height;
            return surface;


    }



    public void setLength(double length) {
            this.length = length;



        }




    public void setWidth(double width) {
            this.width = width;






    }



    public void setHeight(double height) {

            this.height = height;

        }
    }

