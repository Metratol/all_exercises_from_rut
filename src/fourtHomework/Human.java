package fourtHomework;

public class Human {
    private String firstName;
    protected String lastName;


    public Human(String firstName, String lastName) throws Exception {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName(String firstName) throws Exception {
        char symbol = firstName.charAt(0);
        if(Character.isLowerCase(symbol)) throw new Exception("Expected upper case letter!\nArgument:firstName");
        if(firstName.length() < 4) throw  new Exception("Expected length at least 4 symbols!\nArgument:firstName");
        else this.firstName = firstName;
    }

    public String setLastName(String lastName) throws Exception {
        char symbol = lastName.charAt(1);
        if(!Character.isLowerCase(symbol)) throw new Exception("Expected upper case letter!\nArgument:lastName");
        else if(lastName.length() < 3) throw  new Exception("Expected length at least 3 symbols!\nArgument:lastName");
        else this.lastName = lastName;
        return lastName;
    }
}
