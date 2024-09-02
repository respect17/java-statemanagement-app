import java.util.Optional;

public class Student extends Person implements Displayable {
    private String studentID;
    private String studentGrade;

    public Student(String name, int age, String studentID, String studentGrade) {
        super(name, age);
        this.studentID = studentID;
        this.studentGrade = studentGrade;
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public void display() {
        System.out.println(this.toString() + ", ID: " + studentID + ", Grade: " + studentGrade);
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + studentID + ", Grade: " + studentGrade;
    }
}
