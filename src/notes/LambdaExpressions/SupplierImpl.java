package notes.LambdaExpressions;

import java.util.function.Supplier;

public class SupplierImpl {
	public static void main(String[] args) {

		Supplier<StringBuilder> s = () -> {
			StringBuilder otp = new StringBuilder();
			for (int i = 0; i < 5; i++) {
				otp.append((int) (Math.random() * 10));
			}
			return otp;
		};

		System.out.println(s.get());

	}
}
