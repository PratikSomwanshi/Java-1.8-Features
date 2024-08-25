package notes.LambdaExpressions;

import java.util.function.BiPredicate;

public class PredicateImpl {

	public static void main(String[] args) {

//		Predicate<Integer> p = (n) -> n >= 10;
		BiPredicate<Integer, String> p = (n, str) -> {
			if (n >= str.length()) {
				return false;
			}
			return true;
		};

		System.out.println(p.test(10, "rohan"));

	}

}
