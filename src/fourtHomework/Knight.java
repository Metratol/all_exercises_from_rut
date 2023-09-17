package fourtHomework;

public class Knight extends Hero {
    private int strength;
    private int impactForce;

    public Knight(String username, int level, int strength, int impactForce) throws Exception {
        super(username, level);
        this.strength = strength;
        this.impactForce = impactForce;
    }

    public void setStrength(int strength) throws Exception {
        if (strength < 1 | strength > 100) throw new Exception("Wrong value to knight`s strength");
        else this.strength = strength;
    }

    public void setImpactForce(int impactForce) throws Exception {
        if (impactForce < 0 | impactForce > this.strength) throw new Exception("Wrong value to knight`s force impact");
        else this.impactForce = impactForce;
    }

    public boolean fight() {
        if (this.impactForce > this.strength | this.strength <= 0) return false;
        else return true;
    }

    public String action() {
        if (fight()) {
            this.strength -= this.impactForce;
            return "Knight " + this.username + " fight with force " + this.impactForce;
        } else {
            return "Knight " + this.username + " has no more strength";
        }
    }
}

