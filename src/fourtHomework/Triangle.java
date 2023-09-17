package fourtHomework;


public class Triangle extends Polygon{
    public Triangle(int[] sides) {
        super(sides);
    }
    public String getInRadius(){
        double a = Double.parseDouble(String.valueOf(sides[0]));
        double b = Double.parseDouble(String.valueOf(sides[1]));
        double c = Double.parseDouble(String.valueOf(sides[2]));
        return (String.format("Its radius of incircle is %.2f",Math.sqrt((((-a + b + c) * (a - b + c) * (a + b - c)))
                /4 * (a + b + c))));
    }
}
