
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualClassroomManager {
    private final ClassroomService classroomService = new ClassroomService();
    private final AssignmentService assignmentService = new AssignmentService();
    private final StudentService studentService = new StudentService();
    private final Map<String, Command> commands;

    public VirtualClassroomManager() {
        commands = new HashMap<>();
        commands.put("add_classroom", new AddClassroomCommand(classroomService));
        commands.put("add_student", new AddStudentCommand(classroomService));
        commands.put("schedule_assignment", new ScheduleAssignmentCommand(assignmentService));
        commands.put("submit_assignment", new SubmitAssignmentCommand(assignmentService));
        commands.put("list_classrooms", new ListClassroomsCommand(classroomService));
        commands.put("list_students", new ListStudentsCommand(classroomService));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Virtual Classroom Manager");
        System.out.println("Available commands: add_classroom, add_student, schedule_assignment, submit_assignment, list_classrooms, list_students");
        
        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+");
            String commandName = parts[0];
            String[] args = new String[parts.length - 1];
            System.arraycopy(parts, 1, args, 0, args.length);

            Command command = commands.get(commandName);
            if (command != null) {
                command.execute(args);
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }
    }
}