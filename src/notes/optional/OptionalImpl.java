package notes.optional;

import java.util.Optional;

public class OptionalImpl {

	public Optional<String> getName(int id) {
		String name = null;
		if (id == 1) {
			name = "rohan";
		}

		return Optional.ofNullable(name);
//		return Optional.of(name);
	}

	public static void main(String[] args) {
		OptionalImpl ol = new OptionalImpl();
		Optional<String> name = ol.getName(1);
		if (name.isPresent()) {
			System.out.println(name.get() + " something");
		} else {
			System.out.println("hello");
		}
	}
}
