package step5;

public class ManTest {
	public static void main(String[] args) {
		Man man = new Man();
		man.manName = "James";
		man.age = 40;
		man.isMarried = true;
		man.child = 3;

		System.out.println("���� :" + man.age);
		System.out.println("�̸� :" + man.manName);
		System.out.println("��ȥ ���� :" + man.isMarried);
		System.out.println("�ڳ� �� :" + man.child);
	}
}
