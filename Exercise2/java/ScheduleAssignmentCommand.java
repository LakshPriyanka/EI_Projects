
public class ScheduleAssignmentCommand implements Command {
    private final AssignmentService assignmentService;

    public ScheduleAssignmentCommand(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a classroom name and assignment details.");
            return;
        }
        assignmentService.scheduleAssignment(args[0], args[1]);
    }
}