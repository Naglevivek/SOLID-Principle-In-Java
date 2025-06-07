//S: Single Responsibility Principle : Represents a Interviewer
package InterviewScheduler;
class Interviewer {
    private String name;
    private String department;

    public Interviewer(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
}
