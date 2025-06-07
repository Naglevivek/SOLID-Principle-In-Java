//Open Close Principle : Represents Schedule Strategy
package InterviewScheduler;
import java.util.Calendar;
import java.util.Date;
interface ScheduleStrategy {
  Date getInterviewTime();
}
class DefaultScheduleStrategy implements ScheduleStrategy{
	public Date getInterviewTime() {
		Calendar cal= Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		cal.add(Calendar.HOUR_OF_DAY, 10);
		cal.add(Calendar.MINUTE, 0);
		return cal.getTime();
	}
}
