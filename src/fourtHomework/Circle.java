package fourtHomework;

public class Circle extends Polygon {
    public Circle(int[] sides) {
        super(sides);
    }

    public String getPerimeter() {
        return String.format("Its perimeter is %.2f", 2 * Double.parseDouble(String.valueOf(sides[0])) * Math.PI);
    }
    public String getArea(){
        return  (String.format("Its area is %.2f",Double.parseDouble(String.valueOf(sides[0])) *
                Double.parseDouble(String.valueOf(sides[0])) * Math.PI));
    }

}
