//S- Single Responsibility Principle: Represents a Candidate
package InterviewScheduler;
class Candidate {
    private String name;
    private String email;

    public Candidate(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}
