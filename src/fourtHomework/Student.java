package fourtHomework;


public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) throws Exception {
        super(firstName, lastName);
        setFacultyNumber(facultyNumber);
    }

    public void setFacultyNumber(String facultyNumber) throws Exception {
        if(facultyNumber.length() < 5 | facultyNumber.length() > 10) throw new Exception("Invalid faculty number!");
        else this.facultyNumber = facultyNumber;
    }
}
