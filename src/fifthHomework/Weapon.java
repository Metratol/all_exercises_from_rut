package fifthHomework;

public class Weapon implements Arming {
    protected double ability;

    public Weapon(double ability) throws Exception {
        this.setAbility(ability);
    }

    public void setAbility(double ability) throws Exception {
        if(ability < 1 || ability > 5) throw new Exception("Incorrect value for ability");
        else this.ability = ability;
    }

    @Override
    public double getAbility() {
        return ability;
    }
}
