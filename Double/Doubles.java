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

	public static int doubleIt(int number) {
		return number * 2;
	}

	public static void main(String[] args) {
		//find the number of the first even number greater than 3
		//make it work first, then make it better very soon.
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
		System.out.println(
			values.stream()
				.filter(Doubles::isGreaterThan3)
				.filter(Doubles::isEven)
				.map(Doubles::doubleIt)
				.findFirst()
				.get()
		);
	}
}
