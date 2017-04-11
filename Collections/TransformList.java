import java.util.*;
class TransformList {
	public static void main(String[] args) {
		final List<String> friends =
			Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);

	}
}
