package step5;

public class Private {
	public int day;
	public int month;
	public int year;

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("�����Դϴ�.");
			} else {
				this.day = day;
			}
		}
	}
}
