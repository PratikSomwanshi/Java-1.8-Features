package notes.stream;

import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialIteratorImpl {
	public static void main(String[] args) {
//		Stream<Integer> slist = Stream.of(1, 2, 3, 45, 6, 7, 8, 9);
//		Spliterator<Integer> spliterator = slist.spliterator();
//		spliterator.forEachRemaining(i -> System.out.println(i));

//		Spliterator<Integer> spliterator = slist.parallel().spliterator();
//		spliterator.forEachRemaining(i -> System.out.println(i + " " + Thread.currentThread().getName()));

//		List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

		// Get a Spliterator
//		Spliterator<String> spliterator = names.spliterator();

		// Try to split the spliterator
//		Spliterator<String> secondHalf = spliterator.trySplit();

		// Process first half
//		System.out.println("First half:");
//		spliterator.forEachRemaining(System.out::println);

		// Process second half (if it exists)
//		if (secondHalf != null) {
//			System.out.println("Second half:");
//			secondHalf.forEachRemaining(System.out::println);
//		}

		List<Integer> numbers = IntStream.range(0, 10_000_000).boxed().collect(Collectors.toList());

// Process the list using Spliterator
		Spliterator<Integer> spliterator = numbers.spliterator();

// Split the spliterator for parallel processing
		Spliterator<Integer> spliterator1 = spliterator.trySplit();
		Spliterator<Integer> spliterator2 = spliterator;

// Calculate sum of squares in parallel
		AtomicInteger sum1 = new AtomicInteger();
		AtomicInteger sum2 = new AtomicInteger();

		Thread thread1 = new Thread(() -> spliterator1.forEachRemaining(n -> sum1.addAndGet(n * n)));
		Thread thread2 = new Thread(() -> spliterator2.forEachRemaining(n -> sum2.addAndGet(n * n)));

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int totalSum = sum1.get() + sum2.get();
		System.out.println("Total Sum of Squares: " + totalSum);
	}
}
