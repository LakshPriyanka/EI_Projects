
public class AddStudentCommand implements Command {
    private final ClassroomService classroomService;

    public AddStudentCommand(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a student ID and classroom name.");
            return;
        }
        classroomService.enrollStudent(args[0], args[1]);
    }
}