package notes.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerImpl {
	public static void main(String[] args) {
//		StringJoiner sj = new StringJoiner("-");
//		sj.add("rohan");
//		sj.add("somwanshi");

		StringJoiner sj = new StringJoiner("-", "(", ")");
		sj.add("rohan");
		sj.add("somwanshi");

		System.out.println(sj);

	}
}
