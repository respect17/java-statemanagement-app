public class StudentManagementApp {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", 85.5);
        Student student2 = new Student(2, "Bob", 92.0);

        System.out.println("Student 1 Information:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayStudentInfo();
    }
}
