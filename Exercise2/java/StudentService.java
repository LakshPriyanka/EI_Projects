
import java.util.Map;

public class StudentService {
    private final StudentRepository studentRepository = StudentRepository.getInstance();

    public void removeStudent(String studentId) {
        Student student = studentRepository.getStudent(studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        studentRepository.removeStudent(studentId);
        System.out.println("Student " + studentId + " has been removed.");
    }

    public void listAllStudents() {
        Map<String, Student> students = studentRepository.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("Students:");
        for (String studentId : students.keySet()) {
            System.out.println("- " + studentId);
        }
    }
}