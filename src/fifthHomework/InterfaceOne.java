import fifthHomework.Audi;
import fifthHomework.Car;

public class InterfaceOne {
    public static void main(String[] args) {
        Car audi = new Audi("R8", "gray", 510, "Spain");

        System.out.println(String.format("%s is %s color and have %s horsepower",
                audi.getModel(), audi.getColor(), audi.getHorsepower()));

        System.out.println(audi.toString());

    }
}
