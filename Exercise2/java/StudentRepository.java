
import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private static StudentRepository instance;
    private Map<String, Student> students;

    private StudentRepository() {
        students = new HashMap<>();
    }

    public static StudentRepository getInstance() {
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }

    public void removeStudent(String id) {
        students.remove(id);
    }

    public Map<String, Student> getAllStudents() {
        return students;
    }
}