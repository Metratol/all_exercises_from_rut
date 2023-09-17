package fourtHomework;

import java.util.Arrays;

public class Polygon {
    protected int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
    }

    public String getSidesCount() throws Exception {
        if (sides.length < 1 | sides.length == 2) throw new Exception("Invalid value to sides number");
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] <= 0) throw new Exception(String.format("Zero or negative value to side %s", sides[i]));
            if (sides[i] > (Arrays.stream(sides).sum() - sides[i]))
                throw new Exception("Wrong value to side length " + sides[i]);

        }
        if (sides.length == 1) return (String.format("Circle radius is %d", sides[0]));
        else if (sides.length == 3) return ((String.format("Triangle contains %d sides", sides.length)));
        else return (String.format("contains %d sides", sides.length));
    }

    public String getPerimeter() throws Exception {
        double perimeter = 0;


        if (sides.length == 3) perimeter = sides[0] + sides[1] + sides[2];
        else for (int side : sides) {
            perimeter += side;
        }
        return String.format("Its perimeter is %s", perimeter);
    }

}