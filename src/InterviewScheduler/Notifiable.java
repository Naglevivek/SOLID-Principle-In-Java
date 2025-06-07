//I : Interface Segregation Principle
package InterviewScheduler;
interface Notifiable {
  void sendNotification(String message);
  
}
interface Loggable{
	void Log(String message);
}
class EmailNotifier implements Notifiable{
	public void sendNotification(String message) {
		System.out.println("Sending Email: " + message);
	}
}
class ConsoleLogger implements Loggable{
	public void Log(String message) {
		System.out.println("Log"+ message);
	}
}