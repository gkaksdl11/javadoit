package step5;

public class OderTest {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.order = 201803120001L;
		order1.ID = "abc123";
		order1.date = "2018�� 03�� 12��";
		order1.name = "ȫ���";
		order1.numberOfOrder = "PD0345-12";
		order1.address = "����� �������� ���ǵ��� 20����";

		System.out.println("�ֹ� ��ȣ :" + order1.order);
		System.out.println("�ֹ��� ���̵� :" + order1.ID);
		System.out.println("�ֹ� ��¥ :" + order1.date);
		System.out.println("�ֹ��� �̸� :" + order1.name);
		System.out.println("�ֹ��� ��ǰ ��ȣ :" + order1.numberOfOrder);
		System.out.println("��� �ּ� :" + order1.address);

	}
}
