package fifthHomework;

public class Player implements Identifiable, Experienced {
    protected String username;
    protected int level;

    public Player(String username, int level){
       this.setUsername(username);
       this.setLevel(level);
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws IllegalArgumentException{
        if(username.length() < 5) throw new IllegalArgumentException("Wrong value to hero`s username");
        else this.username = username;
    }

    @Override
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(username.length() < 5) throw new IllegalArgumentException("Wrong value to hero`s username");
        else this.level = level;
    }

    @Override
    public void levelUp() {
        level += 1;
        System.out.println(username + " level up");
    }
}
