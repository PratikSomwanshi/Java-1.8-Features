package notes.LambdaExpressions;

import java.util.function.Consumer;

public class ConsumerImpl {
	public static void main(String[] args) {

		Consumer<Integer> c = (n) -> {
			System.out.println(n);
		};

		c.accept(10);

	}
}
