package notes.Interfaces;

interface Test {
	int data = 10;

	public void m1();

	public default void m2() {
		System.out.println("Default method");
	}

	public static void m3() {
		System.out.println("Static method");
	}
}

public class Interfaces implements Test {

	@Override
	public void m1() {
		System.out.println("hello");
	}

	@Override
	public void m2() {
		System.out.println("overriden");
	}

	public static void main(String[] args) {
		Test.m3();

	}
}
