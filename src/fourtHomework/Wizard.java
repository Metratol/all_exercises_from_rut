package fourtHomework;

public class Wizard extends Hero{
    private int mana;
    private int spellPower;

    public Wizard(String username, int level, int mana, int spellPower) throws Exception {
        super(username, level);
        setMana(mana);
        setSpellPower(spellPower);
    }

    public void setMana(int mana) throws Exception {
        if(mana < 1 | mana > 100) throw new Exception("Wrong value to wizard`s mana");
        else this.mana = mana;
    }

    public void setSpellPower(int spellPower) throws Exception {
        if(spellPower < 0 | spellPower > this.mana)throw new Exception("Wrong value to wizard`s spell power");
        else this.spellPower = spellPower;
    }
    public boolean spell(){
        if(this.mana < this.spellPower | this.mana <= 0) return false ;
        else return true;
    }
    public String action(){
        if(spell()){
            this.mana -= this.spellPower;
            return "Wizard " + this.username + " spell with power " + this.spellPower ;
        }
        else{
            return "Wizard " + this.username + " has no more mana";
        }
    }
}

