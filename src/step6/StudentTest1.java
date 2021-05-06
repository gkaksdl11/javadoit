package step6;

public class StudentTest1 {
	public static void main(String[] args) {
		StudentStatic studentLee = new StudentStatic();
		studentLee.setStudentName("이지원");
		// System.out.println(StudentStatic.serialNum);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;

		StudentStatic studentSon = new StudentStatic();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);

	}
}
