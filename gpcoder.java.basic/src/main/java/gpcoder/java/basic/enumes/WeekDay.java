package gpcoder.java.basic.enumes;

public enum WeekDay {
	MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(8);

	protected int value;

	private WeekDay(int value) {
		this.value = value;
	}
}
