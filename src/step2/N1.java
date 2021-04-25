package step2;

public class N1 {
	public static void main(String[] args) {
		double dnum = 1.0;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}
}
