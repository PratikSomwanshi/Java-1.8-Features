package notes.constructorRef;

import java.util.function.Supplier;

public class ConstructorRefImpl {
	public static void main(String[] args) {
		Supplier<Doctor> s = Doctor::new;

		System.out.println(s.hashCode());
	}
}

class Doctor {
	public Doctor() {

	}

	public Doctor(int x) {

	}
}
