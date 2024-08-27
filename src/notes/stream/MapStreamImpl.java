package notes.stream;

import java.util.stream.Stream;

public class MapStreamImpl {
	public static void main(String[] args) {
		Stream<String> sint = Stream.of("rohan", "john", "mohan", "kali", "ram");

//		sint.map(name -> name.toUpperCase()).forEach(i -> System.out.println(i));
//		sint.mapToInt(name -> name.length()).forEach(i -> System.out.println(i));

//		sint.filter(name -> name.startsWith("r")).forEach(name -> {
//			int len = name.length();
//			System.out.println(name + " " + len);
//		});

	}
}
