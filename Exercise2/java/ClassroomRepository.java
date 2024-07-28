
import java.util.HashMap;
import java.util.Map;

public class ClassroomRepository {
    private static ClassroomRepository instance;
    private Map<String, Classroom> classrooms;

    private ClassroomRepository() {
        classrooms = new HashMap<>();
    }

    public static ClassroomRepository getInstance() {
        if (instance == null) {
            instance = new ClassroomRepository();
        }
        return instance;
    }

    public void addClassroom(Classroom classroom) {
        classrooms.put(classroom.getName(), classroom);
    }

    public Classroom getClassroom(String name) {
        return classrooms.get(name);
    }

    public void removeClassroom(String name) {
        classrooms.remove(name);
    }

    public Map<String, Classroom> getAllClassrooms() {
        return classrooms;
    }
}