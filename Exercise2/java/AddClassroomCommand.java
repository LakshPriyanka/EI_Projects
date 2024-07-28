
public class AddClassroomCommand implements Command {
    private final ClassroomService classroomService;

    public AddClassroomCommand(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a classroom name.");
            return;
        }
        classroomService.addClassroom(args[0]);
    }
}