//S: Single Responsibility Principle : Represents a schedule Interview
package InterviewScheduler;

import java.util.Date;

class Interview {
    private Candidate candidate;
    private Interviewer interviewer;
    private Date time;

    public Interview(Candidate candidate, Interviewer interviewer, Date time) {
        this.candidate = candidate;
        this.interviewer = interviewer;
        this.time = time;
    }

    public Candidate getCandidate() { return candidate; }
    public Interviewer getInterviewer() { return interviewer; }
    public Date getTime() { return time; }
}
