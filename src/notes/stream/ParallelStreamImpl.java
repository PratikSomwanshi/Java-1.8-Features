package notes.stream;

import java.util.stream.Stream;

public class ParallelStreamImpl {
	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		st.parallel().forEach(i -> System.out.println(i + " " + Thread.currentThread()));
	}
}
