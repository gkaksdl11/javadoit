package step6;

public class Taxi {
	String kindOf;
	int money;

	public Taxi(String kindOf) {
		this.kindOf = kindOf;
	}

	public void take(int money) {
		this.money += money;

	}

	public void showInfo() {
		System.out.println("택시요금은" + money + "입니다.");
	}

}
