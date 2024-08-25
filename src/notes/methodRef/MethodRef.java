package notes.methodRef;

@FunctionalInterface
interface MyInterface {
	public void m1();
}

public class MethodRef {

	public static String m2() {
		System.out.println("Hello From m2");
		return "hi";
	}

	public static void main(String[] args) {
		MyInterface i = MethodRef::m2;
		i.m1();
	}
}
