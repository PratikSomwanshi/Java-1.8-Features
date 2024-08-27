package notes.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PracticeStream {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "rohan", 22, 50000);
		Employee e2 = new Employee(2, "mohan", 25, 42000);
		Employee e3 = new Employee(3, "john", 30, 96000);
		Employee e4 = new Employee(4, "krushna", 35, 120000);

		Stream<Employee> s = Stream.of(e1, e2, e3, e4);

//		s.filter(e -> e.getAge() > 28).filter(e -> e.getSalary() > 100000).forEach(i -> System.out.println(i));

		List<String> back = Arrays.asList("core java", "adv java", "springboot");
		List<String> ui = Arrays.asList("html", "css", "css", "js", "react");

		List<List<String>> fullStack = Arrays.asList(back, ui);

//		fullStack.stream().forEach(course -> {
//			course.forEach(stack -> {
//				System.out.println(stack); 
//			});
//		});

		Stream<String> fmap = fullStack.stream().flatMap(courses -> courses.stream());

//		System.out.println(fmap);
//		fmap.limit(4).forEach(name -> System.out.println(name));
//		fmap.forEach(name -> System.out.println(name));
//		fmap.skip(4).forEach(name -> System.out.println(name));

//		fmap.distinct().forEach(i -> System.out.println(i));

		Optional<String> first = fmap.filter(name -> name.startsWith("h")).findFirst();

		if (first.isPresent()) {
			System.out.println(first.get());
		}
	}
}

class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;

	public Employee(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + age + " " + salary;
	}

}