package fourtHomework;

public class Elf extends Hero {
    private int arrowsCount;

    public Elf(String username, int level, int arrowsCount) throws Exception {
        super(username, level);
        setArrowsCount(arrowsCount);
    }

    public void setArrowsCount(int arrowsCount) throws Exception {
        if (arrowsCount < 1 | arrowsCount > 100) throw new Exception("Wrong value to elf`s arrows count");
        else this.arrowsCount = arrowsCount;
    }

    public boolean shootArrow() {
        if (arrowsCount < 1) return false;
        else return true;
    }

    public String action() {
        if (shootArrow()) {
            this.arrowsCount -= 1;
            return "Elf " + this.username + " shoot arrow ";
        } else {
            return "Elf " + this.username + " has no more arrows";
        }
    }
}
