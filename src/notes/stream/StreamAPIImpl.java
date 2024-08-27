package notes.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIImpl {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		Stream<Integer> st = list.stream();

//		st.forEach((i) -> {
//			System.out.println(i);
//		});

//		Stream<Integer> filter = st.filter(i -> i > 10);
//		filter.forEach((i) -> System.out.println(i));

		list.stream().filter(i -> i > 10).forEach(i -> System.out.println(i));
	}
}
