
import java.util.ArrayList;
import java.util.List;

public class AssignmentRepository {
    private static AssignmentRepository instance;
    private List<Assignment> assignments;

    private AssignmentRepository() {
        assignments = new ArrayList<>();
    }

    public static AssignmentRepository getInstance() {
        if (instance == null) {
            instance = new AssignmentRepository();
        }
        return instance;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public List<Assignment> getAllAssignments() {
        return assignments;
    }

    public Assignment findAssignment(String className, String details) {
        for (Assignment assignment : assignments) {
            if (assignment.getClassroomName().equals(className) && assignment.getDetails().equals(details)) {
                return assignment;
            }
        }
        return null;
    }
}