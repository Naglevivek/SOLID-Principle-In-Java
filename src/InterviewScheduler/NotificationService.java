// D - Dependency Inversion Principle: NotificationService depends on abstraction
package InterviewScheduler;
class NotificationService {
    private Notifiable notifier;
    private Loggable logger;

    public NotificationService(Notifiable notifier, Loggable logger) {
        this.notifier = notifier;
        this.logger = logger;
    }

    public void notifyCandidate(Candidate candidate, String details) {
        String message = "Hello " + candidate.getName() + ", your interview is scheduled. " + details;
        notifier.sendNotification(message);
        logger.Log("Notification sent to " + candidate.getEmail());
    }
}
