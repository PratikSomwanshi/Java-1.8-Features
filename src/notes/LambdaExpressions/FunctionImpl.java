package notes.LambdaExpressions;

import java.util.function.BiFunction;

public class FunctionImpl {
	public static void main(String[] args) {

//		Function<String, Integer> f = (str) -> str.length();
		BiFunction<String, String, Integer> f = (str1, str2) -> {
			StringBuilder sb = new StringBuilder(str1 + str2);
			return sb.length();
		};

//		System.out.println(f.apply("rohan"));
		System.out.println(f.apply("rohan", "somwanshi"));

	}
}
