package notes.methodRef;

public class InstanceMethod {

	public void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		InstanceMethod i = new InstanceMethod();
		Runnable r = i::m1;

		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		t.start();

		t1.start();
	}

}
