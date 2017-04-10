import java.util.stream.IntStream;
import java.util.function.Predicate;

// this was created following Dr. Venkat's tutorial
public class Sample {
	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
	}
	// imperative style
	private static boolean isPrimeIterative(final int number) {
		for(int i = 0; i < number; i++) {
			if(number % i == 0) return false;
		}
		return number > 1;
	}
	// functional style
	private static boolean isPrime(final int number) {
		Predicate<Integer> isDivisible = int divisor -> number % divisor == 0;

		return number > 1 &&
			IntStream.range(2, number)
				.noneMatch(index -> isDivisible(index));
	}

	}
}
