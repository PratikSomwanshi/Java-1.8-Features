package notes.stream;

import java.util.stream.Stream;

public class FilterStream {
	public static void main(String[] args) {
		User u1 = new User(16, "rohan");
		User u2 = new User(17, "mohan");
		User u3 = new User(35, "sundar");
		User u4 = new User(33, "jetha");
		User u5 = new User(14, "tarak");
		User u6 = new User(25, "sohan");

		Stream<User> sf = Stream.of(u1, u2, u3, u4, u5, u6);
//		sf.filter(i -> i.getAge() > 18 && i.getName().startsWith("s")).forEach(i -> System.out.println(i));
		sf.filter(i -> i.getAge() > 18).filter(i -> i.getName().startsWith("s")).forEach(i -> System.out.println(i));
	}
}

class User {
	private int age;
	private String name;

	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}
}