package step5;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int result1 = add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + result1 + "�Դϴ�");

		int result2 = minus(num1, num2);
		System.out.println(num1 + "-" + num2 + "=" + result2 + "�Դϴ�");

		int result3 = division(num1, num2);
		System.out.println(num2 + "/" + num1 + "=" + result3 + "�Դϴ�");

		int result4 = multiple(num1, num2);
		System.out.println(num1 + "*" + num2 + "=" + result4 + "�Դϴ�");

	}

	public static int add(int n1, int n2) {
		int result1 = n1 + n2;
		return result1;
	}

	public static int minus(int n1, int n2) {
		int result2 = n1 - n2;
		return result2;
	}

	public static int division(int n1, int n2) {
		int result3 = n2 / n1;
		return result3;
	}

	public static int multiple(int n1, int n2) {
		int result4 = n1 * n2;
		return result4;
	}
}
