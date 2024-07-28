
public class Assignment {
    private String details;
    private String classroomName;
    private boolean submitted;

    public Assignment(String details, String classroomName) {
        this.details = details;
        this.classroomName = classroomName;
        this.submitted = false;
    }

    public String getDetails() {
        return details;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void markAsSubmitted() {
        this.submitted = true;
    }
}