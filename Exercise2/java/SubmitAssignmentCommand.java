
public class SubmitAssignmentCommand implements Command {
    private final AssignmentService assignmentService;

    public SubmitAssignmentCommand(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide a student ID, classroom name, and assignment details.");
            return;
        }
        assignmentService.submitAssignment(args[0], args[1], args[2]);
    }
}