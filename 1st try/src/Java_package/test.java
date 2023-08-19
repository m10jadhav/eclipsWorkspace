package Java_package;

public class testing1 {

	public void test() {
		System.out.println("test method");
	}

	public void test(int i, string s) {
		System.out.println("test1 method");
	}

	public void test(int i, int j, string s) {
		System.out.println("test2 method");
	}

	public static void main(String[] args) {
		testing1 test = new testing1();
		test.test();
		test.test(1, "str");
		test.test(1, 2, "qwe");
	}

}
