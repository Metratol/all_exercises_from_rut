package fourtHomework;

public class Hero {
    protected String username;
    protected int level;

    public Hero(String username, int level) throws Exception {
        setLevel(level);
        setUsername(username);
    }

    public void setUsername(String username) throws Exception {
        if(username.length() < 5) throw new Exception("Wrong value to hero`s username");
        else this.username = username;
    }

    public void setLevel(int level) throws Exception {
        if(level < 0) throw new Exception("Wrong value to hero`s level");
        else this.level = level;
    }


}

