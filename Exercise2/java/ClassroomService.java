
import java.util.Map;

public class ClassroomService {
    private final ClassroomRepository classroomRepository = ClassroomRepository.getInstance();
    private final StudentRepository studentRepository = StudentRepository.getInstance();

    public void addClassroom(String className) {
        if (classroomRepository.getClassroom(className) != null) {
            System.out.println("Classroom already exists!");
            return;
        }
        Classroom classroom = new Classroom(className);
        classroomRepository.addClassroom(classroom);
        System.out.println("Classroom " + className + " has been created.");
    }

    public void removeClassroom(String className) {
        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            System.out.println("Classroom not found!");
            return;
        }
        classroomRepository.removeClassroom(className);
        System.out.println("Classroom " + className + " has been removed.");
    }

    public void enrollStudent(String studentId, String className) {
        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            System.out.println("Classroom not found!");
            return;
        }
        if (studentRepository.getStudent(studentId) != null) {
            System.out.println("Student already enrolled in another classroom!");
            return;
        }
        Student student = new Student(studentId, className);
        classroom.addStudent(student);
        studentRepository.addStudent(student);
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void listClassrooms() {
        Map<String, Classroom> classrooms = classroomRepository.getAllClassrooms();
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("Classrooms:");
        for (String className : classrooms.keySet()) {
            System.out.println("- " + className);
        }
    }

    public void listStudentsInClassroom(String className) {
        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            System.out.println("Classroom not found!");
            return;
        }
        if (classroom.getStudents().isEmpty()) {
            System.out.println("No students enrolled in " + className + ".");
            return;
        }
        System.out.println("Students in " + className + ":");
        for (Student student : classroom.getStudents()) {
            System.out.println("- " + student.getId());
        }
    }
}