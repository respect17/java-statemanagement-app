public class Student {
    private int studentID;
    private String studentName;
    private double studentGrade;

    public Student(int id, String name, double grade) {
        this.studentID = id;
        this.studentName = name;
        this.studentGrade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Grade: " + studentGrade);
    }
}
