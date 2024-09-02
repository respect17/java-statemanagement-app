import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentManagementApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", 20, "S001", "A"));
        students.add(new Student("Jane Smith", 22, "S002", "B"));

        // Display all students
        students.forEach(Student::display);

        // Use Streams to filter and display
        students.stream()
                .filter(s -> s.getStudentGrade().equals("A"))
                .forEach(Student::display);

        // Example of Optional usage
        Optional<Student> optionalStudent = students.stream()
                .filter(s -> s.getStudentID().equals("S001"))
                .findFirst();

        optionalStudent.ifPresent(Student::display);
    }
}
