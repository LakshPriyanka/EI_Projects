
public class AssignmentService {
    private final AssignmentRepository assignmentRepository = AssignmentRepository.getInstance();
    private final ClassroomRepository classroomRepository = ClassroomRepository.getInstance();
    private final StudentRepository studentRepository = StudentRepository.getInstance();

    public void scheduleAssignment(String className, String details) {
        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            System.out.println("Classroom not found!");
            return;
        }
        Assignment assignment = new Assignment(details, className);
        classroom.addAssignment(assignment);
        assignmentRepository.addAssignment(assignment);
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String details) {
        Student student = studentRepository.getStudent(studentId);
        if (student == null || !student.getClassroomName().equals(className)) {
            System.out.println("Student not enrolled in the specified classroom!");
            return;
        }
        Assignment assignment = assignmentRepository.findAssignment(className, details);
        if (assignment == null) {
            System.out.println("Assignment not found for the specified class!");
            return;
        }
        assignment.markAsSubmitted();
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    public void listAssignments(String className) {
        Classroom classroom = classroomRepository.getClassroom(className);
        if (classroom == null) {
            System.out.println("Classroom not found!");
            return;
        }
        if (classroom.getAssignments().isEmpty()) {
            System.out.println("No assignments scheduled for " + className + ".");
            return;
        }
        System.out.println("Assignments for " + className + ":");
        for (Assignment assignment : classroom.getAssignments()) {
            String status = assignment.isSubmitted() ? "Submitted" : "Pending";
            System.out.println("- " + assignment.getDetails() + " [" + status + "]");
        }
    }
}