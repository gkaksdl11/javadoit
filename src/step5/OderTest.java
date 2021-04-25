package step5;

public class OderTest {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.order = 201803120001L;
		order1.ID = "abc123";
		order1.date = "2018년 03월 12일";
		order1.name = "홍길순";
		order1.numberOfOrder = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";

		System.out.println("주문 번호 :" + order1.order);
		System.out.println("주문자 아이디 :" + order1.ID);
		System.out.println("주문 날짜 :" + order1.date);
		System.out.println("주문자 이름 :" + order1.name);
		System.out.println("주문자 상품 번호 :" + order1.numberOfOrder);
		System.out.println("배송 주소 :" + order1.address);

	}
}
