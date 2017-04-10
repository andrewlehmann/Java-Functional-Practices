import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;


public class Doubles {
	public static boolean isGreaterThan3(int number) {
		return number > 3;
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		//find the number of the first even number greater than 3
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
		System.println(
			values.stream()
				.filter(Sample::isGreaterThan3)
				.filter(Sample::isEven)
				.map(e -> e * 2)
				.findFirst()
				.get()
		);
	}
}
