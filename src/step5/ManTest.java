package step5;

public class ManTest {
	public static void main(String[] args) {
		Man man = new Man();
		man.manName = "James";
		man.age = 40;
		man.isMarried = true;
		man.child = 3;

		System.out.println("나이 :" + man.age);
		System.out.println("이름 :" + man.manName);
		System.out.println("결혼 여부 :" + man.isMarried);
		System.out.println("자녀 수 :" + man.child);
	}
}
