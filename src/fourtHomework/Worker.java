package fourtHomework;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;


    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) throws Exception {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setWorkHoursPerDay(workHoursPerDay);
    }

    public void setWeekSalary(double weekSalary) throws Exception {
        if(weekSalary < 10) throw new Exception("Expected value mismatch!\nArgument:weekSalary");
        this.weekSalary = weekSalary;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) throws Exception {
        if(workHoursPerDay < 1 | workHoursPerDay > 12) throw new Exception("Expected value mismatch!\nArgument:workHoursPerDay");
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String setLastName(String lastName) throws Exception {
        super.setLastName(lastName);
        char symbol = lastName.charAt(1);
        if(lastName.length() < 4) throw  new Exception("Expected length at least 4 symbols!\nArgument:lastName");
        else this.lastName = lastName;

        return this.lastName;
    }
}
