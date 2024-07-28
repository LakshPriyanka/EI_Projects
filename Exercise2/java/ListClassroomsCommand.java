
public class ListClassroomsCommand implements Command {
    private final ClassroomService classroomService;

    public ListClassroomsCommand(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @Override
    public void execute(String[] args) {
        classroomService.listClassrooms();
    }
}