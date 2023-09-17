package fifthHomework;

import java.util.ArrayList;
import java.util.List;

public class InheritanceFour {
    public static void main(String[] args) throws Exception {
        List <Hero> players = new ArrayList<>();
        Hero legolas = new Elf("Legolas",1,70,1);
        Hero merlin = new Wizard("Merlin",100,70,100,80);
        Hero arthur = new Knight("Arthur",35,70,100,12);

        legolas.put(1, new HealthPotion(5));
        legolas.useItem(1);

        System.out.println(legolas.toString());
        arthur.change(new Sword(2.5));
        merlin.change(new Sword(2.5));

        merlin.levelUp();

        players.add(legolas);
        players.add(merlin);
        players.add(arthur);

        for (Hero hero: players){
            System.out.println(hero.action());
            System.out.println(hero.action());
        }
    }

}

