package InterviewScheduler;

public class Main {

	public static void main(String[] args) {
		// Create candidate and interviewer
        Candidate candidate = new Candidate("Vivek Nagle", "vivek@example.com");
        Interviewer interviewer = new Interviewer("Vinay Nagle", "Engineering");

        // Schedule interview using default strategy
        InterviewScheduler scheduler = new InterviewScheduler(new DefaultScheduleStrategy());
        scheduler.scheduleInterview(candidate, interviewer);

        // Send notification
        NotificationService service = new NotificationService(new EmailNotifier(), new ConsoleLogger());
        service.notifyCandidate(candidate, "Scheduled with " + interviewer.getName());

	}

}
