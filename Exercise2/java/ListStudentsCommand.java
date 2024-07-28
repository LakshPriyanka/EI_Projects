
public class ListStudentsCommand implements Command {
    private final ClassroomService classroomService;

    public ListStudentsCommand(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a classroom name.");
            return;
        }
        classroomService.listStudentsInClassroom(args[0]);
    }
}