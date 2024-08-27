package notes.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class InterviewPracticeImpl {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(1, 800000), new Employee(2, 200000), new Employee(3, 500000),
				new Employee(4, 900000));

		Double scollect = list.stream().collect(Collectors.averagingDouble(e -> e.salary));

		Optional<Employee> max = list.stream().collect(Collectors.maxBy((e1, e2) -> e1.salary - e2.salary));

		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));

		Map<Boolean, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(e -> e.salary > 300000));

		System.out.println(collect);

		System.out.println(max.get());
		System.out.println(min.get());

		System.out.println(scollect);
	}
}

class Employee {
	public int id;
	public String name;
	public int salary;

	public Employee(int id, int salary) {
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + salary;
	}
}