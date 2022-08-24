package enumPractice;

public class EnumExecute {

	public static void main(String[] args) {

		DAY mYNewDay = DAY.MONDAY;

		for (DAY days : DAY.values()) {
			System.out.println(days);
		}

		switch (mYNewDay) {

		case SUNDAY:
			System.out.println("This is my day");
			break;

		case MONDAY:
			System.out.println("Monday is my off day");
			break;
		case TUESDAY:
			System.out.println("Tuesday is Sayaan school day");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday is not my day");
			break;
		case THURSDAY:
			System.out.println("Thursday is sushmita day");
			break;
		case FRIDAY:
			System.out.println("Friday is my day");
			break;
		case SATURDAY:
			System.out.println();
			break;
		}
	}

}
