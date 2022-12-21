package gpcoder.java.basic.enumes;

public class EnumIST {
	public static void main(String[] args) {
		// Loop:
		for (WeekDay weekDay : WeekDay.values()) {
			System.out.println("Index: " + weekDay + ", value: " + weekDay.value);
		}

		// Compare:
		WeekDay currentDate = WeekDay.MONDAY;
		System.out.println("Compare: " + (WeekDay.MONDAY == currentDate));

		// Equal:
		System.out.println("Equal: " + (currentDate.equals(WeekDay.MONDAY)));

		// Switch:
		switch (currentDate) {
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Other");
			break;
		}
	}
}
