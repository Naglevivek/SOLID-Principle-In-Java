// L - Liskov Substitution Principle: Scheduler works with any ScheduleStrategy
package InterviewScheduler;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class InterviewScheduler {
    private List<Interview> scheduled = new ArrayList<>();
    private ScheduleStrategy strategy;

    public InterviewScheduler(ScheduleStrategy strategy) {
        this.strategy = strategy;
    }

    public void scheduleInterview(Candidate candidate, Interviewer interviewer) {
        Date time = strategy.getInterviewTime();
        Interview interview = new Interview(candidate, interviewer, time);
        scheduled.add(interview);
        System.out.println("Interview scheduled for " + candidate.getName() +
            " with " + interviewer.getName() + " at " + time);
    }

    public List<Interview> getAllScheduled() {
        return scheduled;
    }
}
