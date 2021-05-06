package step6;

public class CallAnotherCont {
	
	class Person {
		String name;
		int age;

		Person() {
			this("이름없음", 1);
		}

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		Person returnItSelf() {
			return this;
		}
	}
	
	public static void main(String[] args) {
		CallAnotherCont callAnotherCont = new CallAnotherCont();
		CallAnotherCont.Person noName = callAnotherCont.new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
